package com.example.sportyshoeswebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.sportyshoeswebapp.entity.Admin;
import com.example.sportyshoeswebapp.repository.AdminRepository;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminRepository repo;

	@GetMapping
	public String getAdmin(ModelMap model) {
		model.addAttribute("admins", repo.findAll());
		model.put("message", "HowToDoInJava Reader !!");
		return "show_admin";	
	}

	@PostMapping
	public String addAdmin(@ModelAttribute("admin") Admin admin, ModelMap model) {
		
		repo.save(admin);
		model.addAttribute("admins", repo.findAll());
		return "show_admin"; 
	}
}
