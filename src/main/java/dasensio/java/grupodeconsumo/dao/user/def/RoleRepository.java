package dasensio.java.grupodeconsumo.dao.user.def;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import dasensio.java.grupodeconsumo.model.user.Role;

@RepositoryRestResource(collectionResourceRel = "role", path = "role")
public interface RoleRepository extends JpaRepository<Role, Long> {
	List<Role> findByName(@Param("name") String name);
}
