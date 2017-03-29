package dasensio.java.grupodeconsumo.dao.user.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import dasensio.java.grupodeconsumo.dao.AbstractJpaDao;
import dasensio.java.grupodeconsumo.dao.user.def.IRoleDao;
import dasensio.java.grupodeconsumo.model.user.Role;

@Repository("roleDao")
public class RoleDao extends AbstractJpaDao<Role> implements IRoleDao, Serializable {

	private static final long serialVersionUID = -6929772730115422738L;

	public RoleDao() {
		super();
		setClazz(Role.class);
	}
}
