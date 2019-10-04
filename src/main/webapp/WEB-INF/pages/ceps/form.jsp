<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    


<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/main.css" />">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<meta charset="UTF-8">
<title>CEP</title>
</head>
<body>
   <div class="container" >
  
  <div class="panel-group">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h2>Adicionar CEP</h2> 
				</div>
   <div class="panel-body">
   <form action="<c:url value="/ceps/add" />" method="post">      
      
     <div class="form-group">
      <label for="nome">Logradouro/Nome:</label>
      <input type="text" name="logradouro_nome" id="logradouro_nome" size="50" class="form-control">
     </div> 
    <div class="form-group">  
      <label for="telefone">Bairro/Distrito:</label>
      <input type="text" name="bairro_distrito" id="bairro_distrito" size="50" class="form-control">
    </div>    
    
    <div class="form-group">
      <label for="nome">Localidade/UF:</label>
      <input type="text" name="localidade_uf" id="localidade_uf" size="50" class="form-control">
    </div>  
    <div class="form-group">  
      <label for="telefone">CEP:</label>
      <input type="text" name="cep" id="cep" size="50" class="form-control">
    </div>

      <a class="btn btn-primary btn-xs" href="<c:url value="/" />"  >Voltar</a>
      <button type="submit" class="btn btn-primary btn-xs">Salvar</button>   
      
   </form>
   </div>
   </div>
   </div>
   </div>
   
   <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>