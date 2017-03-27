package dasensio.java.grupodeconsumo.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractJpaDao<T extends Serializable> {

	private static final String FROM = "FROM ";

	private Class<T> clazz;

	@PersistenceContext
	EntityManager entityManager;

	public final void setClazz(final Class<T> clazzToSet) {
		this.clazz = clazzToSet;
	}

	public T findOne(final long id) {
		return entityManager.find(clazz, id);
	}

	public List<T> findAll() {
		return entityManager.createQuery(findAllQuery(), clazz).getResultList();
	}

	public String findAllQuery() {
		return new StringBuilder().append(FROM).append(clazz.getName()).toString();
	}

	public void create(final T entity) {
		entityManager.persist(entity);
	}

	public T update(final T entity) {
		return entityManager.merge(entity);
	}

	public void delete(final T entity) {
		entityManager.remove(entity);
	}

	public void deleteById(final long entityId) {
		T entity = findOne(entityId);
		delete(entity);
	}
}
