<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registro de Persona</h1>
<h3>Por favor completa los campos</h3>
<form action = "persona" method ="post">
	<table>
		<tr>
			<td>Nombre</td>
			<td><input type = "text" name = nombre ></input></td>
		</tr>
		<tr>
			<td>Apellidos</td>
			<td><input type = "text" name = apellidos></input></td>
		</tr>
		<tr>
			<td>Edad</td>
			<td><input type = "text" name = edad ></input></td>
		</tr>
		<tr>
			<td>Estatura</td>
			<td><input type = "text" name = estatura ></input></td>
		</tr>
		<tr>
			<td><button type="submit">Guardar Persona</button></td>
		</tr>
	</table>
</form>
<a href = "persona">Consultar Personas</a>
</body>
</html>