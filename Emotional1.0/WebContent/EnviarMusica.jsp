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
	  <p>${mensagens.erros}</p>
      <p>Olá, ${sessionScope.usuarioLogado.nome}, vamos enviar uma música??</p>
      <div id="enviarMusica">
        <form name="formMusica" action="enviarMusica" method="get" enctype="text/plain" autocomplete="off"> 
          <h1>Envio de Música</h1> 
           
          <p> 
            <label for="nome">Nome da Música</label>
            <input id="nome" name="nome" required="required" type="text" placeholder="nome" />
          </p>
          
          <p> 
            <label for="autor">Autor</label>
            <input id="autor" name="autor" required="required" type="text" placeholder="autor" />
          </p>
          
          <p> 
            <label for="estilo">Estilo</label>
            <select id="estilo" name="estilo">
  			<option value="Sertanejo">Sertanejo</option>
  			<option value="Rock">Rock</option>
  			<option value="Pop">Pop</option>
  			<option value="Funk">Funk</option>
  			<option value="Mpb">MPB</option>
  			<option value="Outro">Outro</option>
</select>
          </p>
		  
		  
		  <p> 
            <label for="emocao">Como você definiria esta música?</label>
            <select id="emocao" name="emocao">
  			<option value="Felicidade">Alegre</option>
  			<option value="Tristeza">Triste</option>
  			<option value="Raiva">Calma</option>
			<option value="Surpresa">Inspiradora</option>
            <option value="Neutralidade">Normal</option>
            <option value="Felicidade">Avassaladora</option>
			<option value="Surpresa">Outro</option>
</select>
          </p>
          
   		<label for="musica">Muito bem, ${sessionScope.usuarioLogado.nome}, agora envie a sua música.</label>
          
          <p>Não esqueça do formato MP3!</p>
          
			<input id="musica" name="musica" type="file" accept=".mp3,audio/*">
         
		  
           
          <p> 
            <input type="submit" value="Enviar Musica" name="EnviarEnviar"/> 
          </p>
           

        </form>
      </div>
    </div>
  </div>  
</body>
</html>