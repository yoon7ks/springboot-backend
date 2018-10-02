package com.mall.yoon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mall.yoon.entity.Tbl_order;

public interface OrderRepository extends JpaRepository<Tbl_order, Integer> {

}
