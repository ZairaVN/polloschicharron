package com.sinensia.polloschicharron.presentation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sinensia.polloschicharron.business.services.AuditoriaService;

@Controller
@RequestMapping("/app")
public class AuditoriaAppController {

	private AuditoriaService auditoriaServices;

	public AuditoriaAppController(AuditoriaService auditoriaServices) {
		this.auditoriaServices = auditoriaServices;
	}
	
	@GetMapping("/auditorias")
	public ModelAndView getListaAuditoria(ModelAndView mav) {
		mav.addObject("auditorias", auditoriaServices.getAll());
		mav.setViewName("auditorias");
		return mav;
	}
}
