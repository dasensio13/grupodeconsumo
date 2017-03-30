package dasensio.java.grupodeconsumo.model.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "PERMISSIONS")
@XmlRootElement
public class Permission extends AbstractPersistable<Long> implements Serializable {

	private static final long serialVersionUID = -4953803672767728134L;

	public Permission() {
		this(null);
	}

	public Permission(final Long id) {
		super();
		this.setId(id);
	}

	@Column(name = "name", unique = true, nullable = false)
	@NotNull
	private String name;

	@Column(name = "DESCRIPTION", unique = false, nullable = true)
	@NotNull
	private String description;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}
}
