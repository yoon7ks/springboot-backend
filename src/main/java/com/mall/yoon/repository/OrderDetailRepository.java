package com.mall.yoon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mall.yoon.entity.Tbl_order_detail;

public interface OrderDetailRepository extends JpaRepository<Tbl_order_detail, Integer>{

}
