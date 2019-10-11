<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
		integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
		crossorigin="anonymous">
	<meta charset="UTF-8">
	<title>Cadastro de Produtos - Casa do Código</title>
	<style type="text/css">
		#conteudo {
				padding: 30px 0px;
			}
	</style>
</head>
<body>
	<nav class="navbar navbar-dark bg-dark">
	  <div class="container">
	    <div class="navbar-header">
	      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarToggleExternalContent" aria-controls="navbarToggleExternalContent" aria-expanded="false" aria-label="Toggle navigation">
	        <span class="sr-only">Toggle navigation</span>
	        <span class="navbar-toggler-icon"></span>
	      </button>
	      <a class="navbar-brand" href="${ s:mvcUrl('HC#index').build() }">Casa do Código</a>
		    <div class="collapse" id="navbarToggleExternalContent">
		    	<div class="bg-dark p-4">
		      		<ul class="nav navbar-nav">
		        		<li><a class="text-white" href="${s:mvcUrl('PC#listar').build()}">Lista de Produtos</a></li>
		    			<li><a class="text-white" href="${s:mvcUrl('PC#form').build()}">Cadastro de Produtos</a></li>
		      		</ul>
	      		</div>
	    	</div><!-- /.navbar-collapse -->
	    </div>
  	  </div>
	</nav>
	
	<div id="conteudo" class="container">
		<h1>Cadastro de Produto</h1>
		
		<form:form action="${ s:mvcUrl('PC#gravar').build() }" method="post"
				commandName="produto" enctype="multipart/form-data">
			<div class="form-group">
				<label>Titulo</label> 
				<form:input path="titulo" cssClass="form-control" />
				<form:errors path="titulo" />
			</div>
			<div class="form-group">
				<label>Descrição</label>
				<form:textarea path="descricao" cssClass="form-control" />
				<form:errors path="descricao" />
			</div>
			<div class="form-group">
				<label>Páginas</label> 
				<form:input path="paginas" cssClass="form-control" />
				<form:errors path="paginas" />
			</div>
			<div class="form-group">
				<label>Data de Lançamento</label>
				<form:input path="dataLancamento" cssClass="form-control" />
				<form:errors path="dataLancamento" />
			</div>
			<c:forEach items="${ tipos }" var="tipoPreco" varStatus="status">
				<div class="form-group">
					<label>${ tipoPreco }</label> 
					<form:input path="precos[${ status.index }].valor" cssClass="form-control" />
					<form:hidden path="precos[${ status.index }].tipo" value="${ tipoPreco }" />
				</div>
			</c:forEach>
			<div class="form-group">
				<label>Sumário</label>
				<input name="sumario" type="file" class="form-control" />
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form:form>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>