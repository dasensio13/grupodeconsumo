package dasensio.java.grupodeconsumo.model.group;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import dasensio.java.grupodeconsumo.model.contact.Address;
import dasensio.java.grupodeconsumo.model.contact.Contact;

@Entity
@Table(name = "GROUPS")
@XmlRootElement
public class Group implements Serializable {

	private static final long serialVersionUID = 4440603081507923962L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;

	@Column(name = "NAME", nullable = false)
	@NotNull
	private String name;

	@ManyToOne
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;

	@OneToMany
	private Set<Contact> contact;

	@OneToMany(mappedBy = "group")
	private Set<Member> members;

	@OneToMany(mappedBy = "group")
	private Set<Family> families;

	public long getId() {
		return id;
	}

	public void setId(final long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Set<Member> getMembers() {
		return members;
	}

	public void setMembers(final Set<Member> members) {
		this.members = members;
	}

	public Set<Family> getFamilies() {
		return families;
	}

	public void setFamilies(final Set<Family> families) {
		this.families = families;
	}

	public Set<Contact> getContact() {
		return contact;
	}

	public void setContact(final Set<Contact> contact) {
		this.contact = contact;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(final Address address) {
		this.address = address;
	}

}
