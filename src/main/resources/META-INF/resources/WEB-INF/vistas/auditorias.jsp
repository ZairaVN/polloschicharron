<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Pollos Chicharrón</title>
		<jsp:include page="common-in-head.jsp"/>
	</head>
	<body>
		<div class="container-fluid">
			<jsp:include page="nav.jsp"/>
			<h3 style="margin-top: 15px;">Auditorias</h3>
			<table class="table">
				<thead>
					<tr>
						<th>ID</th>
						<th>Verbo</th>
						<th>Path</th>
						<th style="text-align: center;">IP</th>
						<th>Fecha consulta</th>
						<th>Hora consulta</th>
						<th>Status Code</th>
						<th style="text-align: center;">Tiempo consulta</th>
						
					</tr>
				</thead>
				<tbody>
					<c:forEach var="auditoria" items="${auditorias}">
					<tr>
						<td>${auditoria.id}</td>
						<td>${auditoria.verbo}</td>
						<td>${auditoria.path}</td>
						<td style="text-align: right;">
							${auditoria.ip}
						</td>
						<td><fmt:formatDate pattern="dd/MM/yyyy" value="${auditoria.instanteTiempo}" /></td>
						<td><fmt:formatDate pattern="HH:mm" value="${auditoria.instanteTiempo}" /></td>
						<td>
							${auditoria.statusCode}
						</td>
						<td>
							${auditoria.tiempoRespuesta}
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</body>
</html>