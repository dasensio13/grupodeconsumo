package dasensio.java.grupodeconsumo.dao.order.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import dasensio.java.grupodeconsumo.dao.AbstractJpaDao;
import dasensio.java.grupodeconsumo.dao.order.def.IOrderDao;
import dasensio.java.grupodeconsumo.model.order.Order;

@Repository("orderDao")
public class OrderDao extends AbstractJpaDao<Order> implements IOrderDao, Serializable {

	private static final long serialVersionUID = -7257423156518177832L;

	public OrderDao() {
		super();
		setClazz(Order.class);
	}
}
