package com.eusugiro.adm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path="")
public class InicioController {

	@RequestMapping(value="", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model){
	    return "index";
	}
  
}