package dao.impl;

import clasesDAO.CategoriaDAO;
import componentes.Categoria;

public class CategoriaDAOHibernateJPA extends GenericDAOHibernateJPA<Categoria> implements CategoriaDAO {

	public CategoriaDAOHibernateJPA() {
		super(Categoria.class);
		// TODO Auto-generated constructor stub
	}

}
