package dasensio.java.grupodeconsumo.model.contact;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "ADDRESSES")
@XmlRootElement
public class Address implements Serializable {

	private static final long serialVersionUID = 5489982120519919949L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;

	@Column(name = "LINE1", nullable = false)
	@NotNull
	private String line1;

	@Column(name = "LINE2")
	private String line2;

	@Column(name = "POSTAL_CODE", nullable = false)
	@NotNull
	private String postalCode;

	@Column(name = "CITY", nullable = false)
	@NotNull
	private String city;

	@Column(name = "REGION", nullable = false)
	@NotNull
	private String region;

	@Column(name = "COUNTRY", nullable = false)
	@NotNull
	private String country;

	public long getId() {
		return id;
	}

	public void setId(final long id) {
		this.id = id;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(final String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(final String line2) {
		this.line2 = line2;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(final String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(final String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(final String region) {
		this.region = region;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(final String country) {
		this.country = country;
	}
}
