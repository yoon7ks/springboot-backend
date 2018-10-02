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
public class Tbl_category {

	@Id
	@Column(name="category_id")
	private int category_id;
	
	@Column(name="category_name")
	private int category_name;
	
	@Column(name="category_order")
	private int category_order;

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public int getCategory_name() {
		return category_name;
	}

	public void setCategory_name(int category_name) {
		this.category_name = category_name;
	}

	public int getCategory_order() {
		return category_order;
	}

	public void setCategory_order(int category_order) {
		this.category_order = category_order;
	}

	public Tbl_category(int category_id, int category_name, int category_order) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
		this.category_order = category_order;
	}

	public Tbl_category() {
		super();
	}
	
}
