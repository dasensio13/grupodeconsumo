package dasensio.java.grupodeconsumo.model.contact;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "CONTACTS")
@XmlRootElement
public class Contact implements Serializable {

	private static final long serialVersionUID = 3814317263705733767L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;

	@Column
	@Enumerated(EnumType.STRING)
	private ContactType contactType;

	@Column(name = "VALUE", nullable = false)
	@NotNull
	private String value;

	public long getId() {
		return id;
	}

	public void setId(final long id) {
		this.id = id;
	}

	public ContactType getContactType() {
		return contactType;
	}

	public void setContactType(final ContactType contactType) {
		this.contactType = contactType;
	}

	public String getValue() {
		return value;
	}

	public void setValue(final String value) {
		this.value = value;
	}

}
