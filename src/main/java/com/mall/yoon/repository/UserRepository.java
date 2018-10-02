package com.mall.yoon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mall.yoon.entity.Tbl_user;

public interface UserRepository extends JpaRepository<Tbl_user, String>{

}
