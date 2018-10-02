package com.mall.yoon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.yoon.entity.Tbl_user;
import com.mall.yoon.repository.UserRepository;
import com.mall.yoon.service.UserRepositoryService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserRepositoryServiceImpl implements UserRepositoryService {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserRepositoryServiceImpl() {
		
	}


	@Override
	public Tbl_user addUser(Tbl_user tbl_user) {
		return userRepository.save(tbl_user);
	}

	@Override
	public Tbl_user addUser(Tbl_user tbl_user, String user_id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
