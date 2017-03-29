package dasensio.java.grupodeconsumo.dao.contact.def;

import java.util.List;

import dasensio.java.grupodeconsumo.model.contact.Contact;

public interface IContactDao {

	Contact findOne(long id);

	List<Contact> findAll();

	String findAllQuery();

	void create(Contact entity);

	Contact update(Contact entity);

	void delete(Contact entity);

	void deleteById(long entityId);
}
