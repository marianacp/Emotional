<!DOCTYPE html>
<html lang="pt-BR">
<head>
  <meta charset="UTF-8" />
  <title>Emotional</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
  <meta name="google-signin-scope" content="profile email">
  <meta name="google-signin-client_id" content="900025801880-uodctlul1qu1m0qh28a8uov9k4pcmj6n.apps.googleusercontent.com">
  <link rel="stylesheet" type="text/css" href="css/estilo.css" />
  <script src="https://apis.google.com/js/platform.js" async defer></script>
</head>
<body>
  <div class="container" >    
    <div class="content">      
      <!--FORMULÁRIO DE LOGIN-->
      <div id="login">
        <form method="post" action="index.jsp"> 
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
            	
<div class="g-signin2" data-onsuccess="onSignIn" data-theme="dark" position="center"></div>
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
            <input type="submit" name="bOK" value="Logar" /> 
          </p>
           
          <p class="link">
            Ainda não tem conta?
            <a href="Cadastro.jsp">Cadastre-se</a>
          </p>
    </form>
  </div>
  </div>
  </div>
 </body>
</html> 
