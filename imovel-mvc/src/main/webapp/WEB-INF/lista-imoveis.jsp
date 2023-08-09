<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listando os imoveis</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>

<div class="container">

	<c:import url="/WEB-INF/includes/cabecalho.jsp" />
<form action="mvc" method="post">
<input type="hidden" name="servico" value="MostraImovelServico"/>
<button type="submit" class="btn btn-primary mb-3">Adicionar</button>

</form>
	
	<table cellspacing="2" width="70%">
		<thead align="left">
			<th>Proprietario</th>
			<th>Endereco</th>
			<th>Tipo</th>
			<th>Contato</th>
			<th>Valor</th>
			<th>Data</th>
			<th>Remover</th>
			<th>Alterar</th>
		</thead>
		
		<!-- <jsp:useBean id="dao" class="br.com.juliopereira.dao.ImovelDao"/> -->
		
		<c:forEach var="imovel" items="${imoveis}" varStatus="In">
		
		<tr bgcolor="#${In.count % 2 == 0 ? '9c9c9c' : 'f2f2f2'}">
			<td>${imovel.proprietario}</td>
			<td>${imovel.endereco}</td>
			<td>${imovel.tipo}</td>
			<td>${imovel.contato}</td>
			<td>${imovel.valor}</td>
			<td>${imovel.dataInclusao.time}</td>
			<td><a href="mvc?servico=RemoveImovelServico&id=${imovel.id}">remover</a></td>
			<td><a href="mvc?servico=MostraImovelServico&id=${imovel.id}">alterar</a></td>
			
		</tr>
		</c:forEach>
	</table>
	<c:import url="/WEB-INF/includes/rodape.jsp" />
</div>


</body>
</html>