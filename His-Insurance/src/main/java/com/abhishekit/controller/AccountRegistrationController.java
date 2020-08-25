package com.abhishekit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.abhishekit.model.AccountRegistrationModel;


@Controller
public class AccountRegistrationController {
	
	//@Autowired
	//private ContactService service;
	
	@GetMapping(value = {"/","/addAccount"})
	public String loadForm(Model model)
	
	{
		AccountRegistrationModel c = new AccountRegistrationModel();
		model.addAttribute("account",c);
		return "accountRegistration";
	}
	
	/*
	 * @PostMapping("/saveAccount") public String handleSubmitBtn(Contact c,Model m)
	 * { service.saveContact(c);
	 * 
	 * String ms= "Contact added successfully";
	 * 
	 * m.addAttribute("msg", ms);
	 * 
	 * return "contactInfo"; }
	 * 
	 */
}
