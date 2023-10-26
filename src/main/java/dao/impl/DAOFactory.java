package dao.impl;

import clasesDAO.CategoriaDAO;
import clasesDAO.GastoDAO;
import clasesDAO.GrupoDAO;
import clasesDAO.PagoDAO;
import clasesDAO.SaldoDAO;
import clasesDAO.UsuarioDAO;

public class DAOFactory {
	
	public static UsuarioDAO getUsuarioDAO() {
		return new UsuarioDAOHibernateJPA();
		}
	public static CategoriaDAO getCategoriaDAO() {
	  return new CategoriaDAOHibernateJPA();
	}
	public static GastoDAO getGastoDAO() {
		return new GastoDAOHibernateJPA();
	}
	
	public static GrupoDAO getGrupoDAO() {
		return new GrupoDAOHibernateJPA();
	}
	
	public static PagoDAO getPagoDAO() {
		return new PagoDAOHibernateJPA();
	}
	
	public static SaldoDAO getSaldooDAO() {
		return new SaldoDAOHibernateJPA();
	}

}
  