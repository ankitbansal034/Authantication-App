package com.security.form.ecoder.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.security.form.ecoder.service.UserService;
import com.security.form.ecoder.web.dto.UserRegistrationDto;


@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("user")	
	public UserRegistrationDto userRegistrationDto(){
		return new UserRegistrationDto();
	}
	
	
    @GetMapping	
	public String showRegistrationForm(){
		return "registration";
	}
	
    @PostMapping
	public String registrationUserAccount(@ModelAttribute("user") UserRegistrationDto RegistrationDto) {
		userService.save(RegistrationDto);
		return "redirect:/registration?success";
	}
}
