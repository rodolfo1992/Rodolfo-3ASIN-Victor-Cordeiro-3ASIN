<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="to.AlunoTO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aluno</title>
</head>
<body>
<%AlunoTO to = (AlunoTO)request.getAttribute("aluno"); %>
	Id: <%=to.getId() %><br>
	Nome: <%=to.getNome() %><br>
	Fone: <%=to.getTelefone() %><br>

</body>
</html>