<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	<script src="https://kit.fontawesome.com/2365a6c8d2.js" crossorigin="anonymous"></script>
    <title>EuSugiro.com</title>
  </head>
  <body>
  	<nav class="navbar navbar-expand-lg navbar-light bg-light" style="background-color: #2900ecbf !important;">
	  <a class="navbar-brand" style="color:white;font-weight: bold" href="#">EuSugiro.com</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <div class="collapse navbar-collapse" id="navbarNav">
	    <ul class="navbar-nav">
	      <li class="nav-item active">
	        <a class="nav-link" style="color: white;" href="#">Home <span class="sr-only">(current)</span></a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" style="color: white;" href="#">Features</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" style="color: white;" href="#">Pricing</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link disabled" style="color: white;" href="#">Disabled</a>
	      </li>
	    </ul>
	  </div>
	</nav>
	
    <div class="container-fluid" style="margin-top: 20px">
	  <h2>Lista de Usuarios</h2>
	  <p>Usuarios cadastrados na base de dados</p>            
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Nome</th>
          	<th>&nbsp;</th>
	      </tr>
	    </thead>
	    <tbody>
	    
	    	<c:forEach var="objUsuario" items="${listaUsuario}">
				<tr>
					<td width="10%">${objUsuario.idUsuario}</i></td>
					<td width="60%">${objUsuario.nome}</td>
					<td width="20%" style="text-align: right;"><button type="button" class="btn btn-warning"><i class="fas fa-edit"></i></button> <button type="button" class="btn btn-danger"><i class="far fa-trash-alt"></i></button></td>
				</tr>
			</c:forEach>
	     
	    </tbody>
	  </table>
	</div>


    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
  </body>
</html>