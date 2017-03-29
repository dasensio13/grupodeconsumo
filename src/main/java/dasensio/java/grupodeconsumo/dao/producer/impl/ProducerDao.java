package dasensio.java.grupodeconsumo.dao.producer.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import dasensio.java.grupodeconsumo.dao.AbstractJpaDao;
import dasensio.java.grupodeconsumo.dao.producer.def.IProducerDao;
import dasensio.java.grupodeconsumo.model.producer.Producer;

@Repository("producerDao")
public class ProducerDao extends AbstractJpaDao<Producer> implements IProducerDao, Serializable {

	private static final long serialVersionUID = -3915246069076533393L;

	public ProducerDao() {
		super();
		setClazz(Producer.class);
	}
}
