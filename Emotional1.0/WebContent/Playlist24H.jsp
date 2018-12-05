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

      <p>Olá, ${sessionScope.usuarioLogado.nome}, essas foram as musicas geradas:</p>
      
      
      <p>Playlist Nome: ${playlist} } </p>
      <div id="buscarMusica">

  <c:forEach items="${musicas}" var="musica">
				
  
   <p>${musica.titulo_musica}</p>
  <audio controls>
   
  	<source src="${musica.arquivo_musica}" type="audio/mp3">

</audio>

<form name="formDenunciaMusica" action="${pageContext.request.contextPath}/DenunciarMusica.jsp"> 
	<input type="hidden" name="id_musica" value="${musica.id_musica}" >
	
	<input type="submit" value="Denunciar" >
</form>

<form name="formClassificarMusica" action="${pageContext.request.contextPath}/ClassificarMusica.jsp"> 
	<input type="hidden" name="id_musica" value="${musica.id_musica}" >
	
	<input type="submit" value="Classificar" >
</form>
</c:forEach>
		  
           <form name="formDenunciaMusica" action="${pageContext.request.contextPath}/EnviarFeedback.jsp">    
          <p> 
            <input type="submit" value="Enviar Feedback" name="enviarFeedback"/> 
          </p>
           </form>

       
      </div>
    </div>
  </div>  
</body>
</html>