package dasensio.java.grupodeconsumo.model.order;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import dasensio.java.grupodeconsumo.model.producer.Product;

@Entity
@Table(name = "ORDER_LINES")
@XmlRootElement
public class OrderLine implements Serializable {

	private static final long serialVersionUID = 4969442884069769088L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;

	@Column(name = "QUANTITY", nullable = false)
	@NotNull
	private Double quantity;

	@Column(name = "DESCRIPTION", nullable = false)
	@NotNull
	private String description;

	@Column(name = "SUBTOTAL", nullable = false)
	@NotNull
	private Double subtotal;

	@Column(name = "COMMENT")
	private String comment;

	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;

	@ManyToOne
	@JoinColumn(name = "ORDER_ID")
	private Order order;
}
