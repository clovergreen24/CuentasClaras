package daoHibernateJPA;

import org.junit.jupiter.api.Test;

import componentes.Categoria;
import componentes.Gasto;
import componentes.Grupo;
import componentes.Pago;
import componentes.Saldo;
import componentes.Usuario;
import dao.impl.DAOFactory;
import dao.impl.GenericDAOHibernateJPA;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;

public class GrupoDAOHibernateJPATest {
	@SuppressWarnings("unchecked")
	private GenericDAOHibernateJPA<Grupo> grupo = (GenericDAOHibernateJPA<Grupo>) DAOFactory.getGrupoDAO();
	@SuppressWarnings("unchecked")
	private GenericDAOHibernateJPA<Categoria> categoria = (GenericDAOHibernateJPA<Categoria>) DAOFactory
			.getCategoriaDAO();
	@SuppressWarnings("unchecked")
	private GenericDAOHibernateJPA<Usuario> usuario = (GenericDAOHibernateJPA<Usuario>) DAOFactory.getUsuarioDAO();
	private Usuario u;
	private Grupo g;

	@Test
	public void testCrearGrupo() {
		List<Saldo> saldos = new ArrayList<>();
		//en grupo a integrantes le puse el @JoinTable para visualizar la tabla
		List<Usuario> integrantes = new ArrayList<>();
		List<Gasto> gastos = new ArrayList<>();
		List<Pago> pagos = new ArrayList<>();

		Categoria cat = new Categoria("Viaje", "ruta/fotoC.jpg"); // estara bien persistir aca la categoria ?
		categoria.persistir(cat);
   
		//integrantes ya deberia tener un usuario que es el que crea el grupo
		u = usuario.recuperar((long)2);
		integrantes.add(u);
		
		Grupo gr1 = new Grupo("Viaje a LP", "ruta/fotoG1.jpg", cat, saldos, integrantes, gastos, pagos);
		grupo.persistir(gr1);
        
		u.getGrupos().add(gr1);
		usuario.actualizar(u);
		
		Assertions.assertEquals(1, grupo.recuperarTodos("nombre").size());
	}

	@Test
	public void testActualizarGrupo() {
		g = grupo.recuperar((long) 2);
		g.setNombre("Viaje a otro lado");
		grupo.actualizar(g);
		Assertions.assertEquals("Viaje a otro lado", grupo.recuperar((long) 2).getNombre());
	}

	@Test
	public void testBorrarGrupoConEntidad() {
		grupo.borrar(grupo.recuperar((long) 2));
		Assertions.assertFalse(grupo.existe((long) 2));
	}

	@Test
	public void testBorrarGrupoConId() {
		grupo.borrar(grupo.recuperar((long) 3));
		Assertions.assertFalse(grupo.existe((long) 3));
	}
	
	@Test
	public void testRecuperarGrupoConId() {
		Assertions.assertEquals("Viaje a LP", grupo.recuperar((long) 1).getNombre());
	}
	
	@Test
	public void testRecuperarTodos() {
		Assertions.assertEquals(1, grupo.recuperarTodos("nombre").size());	
	}
	
	@Test
	public void testExisteGrupo() {
		Assertions.assertEquals(true,grupo.existe((long) 1));
	}
}
