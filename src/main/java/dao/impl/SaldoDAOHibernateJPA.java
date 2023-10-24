package dao.impl;

import clasesDAO.SaldoDAO;
import componentes.Saldo;

public class SaldoDAOHibernateJPA extends GenericDAOHibernateJPA<Saldo> implements SaldoDAO {

	public SaldoDAOHibernateJPA() {
		super(Saldo.class);
		// TODO Auto-generated constructor stub
	}

}
