package dasensio.java.grupodeconsumo.dao.producer.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import dasensio.java.grupodeconsumo.dao.AbstractJpaDao;
import dasensio.java.grupodeconsumo.dao.producer.def.IProductDao;
import dasensio.java.grupodeconsumo.model.producer.Product;

@Repository("productDao")
public class ProductDao extends AbstractJpaDao<Product> implements IProductDao, Serializable {

	private static final long serialVersionUID = 4881507180014750865L;

	public ProductDao() {
		super();
		setClazz(Product.class);
	}
}
