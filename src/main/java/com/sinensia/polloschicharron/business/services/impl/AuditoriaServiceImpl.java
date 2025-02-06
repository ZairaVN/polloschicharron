package com.sinensia.polloschicharron.business.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sinensia.polloschicharron.business.services.AuditoriaService;
import com.sinensia.polloschicharron.integration.model.AuditoriaPL;
import com.sinensia.polloschicharron.integration.repositories.AuditoriaPLRepository;

@Service
public class AuditoriaServiceImpl implements AuditoriaService{
	
	private final AuditoriaPLRepository auditoriaPLRepository;

	public AuditoriaServiceImpl(AuditoriaPLRepository auditoriaPLRepository) {
		this.auditoriaPLRepository = auditoriaPLRepository;
	}
	
	@Override
	public List<AuditoriaPL> getAll() {
	  return auditoriaPLRepository.findOrdenado();
	}

}
