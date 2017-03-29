package dasensio.java.grupodeconsumo.dao.order.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import dasensio.java.grupodeconsumo.dao.AbstractJpaDao;
import dasensio.java.grupodeconsumo.dao.order.def.IOrderLineDao;
import dasensio.java.grupodeconsumo.model.order.OrderLine;

@Repository("orderLineDao")
public class OrderLineDao extends AbstractJpaDao<OrderLine> implements IOrderLineDao, Serializable {

	private static final long serialVersionUID = -3836961058791742865L;

	public OrderLineDao() {
		super();
		setClazz(OrderLine.class);
	}
}
