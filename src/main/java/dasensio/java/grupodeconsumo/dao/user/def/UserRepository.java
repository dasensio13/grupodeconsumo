package dasensio.java.grupodeconsumo.dao.user.def;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import dasensio.java.grupodeconsumo.model.user.User;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findByName(@Param("name") String name);
}
