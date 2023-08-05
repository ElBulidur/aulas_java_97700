<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="custom"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

  <link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
  <script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
<title>Primeira Página HTML</title>
<style type="text/css">
h1{
color:red;
}
</style>
</head>
<body>
<c:import url="/WEB-INF/includes/cabecalho.jsp" />
<h2>Cadastro de cliente</h2>
<a href="sistema?servico=imoveis">Listar os imoveis</a>
<form  action="cadastraimovel">
	<table>
		<tr>
			<td> Proprietário: </td><td><input type="text" name="proprietario" /> </td>
		</tr>
		<tr>
			<td> Endereço: </td><td><input type="text" name="endereco" /> </td>
		</tr>
		<tr>
			<td> Tipo de contrato:</td><td>
			<select name="tipo">
				<option value="aluguel">Aluguel</option>
				<option value="venda">Venda</option>
			</select>
			</td>
		</tr>
		
		<tr>
			<td> Contato: </td><td><input type="text" name="contato" /> </td>
		</tr>
		<tr>
			<td> Valor: </td><td><input type="text" name="valor" /> </td>
		</tr>
		<tr>
			<td> Data Inclusão:</td><td><custom:campoData id="dataInclusao" /></td>
		</tr>
	</table> <br />
	<input type="submit" value="Enviar" />
</form>
<c:import url="/WEB-INF/includes/rodape.jsp" />
</body>
</html>