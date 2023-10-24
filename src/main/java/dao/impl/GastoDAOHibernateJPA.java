package dao.impl;

import clasesDAO.GastoDAO;
import componentes.Gasto;

public class GastoDAOHibernateJPA extends GenericDAOHibernateJPA<Gasto> implements GastoDAO{

	public GastoDAOHibernateJPA() {
		super(Gasto.class);
		// TODO Auto-generated constructor stub
	}

}
