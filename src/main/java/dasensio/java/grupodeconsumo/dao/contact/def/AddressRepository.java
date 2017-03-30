package dasensio.java.grupodeconsumo.dao.contact.def;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import dasensio.java.grupodeconsumo.model.contact.Address;
import dasensio.java.grupodeconsumo.model.contact.Contact;

@RepositoryRestResource(collectionResourceRel = "address", path = "address")
public interface AddressRepository extends JpaRepository<Address, Long> {
	List<Contact> findByCountry(@Param("country") String country);
}
