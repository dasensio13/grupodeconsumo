package dasensio.java.grupodeconsumo.dao.producer.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import dasensio.java.grupodeconsumo.dao.AbstractJpaDao;
import dasensio.java.grupodeconsumo.dao.producer.def.IProductCategoryDao;
import dasensio.java.grupodeconsumo.model.producer.ProductCategory;

@Repository("productCategoryDao")
public class ProductCategoryDao extends AbstractJpaDao<ProductCategory> implements IProductCategoryDao, Serializable {

	private static final long serialVersionUID = 3338909033924440941L;

	public ProductCategoryDao() {
		super();
		setClazz(ProductCategory.class);
	}
}
