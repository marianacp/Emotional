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

      <p>Olá, ${sessionScope.usuarioLogado.nome}, vamos buscar uma música??</p>
      <div id="buscarMusica">
        <form name="formMusica" action="enviarMusica" method="get" enctype="text/plain" autocomplete="off"> 
          <h1>Buscar Música</h1> 
           
          <p> 
            <label for="nome">Nome da Música</label>
            <input id="nome" name="nome" required="required" type="text" placeholder="nome" />
          </p>
          
          <p> 
            <label for="autor">Autor</label>
            <input id="autor" name="autor" required="required" type="text" placeholder="autor" />
          </p>
          
         <audio controls>
  	<source src="C:\Users\USER\Music\Playlists\Natal.mp3" type="audio/mp3">
	Your browser does not support the audio element.
</audio>
		  
           
          <p> 
            <input type="submit" value="Buscar Musica" name="buscarMusica"/> 
          </p>
           

        </form>
      </div>
    </div>
  </div>  
</body>
</html>