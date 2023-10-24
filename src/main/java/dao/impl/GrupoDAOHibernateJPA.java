package dao.impl;

import clasesDAO.GrupoDAO;
import componentes.Grupo;

public class GrupoDAOHibernateJPA extends GenericDAOHibernateJPA<Grupo> implements GrupoDAO {

	public GrupoDAOHibernateJPA() {
		super(Grupo.class);
		// TODO Auto-generated constructor stub
	}

}
