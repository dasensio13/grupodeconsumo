package dasensio.java.grupodeconsumo.dao.user.def;

import java.util.List;

import dasensio.java.grupodeconsumo.model.user.Permission;

public interface IPermissionDao {

	Permission findOne(long id);

	List<Permission> findAll();

	String findAllQuery();

	void create(Permission entity);

	Permission update(Permission entity);

	void delete(Permission entity);

	void deleteById(long entityId);
}
