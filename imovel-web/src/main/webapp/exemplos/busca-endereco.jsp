<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="br.com.juliopereira.dao.ImovelDao, br.com.juliopereira.modelo.Imovel" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Busca Endereço</title>
</head>
<body>

	<h4> Código do imóvel: ${param.codigo}</h4>
	
	<%
		Long codigo = Long.parseLong(request.getParameter("codigo"));
		Imovel imovel = new ImovelDao().busca(codigo);
		
		if(imovel != null){%>
		
		<h4>Endereco do imovel: <%=imovel.getEndereco() %></h4>
		<h4>Proprietario do imovel: <%=imovel.getProprietario() %></h4>
		
		<%}else{ %>
		
		<h4>Imovel nao localizado!!!</h4>
			
		<%}%>
	
</body>
</html>