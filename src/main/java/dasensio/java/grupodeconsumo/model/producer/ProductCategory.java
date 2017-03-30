package dasensio.java.grupodeconsumo.model.producer;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "PRODUCT_CATEGORIES")
@XmlRootElement
public class ProductCategory extends AbstractPersistable<Long> implements Serializable {

	private static final long serialVersionUID = -7320532557731602254L;

	public ProductCategory() {
		this(null);
	}

	public ProductCategory(final Long id) {
		super();
		this.setId(id);
	}

	@Column(name = "NAME", unique = true, nullable = false)
	@NotNull
	private String name;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

}
