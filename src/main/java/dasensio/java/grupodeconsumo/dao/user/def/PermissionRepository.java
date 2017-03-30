package dasensio.java.grupodeconsumo.dao.user.def;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import dasensio.java.grupodeconsumo.model.user.Permission;

@RepositoryRestResource(collectionResourceRel = "permission", path = "permission")
public interface PermissionRepository extends JpaRepository<Permission, Long> {
	List<Permission> findByName(@Param("name") String name);
}
