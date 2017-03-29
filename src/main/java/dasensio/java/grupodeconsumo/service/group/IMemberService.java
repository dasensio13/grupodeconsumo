package dasensio.java.grupodeconsumo.service.group;

import java.util.List;

import dasensio.java.grupodeconsumo.model.group.Member;

public interface IMemberService {

	Member findOne(long id);

	List<Member> findAll();

	void create(Member entity);

	Member update(Member entity);

	void delete(Member entity);

	void deleteById(long entityId);
}
