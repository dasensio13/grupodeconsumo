package dasensio.java.grupodeconsumo.dao.producer.def;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import dasensio.java.grupodeconsumo.model.producer.ProductCategory;

@RepositoryRestResource(collectionResourceRel = "productcategory", path = "productcategory")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
	List<ProductCategory> findByName(@Param("name") String name);
}
