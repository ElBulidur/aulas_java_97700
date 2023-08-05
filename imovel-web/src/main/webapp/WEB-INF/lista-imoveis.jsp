<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listando os imoveis</title>
</head>
<body>

<c:import url="/includes/cabecalho.jsp" />

<a href="sistema?servico=adiciona">Adicionar imovel</a>

<table cellspacing="2" width="70%">
	<thead align="left">
		<th>Proprietario</th>
		<th>Endereco</th>
		<th>Tipo</th>
		<th>Contato</th>
		<th>Valor</th>
		<th>Data</th>
	</thead>
	<jsp:useBean id="dao" class="br.com.juliopereira.dao.ImovelDao"/>
	
	<c:forEach var="imovel" items="${dao.lista}" varStatus="In">
	
	<tr bgcolor="#${In.count % 2 == 0 ? '9c9c9c' : 'f2f2f2'}">
		<td>${imovel.proprietario}</td>
		<td>${imovel.endereco}</td>
		<td>${imovel.tipo}</td>
		<td>${imovel.contato}</td>
		<td>${imovel.valor}</td>
		<td>${imovel.dataInclusao.time}</td>
	</tr>
	</c:forEach>
</table>
<c:import url="/includes/rodape.jsp" />

</body>
</html>