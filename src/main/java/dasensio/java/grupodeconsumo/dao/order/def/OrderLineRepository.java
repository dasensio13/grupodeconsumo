package dasensio.java.grupodeconsumo.dao.order.def;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import dasensio.java.grupodeconsumo.model.order.Order;
import dasensio.java.grupodeconsumo.model.order.OrderLine;

@RepositoryRestResource(collectionResourceRel = "orderline", path = "orderline")
public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {
	List<OrderLine> findByOrder(@Param("order") Order order);
}
