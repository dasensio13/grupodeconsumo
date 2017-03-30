package dasensio.java.grupodeconsumo.dao.group.def;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import dasensio.java.grupodeconsumo.model.group.Group;

@RepositoryRestResource(collectionResourceRel = "group", path = "group")
public interface GroupRepository extends JpaRepository<Group, Long> {
	List<Group> findByName(@Param("name") String name);
}
