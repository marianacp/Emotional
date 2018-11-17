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
                  <li class="nav-item"><a class="item-anchor" href="Login.jsp">Entrar</a></li>
                  <li class="nav-item"><a class="item-anchor" href="Cadastro.jsp">Inscrever-se</a></li>
                  <li class="nav-item"><a class="item-anchor" href="PerguntasFrequentes.jsp">Ajuda</a></li>
                  <li class="nav-item"><a class="item-anchor" href="FaleConosco.jsp">Contato</a></li>
               </ul>
            </div>
  <div class="container" >
  <div class="content"> 
      <!--DETECTAR ROSTO-->
      <div id="cadastro">
        <form name="formEmocao" action="detectarEmocao" method="get" enctype="text/plain" autocomplete="off"> 
          <h1>Cadastro</h1> 
           
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
           
          <p class="link">  
            J&aacute; tem conta?
            <a href=Login.jsp> Ir para Login </a>
          </p>
        </form>
      </div>
    </div>
  </div>  
</body>
</html>