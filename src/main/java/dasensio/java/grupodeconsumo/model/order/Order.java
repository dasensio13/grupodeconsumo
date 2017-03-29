package dasensio.java.grupodeconsumo.model.order;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import dasensio.java.grupodeconsumo.model.group.Family;
import dasensio.java.grupodeconsumo.model.group.Group;

@Entity
@Table(name = "ORDERS")
@XmlRootElement
public class Order implements Serializable {

	private static final long serialVersionUID = 3137852106323840327L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;

	@Column(name = "ORDER_DATE", nullable = false)
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDate;

	@Column(name = "TOTAL", nullable = false)
	@NotNull
	private Double total;

	@Column(name = "STATUS")
	@Enumerated(EnumType.STRING)
	private OrderStatus status;

	@ManyToOne
	@JoinColumn(name = "GROUP_ID")
	private Group group;

	@ManyToOne
	@JoinColumn(name = "FAMILY_ID")
	private Family family;

	@OneToMany(mappedBy = "order")
	private Set<OrderLine> lines;
}
