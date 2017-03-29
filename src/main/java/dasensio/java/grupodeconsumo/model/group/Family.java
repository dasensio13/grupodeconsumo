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
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "FAMILIES")
@XmlRootElement
public class Family implements Serializable {

	private static final long serialVersionUID = 6762849574506753664L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;

	@Column(name = "NAME")
	private String name;

	@ManyToOne
	@JoinColumn(name = "GROUP_ID")
	private Group group;

	@OneToMany(mappedBy = "family")
	private Set<Member> members;

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

	public Group getGroup() {
		return group;
	}

	public void setGroup(final Group group) {
		this.group = group;
	}

}
