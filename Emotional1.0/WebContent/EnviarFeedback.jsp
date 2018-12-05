<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<html lang="pt-BR">
<head>
  <meta charset="UTF-8" />
  <title>Emotional</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
  <link rel="stylesheet" type="text/css" href="css/estilo.css" />
</head>
<body>
            <div class="nav-content hideNav hidden">
               <ul class="nav-list vcenter">
                  <li class="nav-item"><a class="item-anchor" href="Menu.jsp">Menu</a></li>
                  <li class="nav-item"><a class="item-anchor" href="${pageContext.request.contextPath}/logout.jsp">Logout</a></li>

               </ul>
            </div>
  <div class="container" >
  <div class="content"> 

      <p>${sessionScope.usuarioLogado.nome}, O que achou da classificacao desta Playlist?</p>
      
      <div id="buscarMusica">


		



	<form action = "enviarFeedback">
	

			<input type="hidden" name="id_musica" value="${param.id_musica}" >
            
         <label for="emocao">Como você definiria esta Playlist?</label>
            <select id="emocao" name="emocao">
  			<option value="Felicidade">Alegre</option>
  			<option value="Tristeza">Triste</option>
  			<option value="Raiva">Calma</option>
			<option value="Surpresa">Inspiradora</option>
            <option value="Neutralidade">Normal</option>
            <option value="Felicidade">Avassaladora</option>
			<option value="Surpresa">Outro</option>
</select>

<input type="hidden" value="${playlist}" name="nome"/>
           	  
           
          <p> 
            <input type="submit" value="Classificar" name="classificarPlaylist"/> 
          </p>
           
		</form>
       
      </div>
    </div>
  </div>  
</body>
</html>