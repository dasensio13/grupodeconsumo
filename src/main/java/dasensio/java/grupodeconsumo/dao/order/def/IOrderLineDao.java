package dasensio.java.grupodeconsumo.dao.order.def;

import java.util.List;

import dasensio.java.grupodeconsumo.model.order.OrderLine;

public interface IOrderLineDao {

	OrderLine findOne(long id);

	List<OrderLine> findAll();

	String findAllQuery();

	void create(OrderLine entity);

	OrderLine update(OrderLine entity);

	void delete(OrderLine entity);

	void deleteById(long entityId);
}
