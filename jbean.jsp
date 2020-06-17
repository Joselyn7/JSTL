<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

	<jsp:useBean id="empleado" class="com.ecodeup.model.Empleado"
		scope="session">
		<jsp:setProperty name="empleado" property="cui" param="*" />
	</jsp:useBean>

	<p>
		Cui:
		<jsp:getProperty name="empleado" property="cui" />
	</p>
	<p>
		Nombres:
		<jsp:getProperty name="empleado" property="nombres" />
	</p>
	<p>
		Apellidos:
		<jsp:getProperty name="empleado" property="apellidos" />
	</p>
	<p>
		Edad:
		<jsp:getProperty name="empleado" property="edad" />
	</p>
</body>
</html>