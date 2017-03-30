package dasensio.java.grupodeconsumo.model.order;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.jpa.domain.AbstractPersistable;

import dasensio.java.grupodeconsumo.model.producer.Product;

@Entity
@Table(name = "ORDER_LINES")
@XmlRootElement
public class OrderLine extends AbstractPersistable<Long> implements Serializable {

	private static final long serialVersionUID = 4969442884069769088L;

	public OrderLine() {
		this(null);
	}

	public OrderLine(final Long id) {
		super();
		this.setId(id);
	}

	@Column(name = "QUANTITY", nullable = false)
	@NotNull
	private Double quantity;

	@Column(name = "PRICE", nullable = false)
	@NotNull
	private Double price;

	@Column(name = "DESCRIPTION", nullable = false)
	@NotNull
	private String description;

	@Column(name = "COMMENT")
	private String comment;

	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;

	@ManyToOne
	@JoinColumn(name = "ORDER_ID")
	private Order order;

	public Double getTotal() {
		return price * quantity;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(final Double quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(final Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(final String comment) {
		this.comment = comment;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(final Product product) {
		this.product = product;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(final Order order) {
		this.order = order;
	}
}
