package com.sinensia.polloschicharron.integration.model;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="AUDITORIAS")
public class AuditoriaPL {

	@Id
	@GeneratedValue(generator = "AUDITORIA_SEQ")
	private Long id;
	
	private String verbo;
	private String path;
	private String ip;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date instanteTiempo;
	private int statusCode;
	@Temporal(TemporalType.TIMESTAMP)
	private Date tiempoRespuesta;
	
	public AuditoriaPL() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVerbo() {
		return verbo;
	}

	public void setVerbo(String verbo) {
		this.verbo = verbo;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	
	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	

	public Date getInstanteTiempo() {
		return instanteTiempo;
	}

	public void setInstanteTiempo(Date instanteTiempo) {
		this.instanteTiempo = instanteTiempo;
	}

	public Date getTiempoRespuesta() {
		return tiempoRespuesta;
	}

	public void setTiempoRespuesta(Date tiempoRespuesta) {
		this.tiempoRespuesta = tiempoRespuesta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuditoriaPL other = (AuditoriaPL) obj;
		return Objects.equals(id, other.id);
	}


	
	
	
	
}
