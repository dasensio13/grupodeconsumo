package dasensio.java.grupodeconsumo.dao.contact.def;

import java.util.List;

import dasensio.java.grupodeconsumo.model.contact.Address;

public interface IAddressDao {

	Address findOne(long id);

	List<Address> findAll();

	String findAllQuery();

	void create(Address entity);

	Address update(Address entity);

	void delete(Address entity);

	void deleteById(long entityId);
}
