package dao.impl;

import clasesDAO.UsuarioDAO;

public class DAOFactory {
	public static UsuarioDAO getUsuarioDAO() {
		return new UsuarioDAOHibernateJPA();
		}
 // Retornarķa los diferentes DAOs
}
  