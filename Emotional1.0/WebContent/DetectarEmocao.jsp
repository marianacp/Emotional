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
      <!--DETECTAR ROSTO-->
      <p>E aí, ${sessionScope.usuarioLogado.nome}, que tal detectarmos sua emoção hoje?</p>
      <div id="emocao">
        <form name="formEmocao" action="detectarEmocao" method="get" enctype="text/plain" autocomplete="off"> 
          <h1>Emoção</h1> 
           
          <p> 
            <label for="nome">Nome</label>
            <input id="nome" name="nome" required="required" type="text" placeholder="nome" />
          </p>
		  
		   <p> 
            <label for="imagem">Rosto</label>
            <input id="imagem" type="file" name="imagem" required="required" />
          </p>
		  
           
          <p> 
            <input type="submit" value="Detectar" name="Detectar"/> 
          </p>
           

        </form>
      </div>
    </div>
  </div>  
</body>
</html>