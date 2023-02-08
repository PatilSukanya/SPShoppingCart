package com.springboot.SPShoppingCart.entity;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Table(name="tbl_product")
@Entity
@Setter
@Getter
@ToString
public class Product {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "productId")
	private Integer productId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "status")
	private String status;
	
	@ManyToMany(targetEntity = Brand.class,cascade=CascadeType.ALL)
	@JoinColumn(name="bp-fk",referencedColumnName ="productId")
	private List<Brand> brands;
	
	public Product() {
		super();
		
	}



	public Product(String name, List<Brand> brands,String status) {
		super();
		this.name = name;
		this.brands = brands;
		this.status = status;
	}


	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Brand> getBrand() {
		return brands;
	}

	public void setBrand(List<Brand> brand) {
		this.brands = brand;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", status=" + status + ", brands=" + brands + "]";
	}

	
	

}
