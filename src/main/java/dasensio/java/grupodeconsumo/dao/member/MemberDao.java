package dasensio.java.grupodeconsumo.dao.member;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import dasensio.java.grupodeconsumo.dao.AbstractJpaDao;
import dasensio.java.grupodeconsumo.model.member.Member;

@Repository("memberDao")
public class MemberDao extends AbstractJpaDao<Member> implements IMemberDao, Serializable {

	private static final long serialVersionUID = 5739340760832302656L;

	public MemberDao() {
		super();
		setClazz(Member.class);
	}
}
