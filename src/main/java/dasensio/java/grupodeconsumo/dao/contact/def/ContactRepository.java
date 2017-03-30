package dasensio.java.grupodeconsumo.dao.contact.def;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import dasensio.java.grupodeconsumo.model.contact.Contact;

@RepositoryRestResource(collectionResourceRel = "contact", path = "contact")
public interface ContactRepository extends JpaRepository<Contact, Long> {
	List<Contact> findByValue(@Param("value") String value);
}
