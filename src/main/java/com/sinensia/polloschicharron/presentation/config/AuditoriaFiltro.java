package com.sinensia.polloschicharron.presentation.config;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.sinensia.polloschicharron.integration.model.AuditoriaPL;
import com.sinensia.polloschicharron.integration.repositories.AuditoriaPLRepository;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class AuditoriaFiltro implements HandlerInterceptor{

	private Date antes;
	private Date despues;
	
	@Autowired
	private AuditoriaPLRepository auditoriaPLRepository;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{	
		
		antes =  new Date(System.currentTimeMillis());
		
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception{

		String verbo = request.getMethod();
		String path = request.getRequestURI();
		String ip = request.getRemoteAddr();
		Date instanteTiempo = new Date(System.currentTimeMillis());
		int statusCode = response.getStatus();
		
		
		
		AuditoriaPL auditoria = new AuditoriaPL();
		auditoria.setVerbo(verbo);
		auditoria.setPath(path);
		auditoria.setIp(ip);
		auditoria.setInstanteTiempo(instanteTiempo);
		auditoria.setStatusCode(statusCode);
		
		despues =  new Date(System.currentTimeMillis());
		Date diferencia = new Date(despues.getTime()-antes.getTime());
		auditoria.setTiempoRespuesta(diferencia);
		
		
		auditoriaPLRepository.save(auditoria);
		
	}
	
	
	
	
}
