package com.layne.controller;

import com.layne.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author layne staley
 * @date 2020/3/16
 */
@Controller
public class HelloController {

	@Autowired
	private HelloService helloService;

//	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
//		return helloService.sayHello();
		return "hello";
	}
}
