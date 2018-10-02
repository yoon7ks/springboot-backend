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
public class Tbl_order_detail {

	@Id
	@Column(name="order_detail_id")
	private int order_detail_id;
	
	@Column(name="prod_cnt")
	private int prod_cnt;
	
	@Column(name="order_id")
	private int order_id;
	
	@Column(name="prod_id")
	private int prod_id;

	public int getOrder_detail_id() {
		return order_detail_id;
	}

	public void setOrder_detail_id(int order_detail_id) {
		this.order_detail_id = order_detail_id;
	}

	public int getProd_cnt() {
		return prod_cnt;
	}

	public void setProd_cnt(int prod_cnt) {
		this.prod_cnt = prod_cnt;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	public Tbl_order_detail() {
		super();
	}

	public Tbl_order_detail(int order_detail_id, int prod_cnt, int order_id, int prod_id) {
		super();
		this.order_detail_id = order_detail_id;
		this.prod_cnt = prod_cnt;
		this.order_id = order_id;
		this.prod_id = prod_id;
	}
	
}
