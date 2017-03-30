package dasensio.java.grupodeconsumo.dao.group.def;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import dasensio.java.grupodeconsumo.model.group.Family;

@RepositoryRestResource(collectionResourceRel = "family", path = "family")
public interface FamilyRepository extends JpaRepository<Family, Long> {
	List<Family> findByName(@Param("name") String name);
}
