<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Personas</title>
</head>
<body>
<body>
    <h1>Grilla de Personas</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Apellidos</th>
            <th>Nombres</th>
            <th>Dirección</th>
            <th>Distrito</th>
            <th>Fecha de Nacimiento</th>
        </tr>
        <c:forEach items="${personas}" var="persona">
            <tr>
                <td>${persona.idpersona}</td>
                <td>${persona.apellidos}</td>
                <td>${persona.nombres}</td>
                <td>${persona.dirección}</td>
                <td>${persona.distrito}</td>
                <td>${persona.fechanacimiento}</td>
            </tr>
        </c:forEach>
    </table>
</body>

</body>
</html>