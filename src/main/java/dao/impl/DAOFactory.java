package dao.impl;

import clasesDAO.UsuarioDAO;

public class DAOFactory {
	public static UsuarioDAO getUsuarioDAO() {
		return new UsuarioDAOHibernateJPA();
		}
 // Retornar�a los diferentes DAOs
}
