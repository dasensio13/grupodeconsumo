package dasensio.java.grupodeconsumo.rest;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dasensio.java.grupodeconsumo.model.member.Member;

@RestController
public class MemberController implements Serializable {

	private static final long serialVersionUID = 9062971634144307713L;

	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/member")
	public Member member(@RequestParam(value = "name", defaultValue = "David") final String name) {
		Member member = new Member();
		member.setId(counter.incrementAndGet());
		member.setName(name);
		return member;
	}
}
