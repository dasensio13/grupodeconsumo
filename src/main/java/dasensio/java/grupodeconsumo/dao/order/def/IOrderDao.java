package dasensio.java.grupodeconsumo.dao.order.def;

import java.util.List;

import dasensio.java.grupodeconsumo.model.order.Order;

public interface IOrderDao {

	Order findOne(long id);

	List<Order> findAll();

	String findAllQuery();

	void create(Order entity);

	Order update(Order entity);

	void delete(Order entity);

	void deleteById(long entityId);
}
