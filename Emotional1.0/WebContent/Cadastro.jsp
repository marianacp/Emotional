<!DOCTYPE html>
<html lang="pt-BR">
<head>
  <meta charset="UTF-8" />
  <title>Emotional | Cadastro </title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
  <link rel="stylesheet" type="text/css" href="css/estilo.css" />
  <link rel="shortcut icon" type="image/png" href="img/123.png"/>
</head>
<body>
            
  <div class="container" >
  <div class="content"> 
      <!--FORMULÃRIO DE CADASTRO-->
      <div id="cadastro">
      <p>${mensagens.erros}</p>
        <form name="formCad" action="cadastroUsuario" method="get" enctype="text/plain" autocomplete="off"> 
          <h1>Cadastro</h1> 
           
          <p> 
            <label for="nome">Nome</label>
            <input id="nome" name="nome" required="required" type="text" placeholder="nome" />
          </p>
		  
		  <p> 
            <label for="username">Username</label>
            <input id="username" name="username" required="required" type="text" placeholder="apelido" />
          </p>
		  
            <p> 
            <label for="cpf">CPF</label>
            <input id="cpf" name="cpf" required="required" type="text" placeholder="Insira somente números"/> 
          </p>
          
          <p> 
            <label for="email">E-mail</label>
            <input id="email" name="email" required="required" type="email" placeholder="seunome@exemplo.com"/> 
          </p>
           
          <p> 
            <label for="senha_cad">Senha</label>
            <input id="senha" name="senha" required="required" type="password" placeholder="ex. 1234"/>
          </p>
		  
		   <p> 
            <label for="imagem">Foto Perfil</label>
            <input id="imagem" type="file" name="imagem" required="required" />
          </p>
		  
		   <p> 
            <label for="dataNascimento">Data de Nascimento</label>
            <input id="dataNascimento" name="dataNascimento" required="required" type="text" placeholder="dd/mm/aaaa"/>
          </p>
		  
		  
		  <p>
		  <label for="tipoUsuario">Você se considera um Artista ou um Ouvinte?</label>
   <p>
    <label> Artista</label>
    <p>
    <input type="radio" name="tipoUsuario" value="artista">
    <p>
	<label> Ouvinte </label>
	<p>
	<input type="radio" name="tipoUsuario" value="ouvinte"> 

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
