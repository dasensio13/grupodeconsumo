package dasensio.java.grupodeconsumo.dao.producer.def;

import java.util.List;

import dasensio.java.grupodeconsumo.model.producer.Producer;

public interface IProducerDao {

	Producer findOne(long id);

	List<Producer> findAll();

	String findAllQuery();

	void create(Producer entity);

	Producer update(Producer entity);

	void delete(Producer entity);

	void deleteById(long entityId);
}
