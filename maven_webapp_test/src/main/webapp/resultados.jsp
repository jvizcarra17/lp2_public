<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Personas</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>

<body>
	
	<div class="container">
	<h2>Listado de Personas</h2>
		<table class="table table-hover">
			<tr>
				<th class="thead-dark">ID</th>
				<th class="thead-dark">Apellidos</th>
				<th class="thead-dark">Nombres</th>
				<th class="thead-dark">Dirección</th>
				<th class="thead-dark">Distrito</th>
				<th class="thead-dark">Fecha de Nacimiento</th>
			</tr>
			<c:forEach items="${personas}" var="persona">
				<tr>
					<td>${persona.idpersona}</td>
					<td>${persona.apellidos}</td>
					<td>${persona.nombres}</td>
					<td>${persona.direccion}</td>
					<td>${persona.distrito}</td>
					<td>${persona.fechanacimiento}</td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>