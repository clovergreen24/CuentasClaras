package daoHibernateJPA;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import componentes.Gasto;
import componentes.Grupo;
import componentes.Pago;
import componentes.Saldo;
import componentes.Usuario;

public class UsuarioDAOHibernateJPATest {
	
@Test
public void testCrearUsuario() {
	List<Grupo> grupos1 = new ArrayList<>();
	List<Pago> pagos1 = new ArrayList<>();
	List<Gasto> gastos1 = new ArrayList<>();
	List<Usuario> amigos1 = new ArrayList<>();
	List<Saldo> saldos1 = new ArrayList<>();
	
	List<Grupo> grupos2 = new ArrayList<>();
	List<Pago> pagos2 = new ArrayList<>(); 
	List<Gasto> gastos2 = new ArrayList<>();
	List<Usuario> amigos2 = new ArrayList<>();
	List<Saldo> saldos2 = new ArrayList<>();
	
	final Usuario usr1= new Usuario(1L, "clovergreen", "Camilo", "contraseña1", "cobeagac@gmail.com", "ruta/foto1.jpg", grupos1, pagos1, gastos1, amigos1, saldos1);
	final Usuario usr2= new Usuario(2L, "Mana", "Mariana", "contraseña2", "keimmariana@gmail.com", "ruta/foto2.jpg", grupos2, pagos2, gastos2, amigos2, saldos2);
}
}
