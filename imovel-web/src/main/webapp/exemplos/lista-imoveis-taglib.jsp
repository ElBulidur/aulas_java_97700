<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listando os imoveis</title>
</head>
<body>

<c:import url="/includes/cabecalho.jsp" />

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
		<td>${imovel.proprietario}</td> <!-- imovel.getPropriedade() -->
		<td>${imovel.endereco}</td>
		<td>${imovel.tipo}</td>
		
		<!-- 
			<c:if test="${imovel.contatoEhEmail}">
				<td><a href="mailto:${imovel.contato}">${imovel.contato}</a></td>
			</c:if>
			
			<c:if test="${not imovel.contatoEhEmail}">
				<td>${imovel.contato}</td>
			</c:if>
		-->
		
		<c:choose>
			<c:when test="${imovel.contatoEhEmail}">
				<td><a href="mailto:${imovel.contato}">${imovel.contato}</a></td>
			</c:when>
			<c:otherwise>
				<td>${imovel.contato}</td>
			</c:otherwise>
		</c:choose>
		
		<td>
		<fmt:formatNumber value="${imovel.valor}" type="currency" />
		</td>
		
		<td>
		<fmt:formatDate value="${imovel.dataInclusao.time}" pattern="dd/MM/yyyy" />
		</td>
	</tr>
	</c:forEach>
</table>

<c:import url="/includes/rodape.jsp" />
</body>
</html>