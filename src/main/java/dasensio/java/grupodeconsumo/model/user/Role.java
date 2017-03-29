package dasensio.java.grupodeconsumo.model.user;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "ROLES")
@XmlRootElement
public class Role implements Serializable {

	private static final long serialVersionUID = 1246525614920888649L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;

	@Column(unique = true, nullable = false)
	@NotNull
	private String name;

	@OneToMany(fetch = FetchType.EAGER)
	private Set<Permission> permissiones;

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

	public Set<Permission> getPermissiones() {
		return permissiones;
	}

	public void setPermissiones(final Set<Permission> permissiones) {
		this.permissiones = permissiones;
	}
}
