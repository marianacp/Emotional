<!DOCTYPE html>
<head>
  <meta charset="UTF-8" />
  <title>Emotional</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
  <meta name="google-signin-scope" content="profile email">
  <meta name="google-signin-client_id" content="900025801880-uodctlul1qu1m0qh28a8uov9k4pcmj6n.apps.googleusercontent.com">
  <link rel="stylesheet" type="text/css" href="estilo.css" />
  <script src="https://apis.google.com/js/platform.js" async defer></script>
</head>
<body>
  <div class="container" >
    <a class="links" id="paracadastro"></a>
    <a class="links" id="paralogin"></a>
     
    <div class="content">      
      <!--FORMULÁRIO DE LOGIN-->
      <div id="login">
        <form method="post" action=""> 
          <h1>Login</h1> 
          <p> 
            <label for="email">E-mail</label>
            <input id="email" name="email" required="required" type="text" placeholder="ex. contato@htmlecsspro.com"/>
          </p>
           
          <p> 
            <label for="senha">Senha</label>
            <input id="senha" name="senha" required="required" type="password" placeholder="ex. senha" /> 
          </p>
		  
           
          <p> 
            <input type="checkbox" name="manterlogado" id="manterlogado" value="" /> 
            <label for="manterlogado">Manter-me logado</label>
          </p>
		  
		  <p> 
            	
         <div class="g-signin2" data-onsuccess="onSignIn" data-theme="dark"></div>
    <script>
      function onSignIn(googleUser) {
        // Useful data for your client-side scripts:
        var profile = googleUser.getBasicProfile();
        console.log("ID: " + profile.getId()); // Don't send this directly to your server!
        console.log('Full Name: ' + profile.getName());
        console.log('Given Name: ' + profile.getGivenName());
        console.log('Family Name: ' + profile.getFamilyName());
        console.log("Image URL: " + profile.getImageUrl());
        console.log("Email: " + profile.getEmail());
        // The ID token you need to pass to your backend:
        var id_token = googleUser.getAuthResponse().id_token;
        console.log("ID Token: " + id_token);
      };
    </script>
          </p>
           
          <p> 
            <input type="submit" value="Logar" /> 
          </p>
           
          <p class="link">
            Ainda não tem conta?
            <a href="#paracadastro">Cadastre-se</a>
          </p>
        </form>
      </div>
 
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
            <a href="#paralogin"> Ir para Login </a>
          </p>
        </form>
      </div>
    </div>
  </div>  
</body>
</html>
