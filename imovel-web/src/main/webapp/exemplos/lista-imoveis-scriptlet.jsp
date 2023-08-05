<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*, br.com.juliopereira.dao.ImovelDao, br.com.juliopereira.modelo.Imovel" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listagem de imóveis</title>
</head>
<body>

<table cellspacing="2" width="70%">
	<thead align="left">
		<th>Proprietario</th>
		<th>Endereco</th>
		<th>Tipo</th>
		<th>Contato</th>
		<th>Valor</th>
		<th>Data</th>
	</thead>
	<% 
		List<Imovel> imoveis = new ImovelDao().getLista();
		for (Imovel i: imoveis){
	%>
	<tr>
		<td><%=i.getProprietario()%></td>
		<td><%=i.getEndereco()%></td>
		<td><%=i.getTipo()%></td>
		<td><%=i.getContato()%></td>
		<td><%=i.getValor()%></td>
		<td><%=i.getDataInclusao().getTime()%></td>
	</tr>
	
	<%} %>
	
</table>

</body>
</html>