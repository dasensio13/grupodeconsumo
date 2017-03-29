package dasensio.java.grupodeconsumo.dao.group.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import dasensio.java.grupodeconsumo.dao.AbstractJpaDao;
import dasensio.java.grupodeconsumo.dao.group.def.IFamilyDao;
import dasensio.java.grupodeconsumo.model.group.Family;

@Repository("familyDao")
public class FamilyDao extends AbstractJpaDao<Family> implements IFamilyDao, Serializable {

	private static final long serialVersionUID = -2166940757598818748L;

	public FamilyDao() {
		super();
		setClazz(Family.class);
	}
}
