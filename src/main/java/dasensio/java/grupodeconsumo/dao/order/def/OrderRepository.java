package dasensio.java.grupodeconsumo.dao.order.def;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import dasensio.java.grupodeconsumo.model.group.Family;
import dasensio.java.grupodeconsumo.model.order.Order;

@RepositoryRestResource(collectionResourceRel = "order", path = "order")
public interface OrderRepository extends JpaRepository<Order, Long> {
	List<Order> findByFamily(@Param("family") Family family);
}
