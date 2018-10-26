<!DOCTYPE html>
<html lang="pt-BR">
<head>
  <meta charset="UTF-8" />
  <title>Emotional</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
  <link rel="stylesheet" type="text/css" href="css/estilo.css" /> 
  <link rel="shortcut icon" type="image/png" href="img/123.png"/>	
</head>
<body>
<div class="container" >
  <div class="content"> 
      <!--FORMULÃRIO PARA ENVIO DE AJUDA-->
      <div id="suporte">

        <form name="formSup" action="faleConosco" method="get" enctype="text/plain" autocomplete="off"> 
          <h1>Deixe sua dúvida</h1> 


           
          <p> 
            <label for="nome">Nome</label>
            <input id="nome" name="nome" required="required" type="text" placeholder="nome" />
          </p>
		  
           
          <p> 
            <label for="email">E-mail</label>
            <input id="email" name="email" required="required" type="email" placeholder="seunome@exemplo.com"/> 
          </p>
           
		   <p> 
            <label for="duvida">Deixe aqui sua d&uacute;vida</label>
            <input id="duvida" name="duvida" required="required" type="textarea"/>
          </p>
		  
           
          <p> 
            <input type="submit" value="Enviar" name="Enviar"/> 
          </p>
           
          <p class="link">  
            Deseja voltar ao in&iacute;cio?
            <a href=Index.jsp> P&aacute;gina Inicial </a>
          </p>
        </form>
      </div>
    </div>
  </div>  
</body>
</html>
