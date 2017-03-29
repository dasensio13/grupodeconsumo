package dasensio.java.grupodeconsumo.model.producer;

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
import dasensio.java.grupodeconsumo.model.group.Group;

@Entity
@Table(name = "PRODUCERS")
@XmlRootElement
public class Producer implements Serializable {

	private static final long serialVersionUID = 3041422112301772731L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;

	@Column(name = "NAME", nullable = false)
	@NotNull
	private String name;

	@Column(name = "DESCRIPTION")
	private String description;

	@ManyToOne
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;

	@OneToMany
	private Set<Group> group;

	@OneToMany
	private Set<Contact> contact;

	@OneToMany(mappedBy = "producer")
	private Set<Product> product;

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

	public Set<Group> getGroup() {
		return group;
	}

	public void setGroup(final Set<Group> group) {
		this.group = group;
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

	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(final Set<Product> product) {
		this.product = product;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

}
