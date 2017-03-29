package dasensio.java.grupodeconsumo.dao.contact.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import dasensio.java.grupodeconsumo.dao.AbstractJpaDao;
import dasensio.java.grupodeconsumo.dao.contact.def.IContactDao;
import dasensio.java.grupodeconsumo.model.contact.Contact;

@Repository("contactDao")
public class ContactDao extends AbstractJpaDao<Contact> implements IContactDao, Serializable {

	private static final long serialVersionUID = 5670147899935529807L;

	public ContactDao() {
		super();
		setClazz(Contact.class);
	}
}
