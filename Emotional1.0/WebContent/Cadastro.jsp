<!DOCTYPE html>
<html lang="pt-BR">
<head>
  <meta charset="UTF-8" />
  <title>Emotional</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
  <link rel="stylesheet" type="text/css" href="css/estilo.css" />
</head>
<body>
  <div class="container" >
  <div class="content"> 
      <!--FORMULÁRIO DE CADASTRO-->
      <div id="cadastro">
        <form name="formCad" action="teste1.jsp" method="get" enctype="text/plain" autocomplete="off"> 
          <h1>Cadastro</h1> 
           
          <p> 
            <label for="nome">Nome</label>
            <input id="nome" name="nome" required="required" type="text" placeholder="nome" />
          </p>
		  
		  <p> 
            <label for="apelido">Apelido</label>
            <input id="apelido" name="apelido" required="required" type="text" placeholder="apelido" />
          </p>
		  
           
          <p> 
            <label for="email">E-mail</label>
            <input id="email" name="email" required="required" type="email" placeholder="seunome@exemplo.com"/> 
          </p>
           
          <p> 
            <label for="senha_cad">Senha</label>
            <input id="senha" name="txtSenha" required="required" type="password" placeholder="ex. 1234"/>
          </p>
		  
		   <p> 
            <label for="imagem">Foto Perfil</label>
            <input id="imagem" type="file" name="imagem" required="required" />
          </p>
		  
		   <p> 
            <label for="dataNascimento">Data de Nascimento</label>
            <input id="dataNascimento" name="dataNascimento" required="required" type="date" />
          </p>
		  
           
          <p> 
            <input type="submit" value="Cadastrar" name="Cadastrar"/> 
          </p>
           
          <p class="link">  
            Já tem conta?
            <a href=Login.jsp> Ir para Login </a>
          </p>
        </form>
      </div>
    </div>
  </div>  
</body>
</html>
