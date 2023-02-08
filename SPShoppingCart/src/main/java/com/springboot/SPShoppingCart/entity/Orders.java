package com.springboot.SPShoppingCart.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
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

@Table(name="tbl_orders")
@Entity
@Setter
@Getter
@ToString
public class Orders {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderId;
	private Date orderDate;
	private Date orderDileveredDate;
	private String orderStatus;
	private int productId;
	private String paymentSource;
	private String paymentStatus; 
	
	@ManyToMany(targetEntity = Customer.class,cascade=CascadeType.ALL)
	@JoinColumn(name="co-fk",referencedColumnName ="userId")
	private List<Customer> customers;

	

	public Orders() {
		super();
	}

	public Orders(Date orderDate, Date orderDileveredDate, String orderStatus,  int productId,
			String paymentSource, String paymentStatus, List<Customer> customers) {
		super();
		this.orderDate = orderDate;
		this.orderDileveredDate = orderDileveredDate;
		this.orderStatus = orderStatus;
		this.productId = productId;
		this.paymentSource = paymentSource;
		this.paymentStatus = paymentStatus;
		this.customers = customers;
	}



	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}



	public Date getOrderDate() {
		return orderDate;
	}



	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}



	public Date getOrderDileveredDate() {
		return orderDileveredDate;
	}



	public void setOrderDileveredDate(Date orderDileveredDate) {
		this.orderDileveredDate = orderDileveredDate;
	}



	public String getOrderStatus() {
		return orderStatus;
	}



	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}





	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public String getPaymentSource() {
		return paymentSource;
	}



	public void setPaymentSource(String paymentSource) {
		this.paymentSource = paymentSource;
	}



	public String getPaymentStatus() {
		return paymentStatus;
	}



	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}



	public List<Customer> getCustomers() {
		return customers;
	}



	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}



	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderDate=" + orderDate + ", orderDileveredDate=" + orderDileveredDate
				+ ", orderStatus=" + orderStatus + ",  productId=" + productId
				+ ", paymentSource=" + paymentSource + ", paymentStatus=" + paymentStatus + ", customers=" + customers
				+ "]";
	}

	
	


}
