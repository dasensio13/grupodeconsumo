package dasensio.java.grupodeconsumo.dao.producer.def;

import java.util.List;

import dasensio.java.grupodeconsumo.model.producer.ProductCategory;

public interface IProductCategoryDao {

	ProductCategory findOne(long id);

	List<ProductCategory> findAll();

	String findAllQuery();

	void create(ProductCategory entity);

	ProductCategory update(ProductCategory entity);

	void delete(ProductCategory entity);

	void deleteById(long entityId);
}
