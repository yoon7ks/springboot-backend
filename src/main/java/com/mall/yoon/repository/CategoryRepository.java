package com.mall.yoon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mall.yoon.entity.Tbl_category;

public interface CategoryRepository extends JpaRepository<Tbl_category, Integer> {

}
