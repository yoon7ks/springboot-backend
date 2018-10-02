package com.mall.yoon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mall.yoon.entity.Tbl_user;
import com.mall.yoon.service.UserRepositoryService;

/**
 * 
 * @author 	yjks
 * @date	2018.09.29
 */
@Controller
public class UserController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserRepositoryService repoService;
	
	@GetMapping("/form")
	public String test(Model model) {
		
		model.addAttribute("title", "create user");
		model.addAttribute("user", new Tbl_user("yjks", "yjks"));
		
		return "form";
	}
	
	
	@RequestMapping("/add")
	public String add(@ModelAttribute Tbl_user tbl_user, Model model) {
		Tbl_user userInfo = repoService.addUser(tbl_user);
		
		model.addAttribute("result", userInfo);
		
		return "result";
	}
	
	@PostMapping("/insertUser")
	public String insert(@ModelAttribute Tbl_user tbl_user, Model model) {
		Tbl_user userInfo = repoService.addUser(tbl_user);
		LOGGER.debug(">>>>user_id=" + userInfo.getUser_id());
		
		model.addAttribute("result", userInfo);
		
		return "addUser";
		
	}
	
	@GetMapping("/addUser")
	public String addUser(Model model) {
		
		model.addAttribute("title", "구성원을 등록하세요.");
		model.addAttribute("tbl_user", new Tbl_user("1", "2", "3", "4"));
		
		return "addUser";
	}
	
	
}
