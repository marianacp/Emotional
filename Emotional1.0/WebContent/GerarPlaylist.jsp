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

      <p>Olá, ${sessionScope.usuarioLogado.nome}, a emoção detectada para a sua foto foi: ${sentimento} </p>
      
      <div id="buscarMusica">



<p>Caso você queira tentar outra imagem, clique em Detectar Emocao. Caso queira gerar playlist baseada no seu humor, clique em Gerar Playlist! </p>
		
<form action = "${pageContext.request.contextPath}/DetectarEmocao.jsp">

 <input type="submit" value="Detectar Emocao" name="enviarEmocao"/> 
</form>
	<form action = "gerarPlaylist">
	

			<input type="hidden" name="id_musica" value="${sentimento}" >         
           	  
           
          <p> 
            <input type="submit" value="Gerar Playlist" name="gerarPlaylist"/> 
          </p>
           
		</form>
       
      </div>
    </div>
  </div>  
</body>
</html>