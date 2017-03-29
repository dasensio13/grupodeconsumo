package dasensio.java.grupodeconsumo.model.producer;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "PRODUCTS")
@XmlRootElement
public class Product implements Serializable {

	private static final long serialVersionUID = 4760914927379700011L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;

	@Column(name = "NAME", nullable = false)
	@NotNull
	private String name;

	@Column(name = "VALUE", nullable = false)
	@NotNull
	private Float value;

	@Column(name = "PRESENTATION", nullable = false)
	@NotNull
	private String presentation;

	@Column(name = "STATUS")
	@Enumerated(EnumType.STRING)
	private ProductStatus status;

	@ManyToOne
	@JoinColumn(name = "PRODUCT_CATEGORY_ID")
	private ProductCategory productCategory;

	@ManyToOne
	@JoinColumn(name = "PRODUCER_ID")
	private Producer producer;

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

	public Float getValue() {
		return value;
	}

	public void setValue(final Float value) {
		this.value = value;
	}

	public Producer getProducer() {
		return producer;
	}

	public void setProducer(final Producer producer) {
		this.producer = producer;
	}

	public String getPresentation() {
		return presentation;
	}

	public void setPresentation(final String presentation) {
		this.presentation = presentation;
	}

	public ProductStatus getStatus() {
		return status;
	}

	public void setStatus(final ProductStatus status) {
		this.status = status;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(final ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

}
