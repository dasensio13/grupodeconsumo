package dasensio.java.grupodeconsumo.dao.producer.def;

import java.util.List;

import dasensio.java.grupodeconsumo.model.producer.Product;

public interface IProductDao {

	Product findOne(long id);

	List<Product> findAll();

	String findAllQuery();

	void create(Product entity);

	Product update(Product entity);

	void delete(Product entity);

	void deleteById(long entityId);
}
