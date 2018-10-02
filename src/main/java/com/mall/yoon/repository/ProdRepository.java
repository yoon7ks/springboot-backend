package com.mall.yoon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mall.yoon.entity.Tbl_prod;

public interface ProdRepository extends JpaRepository<Tbl_prod, Integer> {

}
