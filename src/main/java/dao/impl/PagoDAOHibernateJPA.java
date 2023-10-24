package dao.impl;

import clasesDAO.PagoDAO;
import componentes.Pago;

public class PagoDAOHibernateJPA extends GenericDAOHibernateJPA<Pago> implements PagoDAO{

	public PagoDAOHibernateJPA() {
		super(Pago.class);
		// TODO Auto-generated constructor stub
	}

}
