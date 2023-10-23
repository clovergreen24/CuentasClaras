package dao.impl;

import clasesDAO.UsuarioDAO;

public class DAOFactory {
	public static UsuarioDAO getUsuarioDAO() {
		return new UsuarioDAOHibernateJPA();
		}
 // Retornaría los diferentes DAOs
}
