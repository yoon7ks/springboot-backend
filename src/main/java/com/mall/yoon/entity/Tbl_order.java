package com.mall.yoon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Tbl_order {
	
	@Id
	@Column(name="order_id")
	private int order_id;
	
	@Column(name="order_date")
	private String order_date;
	
	@Column(name="order_total_price")
	private String order_total_price;
	
	@Column(name="order_status")
	private String order_status;
	
	@Column(name="user_id")
	private String user_id;
	
	public int getOrder_id() {
		return order_id;
	}
	
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	
	public String getOrder_date() {
		return order_date;
	}
	
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	
	public String getOrder_total_price() {
		return order_total_price;
	}
	
	public void setOrder_total_price(String order_total_price) {
		this.order_total_price = order_total_price;
	}
	
	public String getOrder_status() {
		return order_status;
	}
	
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	
	public String getUser_id() {
		return user_id;
	}
	
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	public Tbl_order(int order_id, String order_date, String order_total_price, String order_status, String user_id) {
		super();
		this.order_id = order_id;
		this.order_date = order_date;
		this.order_total_price = order_total_price;
		this.order_status = order_status;
		this.user_id = user_id;
	}
	
	public Tbl_order() {
		super();
	}
}
