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

<p>${mensagens.erros}</p>
		



	<form action = "denunciarMusica">
	

			<input type="hidden" name="id_musica" value="${param.id_musica}" >
            <input type="text" id="descricao" name="denunciarMusica"/> 
         
           	  
           
          <p> 
            <input type="submit" value="Denunciar" name="denunciarMusica"/> 
          </p>
           
		</form>
       
      </div>
    </div>
  </div>  
</body>
</html>