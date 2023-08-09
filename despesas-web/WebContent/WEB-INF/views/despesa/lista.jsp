<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listando as despesas</title>
</head>
<body>

<a href="novaDespesa"> Nova Despesa</a>
<br />
<br />

<table cellpadding="2" cellspacing="2">
	<tr>
		<th>##</th>
		<th>Descrição</th>
		<th>Pago?</th>
		<th>Data Pagamento</th>
	</tr>
	<c:forEach var="despesa" items="${despesas}" varStatus="In">
		<tr bgcolor="#${In.count % 2 == 0 ? '9c9c9c' : 'f2f2f2'}">
			<td>${despesa.id}</td>
			<td>${despesa.descricao}</td>
			<c:if test="${despesa.pago eq false}">
				<td>A pagar</td>
			</c:if>
			<c:if test="${despesa.pago eq true}">
				<td>Pago</td>
			</c:if>
			
			<td>
				<fmt:formatDate value="${despesa.dataPagamento.time}" pattern="dd/MM/yyyy" />
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>