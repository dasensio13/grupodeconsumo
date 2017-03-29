package dasensio.java.grupodeconsumo.dao.group.def;

import java.util.List;

import dasensio.java.grupodeconsumo.model.group.Member;

public interface IMemberDao {

	Member findOne(long id);

	List<Member> findAll();

	String findAllQuery();

	void create(Member entity);

	Member update(Member entity);

	void delete(Member entity);

	void deleteById(long entityId);
}
