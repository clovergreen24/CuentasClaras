package dao.impl;

import java.io.Serializable;
import java.util.List;

import clasesDAO.GenericDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

public class GenericDAOHibernateJPA<T> implements GenericDAO<T> {

	protected Class<T> clasePersistente;

	public GenericDAOHibernateJPA(Class<T> clase) {
		clasePersistente = clase;
	}
	
	public Class<T> getPersistentClass(){
		return clasePersistente;
	}

	@Override
	public T actualizar(T entity) {
		EntityManager em = EMF.getEMF().createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
		T entityMerged = em.merge(entity);
		etx.commit();
		em.close();
		return entityMerged;
	}

	@Override
	public void borrar(T entity) {
		EntityManager em = EMF.getEMF().createEntityManager();
		EntityTransaction tx = null;
		try {
			tx = em.getTransaction();
			tx.begin();
			em.remove(em.merge(entity));
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null && tx.isActive())
				tx.rollback();
			throw e; // escribir en un log o mostrar un mensaje
		} finally {
			em.close();
		}

	}  

	@Override
	public T borrar(Long id) {
		EntityManager em = EMF.getEMF().createEntityManager();
		T entity = em.find(this.getPersistentClass(), id);
		if (entity != null) {
			em.remove(entity);
		}
		em.close();
		return entity;
	}

	@Override
	public boolean existe(Long id) {
		EntityManager em = EMF.getEMF().createEntityManager();
		T entity = em.find(this.getPersistentClass(), id);
		if (entity != null) {
			return true;
		}
		return false;
	}

	@Override
	public T persistir(T entity) {
		EntityManager em = EMF.getEMF().createEntityManager();
		EntityTransaction tx = null;
		try {
			tx = em.getTransaction();
			tx.begin();
			em.persist(entity);
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null && tx.isActive())
				tx.rollback();
			throw e; // escribir en un log o mostrar un mensaje
		} finally {
			em.close();
		}
		return entity;
	}

	@Override
	public T recuperar(Long id) {
		EntityManager em = EMF.getEMF().createEntityManager();
		T resultado = em.find(this.getPersistentClass(), id);
		return resultado;
	}

	@Override
	public List<T> recuperarTodos(String column) {
		Query consulta = EMF.getEMF().createEntityManager()
				.createQuery("select e from " + getPersistentClass().getSimpleName() + " e order by e." + column);
		List<T> resultado = (List<T>) consulta.getResultList();
		return resultado;
	}
}
