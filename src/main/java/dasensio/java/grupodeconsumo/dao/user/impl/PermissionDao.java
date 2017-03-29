package dasensio.java.grupodeconsumo.dao.user.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import dasensio.java.grupodeconsumo.dao.AbstractJpaDao;
import dasensio.java.grupodeconsumo.dao.user.def.IPermissionDao;
import dasensio.java.grupodeconsumo.model.user.Permission;

@Repository("permissionDao")
public class PermissionDao extends AbstractJpaDao<Permission> implements IPermissionDao, Serializable {

	private static final long serialVersionUID = 8575303173646500531L;

	public PermissionDao() {
		super();
		setClazz(Permission.class);
	}
}
