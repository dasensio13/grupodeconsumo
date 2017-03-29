package dasensio.java.grupodeconsumo.dao.group.def;

import java.util.List;

import dasensio.java.grupodeconsumo.model.group.Group;

public interface IGroupDao {

	Group findOne(long id);

	List<Group> findAll();

	String findAllQuery();

	void create(Group entity);

	Group update(Group entity);

	void delete(Group entity);

	void deleteById(long entityId);
}
