<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="to.AlunoTO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Aluno</title>
</head>
<body>
	<%AlunoTO to = (AlunoTO)request.getAttribute("aluno"); %>
	Id: <%=to.getId() %><br>
	Nome: <%=to.getNome() %><br>
	Endereco: <%=to.getEndereco() %><br>
	DataNasc: <%=to.getdtNasc() %><br>
	Email: <%=to.getEmail() %><br>
	Telefone: <%=to.getTelefone() %><br>
	RG: <%=to.getRG() %><br>
	CPF: <%=to.getCPF() %><br>
	
</body>
</html>