package com.eusugiro.adm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eusugiro.adm.business.UsuarioBusiness;
import com.eusugiro.adm.entity.UsuarioEntity;

@Controller
@RequestMapping(path="/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioBusiness usuarioBusiness;
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public ModelAndView showLoginPage(ModelMap model){
		
		List<UsuarioEntity> listaUsuarios = usuarioBusiness.listarTodos();

		ModelAndView mv = new ModelAndView();
		mv.setViewName("listar-usuario");
		mv.addObject("listaUsuario", listaUsuarios);
		
		return mv;
	}
  
}