package dasensio.java.grupodeconsumo.dao.user.def;

import java.util.List;

import dasensio.java.grupodeconsumo.model.user.User;

public interface IUserDao {

	User findOne(long id);

	List<User> findAll();

	String findAllQuery();

	void create(User entity);

	User update(User entity);

	void delete(User entity);

	void deleteById(long entityId);
}
