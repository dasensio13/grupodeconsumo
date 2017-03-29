package dasensio.java.grupodeconsumo.dao.user.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import dasensio.java.grupodeconsumo.dao.AbstractJpaDao;
import dasensio.java.grupodeconsumo.dao.user.def.IUserDao;
import dasensio.java.grupodeconsumo.model.user.User;

@Repository("userDao")
public class UserDao extends AbstractJpaDao<User> implements IUserDao, Serializable {

	private static final long serialVersionUID = -9218064156142500536L;

	public UserDao() {
		super();
		setClazz(User.class);
	}
}
