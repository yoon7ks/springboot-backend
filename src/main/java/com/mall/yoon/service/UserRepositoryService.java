package com.mall.yoon.service;

import com.mall.yoon.entity.Tbl_user;

public interface UserRepositoryService {

	Tbl_user addUser(Tbl_user tbl_user, String user_id);

	Tbl_user addUser(Tbl_user tbl_user);

}
