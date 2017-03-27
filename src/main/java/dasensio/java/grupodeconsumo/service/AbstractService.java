package dasensio.java.grupodeconsumo.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import dasensio.java.grupodeconsumo.dao.AbstractJpaDao;

@Transactional
public abstract class AbstractService<T extends Serializable> {

	protected abstract AbstractJpaDao<T> getDao();

	@Transactional(readOnly = true)
	public T findOne(final long id) {
		return getDao().findOne(id);
	}

	@Transactional(readOnly = true)
	public List<T> findAll() {
		List<T> elements = new ArrayList<>();
		elements.addAll(getDao().findAll());
		return elements;
	}

	public void create(final T entity) {
		Assert.notNull(entity, "null entity to create");
		getDao().create(entity);
	}

	public T update(final T entity) {
		Assert.notNull(entity, "null entity to update");
		return getDao().update(entity);
	}

	public void delete(final T entity) {
		Assert.notNull(entity, "null entity to delete");
		getDao().delete(entity);
	}

	public void deleteById(final long entityId) {
		final T entity = getDao().findOne(entityId);
		Assert.notNull(entity, "null entity for id " + entityId);
		getDao().deleteById(entityId);
	}

}
