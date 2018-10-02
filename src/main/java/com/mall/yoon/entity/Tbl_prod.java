package com.mall.yoon.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Tbl_prod {

	@Id
	@Column(name="prod_id")
	private int prod_id;
	
	@Column(name="prod_name")
	private String prod_name;
	
	@Column(name="prod_price")
	private String prod_price;
	
	@Column(name="prod_img1")
	private String prod_img1;
	
	@Column(name="prod_img2")
	private String prod_img2;
	
	@Column(name="category_id")
	private int category_id;
	
	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}
	
	public String getProd_name() {
		return prod_name;
	}
	
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	
	public String getProd_price() {
		return prod_price;
	}
	
	public void setProd_price(String prod_price) {
		this.prod_price = prod_price;
	}
	
	public String getProd_img1() {
		return prod_img1;
	}
	
	public void setProd_img1(String prod_img1) {
		this.prod_img1 = prod_img1;
	}
	
	public String getProd_img2() {
		return prod_img2;
	}
	
	public void setProd_img2(String prod_img2) {
		this.prod_img2 = prod_img2;
	}
	
	public int getCategory_id() {
		return category_id;
	}
	
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	
	public Tbl_prod() {
		super();
	}
	
	public Tbl_prod(int prod_id, String prod_name, String prod_price, String prod_img1, String prod_img2,
	        int category_id) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_price = prod_price;
		this.prod_img1 = prod_img1;
		this.prod_img2 = prod_img2;
		this.category_id = category_id;
	}

	
}
