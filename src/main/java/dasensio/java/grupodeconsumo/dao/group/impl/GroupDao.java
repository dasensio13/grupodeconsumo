package dasensio.java.grupodeconsumo.dao.group.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import dasensio.java.grupodeconsumo.dao.AbstractJpaDao;
import dasensio.java.grupodeconsumo.dao.group.def.IGroupDao;
import dasensio.java.grupodeconsumo.model.group.Group;

@Repository("groupDao")
public class GroupDao extends AbstractJpaDao<Group> implements IGroupDao, Serializable {

	private static final long serialVersionUID = -5939776805230556561L;

	public GroupDao() {
		super();
		setClazz(Group.class);
	}
}
