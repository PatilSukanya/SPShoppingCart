package com.springboot.SPShoppingCart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Table(name="tbl_brand")
@Entity
@Setter
@Getter
@ToString
public class Brand {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "brandId")
	private Integer brandId;
	
	
	@Column(name = "productId")
	private Integer productId;
	
	@Column(name = "brand")
	private String brand;
	
	@Column(name = "quantity")
	private Integer quantity;
	
	@Column(name = "price")
	private Double price;
	

	
	public Brand() {
		super();
	}


	public Brand(Integer productId, String brand, Integer quantity, Double price) {
		super();
		this.productId = productId;
		this.brand = brand;
		this.quantity = quantity;
		this.price = price;
	}

	


	public Integer getBrandId() {
		return brandId;
	}


	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}


	public Integer getProductId() {
		return productId;
	}


	public void setProductId(Integer productId) {
		this.productId = productId;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", productId=" + productId + ", brand=" + brand + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}


	
	
	
	

}
