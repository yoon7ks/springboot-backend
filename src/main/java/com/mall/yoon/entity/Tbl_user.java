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
public class Tbl_user {

	@Id
	@Column(name="user_id")
	private String user_id;
	
	@Column(name="user_pw")
	private String user_pw;
	
	@Column(name="user_name")
	private String user_name;
	
	@Column(name="user_phone")
	private String user_phone;
	
	@Column(name="user_addr_detail")
	private String user_addr_detail;
	
	@Column(name="user_addr_num")
	private String user_addr_num;
	
	@Column(name="user_create_date")
	private String user_create_date;
	
	@Column(name="user_delete_date")
	private String user_delete_date;
	
	@Column(name="user_email")
	private String user_email;
	
	
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	public Tbl_user(String user_id, String user_pw) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_addr_detail() {
		return user_addr_detail;
	}

	public void setUser_addr_detail(String user_addr_detail) {
		this.user_addr_detail = user_addr_detail;
	}

	public String getUser_addr_num() {
		return user_addr_num;
	}

	public void setUser_addr_num(String user_addr_num) {
		this.user_addr_num = user_addr_num;
	}

	public String getUser_create_date() {
		return user_create_date;
	}

	public void setUser_create_date(String user_create_date) {
		this.user_create_date = user_create_date;
	}

	public String getUser_delete_date() {
		return user_delete_date;
	}

	public void setUser_delete_date(String user_delete_date) {
		this.user_delete_date = user_delete_date;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public Tbl_user() {
		super();
	}

	public Tbl_user(String user_id, String user_pw, String user_name, String user_phone) {
		super();
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_name = user_name;
		this.user_phone = user_phone;
	}

	public Tbl_user(String user_id, String user_pw, String user_name, String user_phone, String user_addr_detail,
	        String user_addr_num, String user_create_date, String user_delete_date, String user_email) {
		super();
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_name = user_name;
		this.user_phone = user_phone;
		this.user_addr_detail = user_addr_detail;
		this.user_addr_num = user_addr_num;
		this.user_create_date = user_create_date;
		this.user_delete_date = user_delete_date;
		this.user_email = user_email;
	}

}
