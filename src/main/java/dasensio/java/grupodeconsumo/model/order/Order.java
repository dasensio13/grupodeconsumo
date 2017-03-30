package dasensio.java.grupodeconsumo.model.order;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.jpa.domain.AbstractPersistable;

import dasensio.java.grupodeconsumo.model.group.Family;
import dasensio.java.grupodeconsumo.model.group.Group;

@Entity
@Table(name = "ORDERS")
@XmlRootElement
public class Order extends AbstractPersistable<Long> implements Serializable {

	private static final long serialVersionUID = 3137852106323840327L;

	public Order() {
		this(null);
	}

	public Order(final Long id) {
		super();
		this.setId(id);
	}

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

	@ManyToOne(optional = false)
	@JoinColumn(name = "GROUP_ID")
	private Group group;

	@ManyToOne(optional = false)
	@JoinColumn(name = "FAMILY_ID")
	private Family family;

	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<OrderLine> lines;

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(final Date orderDate) {
		this.orderDate = orderDate;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(final Double total) {
		this.total = total;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(final OrderStatus status) {
		this.status = status;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(final Group group) {
		this.group = group;
	}

	public Family getFamily() {
		return family;
	}

	public void setFamily(final Family family) {
		this.family = family;
	}

	public Set<OrderLine> getLines() {
		return lines;
	}

	public void setLines(final Set<OrderLine> lines) {
		this.lines = lines;
	}
}
