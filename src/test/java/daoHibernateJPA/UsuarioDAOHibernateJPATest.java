package daoHibernateJPA;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import componentes.Gasto;
import componentes.Grupo;
import componentes.Pago;
import componentes.Saldo;
import componentes.Usuario;
import dao.impl.DAOFactory;
import dao.impl.GenericDAOHibernateJPA;


public class UsuarioDAOHibernateJPATest {
	
	@SuppressWarnings("unchecked")
	private GenericDAOHibernateJPA<Usuario> usuario = (GenericDAOHibernateJPA<Usuario>) DAOFactory.getUsuarioDAO();
	private Usuario u;
	
@Test
public void testCrearUsuario() {
	List<Grupo> grupos = new ArrayList<>();
	List<Pago> pagos = new ArrayList<>();
	List<Gasto> gastos = new ArrayList<>();
	List<Usuario> amigos = new ArrayList<>();
	List<Saldo> saldos = new ArrayList<>();
	
	
	Usuario usr1= new Usuario("clovergreen", "Camilo", "contrasenia1", "cobeagac@gmail.com", "ruta/foto1.jpg", grupos, pagos, gastos, amigos, saldos);
	Usuario usr2= new Usuario("Mana", "Mariana", "contrasenia2", "keimmariana@gmail.com", "ruta/foto2.jpg", grupos, pagos, gastos, amigos, saldos);

	
	usuario.persistir(usr1);
	usuario.persistir(usr2);	

	Assertions.assertEquals(6, usuario.recuperarTodos("nombre").size());
}
@Test
public void testActualizarUsuario() {
		u = usuario.recuperar((long) 1);
		u.setNombre("Link");
		usuario.actualizar(u);
		Assertions.assertEquals("Link",usuario.recuperar((long) 1).getNombre());
}

	@Test
	public void testBorrarUsuarioConEntidad(){
		u = usuario.recuperar((long) 4);
		usuario.borrar(u);
		Assertions.assertFalse(usuario.existe((long)4));
	}
	
	@Test
	public void testBorrarUsuarioConId(){
		u = usuario.recuperar((long) 5);
		usuario.borrar((long)5);
		Assertions.assertFalse(usuario.existe((long)5));
	}
	
	@Test
	public void testRecuperarUsuarioConId() {
		List<Grupo> grupos = new ArrayList<>();
		List<Pago> pagos = new ArrayList<>();
		List<Gasto> gastos = new ArrayList<>();
		List<Usuario> amigos = new ArrayList<>();
		List<Saldo> saldos = new ArrayList<>();
		
		Usuario usr1= new Usuario("pepe", "Pepe", "contra", "pepe@gmail.com", "ruta/fotoPepe.jpg", grupos, pagos, gastos, amigos, saldos);
		usr1=usuario.persistir(usr1);
		Assertions.assertEquals("pepe", usuario.recuperar(usr1.getIdUsuario()).getUsuario());
	
	}
	@Test
	public void testRecuperarTodos() {//TERMINAR
		List<Grupo> grupos = new ArrayList<>();
		List<Pago> pagos = new ArrayList<>();
		List<Gasto> gastos = new ArrayList<>();
		List<Usuario> amigos = new ArrayList<>();
		List<Saldo> saldos = new ArrayList<>();
		
		Assertions.assertEquals(5, usuario.recuperarTodos("nombre").size());
	
	}
	
	@Test
	public void testExisteUsuario() {//TERMINAR
		Assertions.assertEquals(true,usuario.existe((long) 7));
	}
}