<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> Mensagem de Erro, entre em contato com o suporte do sistema</h1>

<%
out.print(request.getAttribute("msg"));
%>

</body>
</html>