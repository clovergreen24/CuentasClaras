package daoHibernateJPA;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import componentes.Categoria;
import componentes.Gasto;
import componentes.Grupo;
import componentes.Saldo;
import componentes.Usuario;
import dao.impl.DAOFactory;
import dao.impl.GenericDAOHibernateJPA;

public class GastoDAOHibernateJPATest {
	@SuppressWarnings("unchecked")
	private GenericDAOHibernateJPA<Gasto> gasto = (GenericDAOHibernateJPA<Gasto>) DAOFactory.getGastoDAO();
	@SuppressWarnings("unchecked")
	private GenericDAOHibernateJPA<Usuario> usuario = (GenericDAOHibernateJPA<Usuario>) DAOFactory.getUsuarioDAO();
	@SuppressWarnings("unchecked")
	private GenericDAOHibernateJPA<Categoria> categoria = (GenericDAOHibernateJPA<Categoria>) DAOFactory
			.getCategoriaDAO();
	private Usuario u;
	private Gasto g;
	
	
	@Test
	public void testCrearGasto() {
		List<Saldo> saldos = new ArrayList<>();
		Grupo grupo = new Grupo();
		Calendar hoy = Calendar.getInstance();
		BigDecimal monto = new BigDecimal(300);
		Integer tipoDivision = 1;
	

		Categoria cat = new Categoria("Combustible", "ruta/fotoCena.jpg"); // estara bien persistir aca la categoria ?
		categoria.persistir(cat);
   
		//usuario que crea el gasto
		u = usuario.recuperar((long)2);
				
		Gasto g1 = new Gasto(monto, hoy, tipoDivision, cat, grupo, u, saldos, "ruta/fotoGasto1.jpg");
		gasto.persistir(g1);
		
		u.getGastos().add(g1);
		usuario.actualizar(u);
		
		Assertions.assertEquals(1, gasto.recuperarTodos("imagen").size());
	}
	
	@Test
	public void testActualizarGasto() {
		g = gasto.recuperar((long) 1);
		g.setTipoDivision(2);
		gasto.actualizar(g);
		Assertions.assertEquals(2, g.getTipoDivision());
	}
	
}
