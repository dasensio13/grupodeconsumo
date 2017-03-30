package dasensio.java.grupodeconsumo.model.user;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.jpa.domain.AbstractPersistable;

import dasensio.java.grupodeconsumo.model.group.Member;

@Entity
@Table(name = "USERS")
@XmlRootElement
public class User extends AbstractPersistable<Long> implements Serializable {

	private static final long serialVersionUID = 377582147790477683L;

	public User() {
		this(null);
	}

	public User(final Long id) {
		super();
		this.setId(id);
	}

	@Column(name = "NAME", unique = true, nullable = false)
	@NotNull
	private String name;

	@Column(name = "EMAIL", unique = true, nullable = false)
	@NotNull
	private String email;

	@Column(name = "PASSWORD", nullable = false)
	@NotNull
	private String password;

	@Column(name = "LOCKED", nullable = false)
	@NotNull
	private Boolean locked;

	@ManyToOne
	@JoinColumn(name = "MEMBER_ID")
	private Member member;

	@OneToMany(fetch = FetchType.EAGER)
	private Set<Role> roles;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public Boolean getLocked() {
		return locked;
	}

	public void setLocked(final Boolean locked) {
		this.locked = locked;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(final Member member) {
		this.member = member;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(final Set<Role> roles) {
		this.roles = roles;
	}
}
