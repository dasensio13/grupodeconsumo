package dasensio.java.grupodeconsumo.model.contact;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "CONTACTS")
@XmlRootElement
public class Contact extends AbstractPersistable<Long> implements Serializable {

	private static final long serialVersionUID = 3814317263705733767L;

	public Contact() {
		this(null);
	}

	public Contact(final Long id) {
		super();
		this.setId(id);
	}

	@Column
	@Enumerated(EnumType.STRING)
	private ContactType contactType;

	@Column(name = "VALUE", nullable = false)
	@NotNull
	private String value;

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
