<!DOCTYPE html>
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

      <p>Olá, ${sessionScope.usuarioLogado.nome}, essas são as buscas encontradas:</p>
      <div id="buscarMusica">
        <form name="formMusica" action="buscarMusica" method="get" enctype="text/plain" autocomplete="off"> 
          <c:forEach items="${musicas}" var="musica">
  <audio controls>
    <p>${musica.titulo_musica}</p>
  	<source src="${musica.arquivo_musica}" type="audio/mp3">
	Your browser does not support the audio element.
</audio>
    --------------------
</c:forEach>
          
     
		  
           
          <p> 
            <input type="submit" value="Buscar Musica" name="buscarMusica"/> 
          </p>
           

        </form>
      </div>
    </div>
  </div>  
</body>
</html>