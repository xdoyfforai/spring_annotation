package com.layne.web.controller;

import com.layne.dto.UserDto;
import com.layne.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author layne staley
 * @date 2020/3/22
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping(value = "/usersByName")
	public String showUsersByName(String username, Model map) {
		List<UserDto> users = userService.getUserByName(username);

		map.addAttribute("userCount", users.size());
		System.out.println(users);
		return "success";
	}


	@PostMapping("/addUser")
	public String addUser(UserDto dto) {

		userService.addUser(dto);
		return "success";
	}

}
