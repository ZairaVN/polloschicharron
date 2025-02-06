package com.sinensia.polloschicharron.integration.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sinensia.polloschicharron.integration.model.AuditoriaPL;
@Repository
public interface AuditoriaPLRepository extends JpaRepository<AuditoriaPL, Long>{
	
	@Query("SELECT a FROM AuditoriaPL a ORDER BY a.id DESC")
	List<AuditoriaPL> findOrdenado();
}
