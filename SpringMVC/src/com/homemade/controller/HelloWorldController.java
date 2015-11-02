package com.homemade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.homemade.dao.UserDAO;
import com.homemade.model.User;

/**
 * Sample Class for demo 
 * @author Swapnil
 *
 */
@Controller
public class HelloWorldController {

//	@RequestMapping("/hello")
//	public ModelAndView helloWorld() {
//
//		String message = "Hello World, Spring 3.0!";
//		System.out.println(message);
//		return new ModelAndView("hello", "message", message);
//	}
	 @Autowired
	 private UserDAO userDao;
	 
	 @RequestMapping("/hello")
	 public String hello(Model model) {
	  
//	   model.addAttribute("name", "Swapnil");
//	   //returns the view name
//	   return "hello";
		 List<User> listUsers = userDao.list();
		 model.addAttribute("userList", listUsers);
	     
		 return "home";

	 }
}
