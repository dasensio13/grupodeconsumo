package dasensio.java.grupodeconsumo.dao.group.def;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import dasensio.java.grupodeconsumo.model.group.Member;

@RepositoryRestResource(collectionResourceRel = "member", path = "member")
public interface MemberRepository extends JpaRepository<Member, Long> {
	List<Member> findByName(@Param("name") String name);
}
