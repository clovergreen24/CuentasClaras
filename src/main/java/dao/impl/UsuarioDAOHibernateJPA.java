package dao.impl;

import clasesDAO.UsuarioDAO;
import componentes.Usuario;

public class UsuarioDAOHibernateJPA extends GenericDAOHibernateJPA<Usuario> implements UsuarioDAO {
	public UsuarioDAOHibernateJPA() {
		super(Usuario.class);
	}
}
  