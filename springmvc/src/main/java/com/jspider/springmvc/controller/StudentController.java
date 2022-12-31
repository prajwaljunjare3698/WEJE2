package com.jspider.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jspider.springmvc.pojo.StudentPojo;
import com.jspider.springmvc.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/homepage")
	public String home() {
		return "homepage";
	}

	@PostMapping("/login")
	public String loginform(@RequestParam String username,@RequestParam String password,ModelMap map) {
		StudentPojo pojo = service.login(username,password);
		if(pojo != null) {
			return "homepage";
		}
		map.addAttribute("msg","Invalid username/password...");
		return "login_form";
	}

	@GetMapping("/add")
	public String add() {
		return "add_student";
	}
	
	@PostMapping("/add")
	public String addData(@RequestParam String name,@RequestParam String email,@RequestParam long contact,@RequestParam String city,@RequestParam String username,@RequestParam String password,ModelMap map) {
		StudentPojo student = service.add(name, email,contact, city, username, password);
		if (student != null) {
			map.addAttribute("student", student);
		} else {
			map.addAttribute("msg", "Data not added.!");
		}
		return "add_student";
	}	 
	
	
	@GetMapping("/search")
	public String search() {
		return "search_student";
	}
	@PostMapping("/search")
	public String searchData(@RequestParam int id,
			ModelMap map) {
		StudentPojo student = service.search(id);
		if (student != null) {
			map.addAttribute("student", student);
		} else {
			map.addAttribute("msg", "Data not found..!!");
		}
		return "search_student";
	}
	
	@GetMapping("/update")
	public String update(ModelMap map) {
		List<StudentPojo> students = service.showAll();
		map.addAttribute("students", students);
		return "update_student";
	}
	
	@PostMapping("/update")
	public String updateData(@RequestParam int id,ModelMap map) {
		StudentPojo student = service.remove(id);
		if (student != null) {
			map.addAttribute("msg", "Student removed successfully");
		} else {
			map.addAttribute("msg", "Data not found..!!");
		}
		List<StudentPojo> students = service.showAll();
		map.addAttribute("students", students);
		return "update_student";
	}
	
	
	@GetMapping("/remove")
	public String remove(ModelMap map) {
		List<StudentPojo> students = service.showAll();
		map.addAttribute("students", students);
		return "remove_student";
	}
	
	@PostMapping("/remove")
	public String removeData(@RequestParam int id, ModelMap map) {
		StudentPojo student = service.remove(id);
		if (student != null) {
			map.addAttribute("msg", "Student removed successfully");
		} else {
			map.addAttribute("msg", "Data not found..!!");
		}
		List<StudentPojo> students = service.showAll();
		map.addAttribute("students", students);
		return "remove_student";
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "login_form";
	}
		
}
