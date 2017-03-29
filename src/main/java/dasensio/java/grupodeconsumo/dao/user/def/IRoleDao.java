package dasensio.java.grupodeconsumo.dao.user.def;

import java.util.List;

import dasensio.java.grupodeconsumo.model.user.Role;

public interface IRoleDao {

	Role findOne(long id);

	List<Role> findAll();

	String findAllQuery();

	void create(Role entity);

	Role update(Role entity);

	void delete(Role entity);

	void deleteById(long entityId);
}
