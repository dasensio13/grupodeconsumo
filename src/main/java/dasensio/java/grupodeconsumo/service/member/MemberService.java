package dasensio.java.grupodeconsumo.service.member;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dasensio.java.grupodeconsumo.dao.AbstractJpaDao;
import dasensio.java.grupodeconsumo.dao.member.MemberDao;
import dasensio.java.grupodeconsumo.model.member.Member;
import dasensio.java.grupodeconsumo.service.AbstractService;

@Service("memberService")
public class MemberService extends AbstractService<Member> implements IMemberService, Serializable {

	private static final long serialVersionUID = 5516088141005873253L;

	@Autowired
	private MemberDao memberDao;

	public MemberService() {
		super();
	}

	@Override
	protected AbstractJpaDao<Member> getDao() {
		return memberDao;
	}

}
