package dasensio.java.grupodeconsumo.model.group;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "FAMILIES")
@XmlRootElement
public class Family extends AbstractPersistable<Long> implements Serializable {

	private static final long serialVersionUID = 6762849574506753664L;

	public Family() {
		this(null);
	}

	public Family(final Long id) {
		super();
		this.setId(id);
	}

	@Column(name = "NAME")
	private String name;

	@ManyToOne
	@JoinColumn(name = "GROUP_ID")
	private Group group;

	@OneToMany(mappedBy = "family")
	private Set<Member> members;

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
