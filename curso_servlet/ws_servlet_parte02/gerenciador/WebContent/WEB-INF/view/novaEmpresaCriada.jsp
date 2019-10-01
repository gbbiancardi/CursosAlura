<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Empresa</title>
</head>
<body>

	<c:import url="logout-parcial.jsp" />

	<c:if test="${not empty empresa}">
		Empresa ${ empresa } cadastrada com sucesso!
	</c:if>
	<c:if test="${empty empresa}">
		Não foi possível cadastrar a empresa!
	</c:if>
</body>
</html>