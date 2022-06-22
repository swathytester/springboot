package com.cg.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cg.web.model.Employee;

@Controller
public class EmployeeController {

	
	@RequestMapping("/")
	public String sayHello() {
		return "hello";
	}
	
	@RequestMapping("/hello")
	public String sayHelloUser(@RequestParam("username") String username, Model model) {
		System.out.println(username);
		model.addAttribute("username", username);
		return "show";
	}
	
	@RequestMapping("/employee")
	public ModelAndView registerEmployee(@ModelAttribute Employee emp) {
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("show-employee");
		mv.addObject("employee", emp);
		return mv;
	}
	
	@ResponseBody
	@RequestMapping("/api/employee")
	public Employee registerEmployeeApi(@ModelAttribute Employee emp) {
		
		return emp;
	}
	
}
