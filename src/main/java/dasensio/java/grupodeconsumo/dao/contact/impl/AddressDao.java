package dasensio.java.grupodeconsumo.dao.contact.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import dasensio.java.grupodeconsumo.dao.AbstractJpaDao;
import dasensio.java.grupodeconsumo.dao.contact.def.IAddressDao;
import dasensio.java.grupodeconsumo.model.contact.Address;

@Repository("addressDao")
public class AddressDao extends AbstractJpaDao<Address> implements IAddressDao, Serializable {

	private static final long serialVersionUID = -2141894668250518914L;

	public AddressDao() {
		super();
		setClazz(Address.class);
	}
}
