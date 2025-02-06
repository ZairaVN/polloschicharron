package com.sinensia.polloschicharron.presentation.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class WebConfig implements WebMvcConfigurer {
	
	@Autowired
	private AuditoriaFiltro auditoriaFiltro;
	
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(auditoriaFiltro)
				.addPathPatterns("/**");
	}
	

}
