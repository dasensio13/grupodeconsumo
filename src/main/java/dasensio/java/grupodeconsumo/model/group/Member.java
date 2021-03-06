package dasensio.java.grupodeconsumo.model.group;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.jpa.domain.AbstractPersistable;

import dasensio.java.grupodeconsumo.model.contact.Address;
import dasensio.java.grupodeconsumo.model.contact.Contact;

@Entity
@Table(name = "MEMBERS")
@XmlRootElement
public class Member extends AbstractPersistable<Long> implements Serializable {

	private static final long serialVersionUID = 5527411118611246968L;

	public Member() {
		this(null);
	}

	public Member(final Long id) {
		super();
		this.setId(id);
	}

	@Column(name = "NAME", nullable = false)
	@NotNull
	private String name;

	@Column(name = "STATUS")
	@Enumerated(EnumType.STRING)
	private MemberStatus status;

	@ManyToOne
	@JoinColumn(name = "FAMILY_ID")
	private Family family;

	@ManyToOne
	@JoinColumn(name = "GROUP_ID")
	private Group group;

	@ManyToOne
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;

	@OneToMany
	private Set<Contact> contact;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Family getFamily() {
		return family;
	}

	public void setFamily(final Family family) {
		this.family = family;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(final Group group) {
		this.group = group;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(final Address address) {
		this.address = address;
	}

	public Set<Contact> getContact() {
		return contact;
	}

	public void setContact(final Set<Contact> contact) {
		this.contact = contact;
	}

}
