<!DOCTYPE html>
<html lang="pt-BR">
<head>
  <meta charset="UTF-8" />
  <title>Emotional</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
  <meta name="google-signin-scope" content="profile email">
  <meta name="google-signin-client_id" content="900025801880-uodctlul1qu1m0qh28a8uov9k4pcmj6n.apps.googleusercontent.com">
  <link rel="stylesheet" type="text/css" href="css/estilo.css" />

<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://apis.google.com/js/platform.js" async defer></script>

</head>
<body>
  <div class="container" >    
    <div class="content">      
      <!--FORMUL��RIO DE LOGIN-->
      <div id="login">


		<p>${mensagens.erros}</p>
		
        <form method="post" action="index.jsp"> 

          <h1>Login</h1> 
          <p> 
            <label for="email">E-mail</label>
            <input id="email" name="email" required="required" type="text" placeholder="ex. contato@email.com"/>
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
//         var profile = googleUser.getBasicProfile();
//         console.log('ID: ' + profile.getId());
//         console.log('Name: ' + profile.getName());
//         console.log('Image URL: ' + profile.getImageUrl());
//         console.log('Email: ' + profile.getEmail());
//         console.log('id_token: ' + googleUser.getAuthResponse().id_token);

//         //do not post all above info to the server because that is not secure.
//         //just send the id_token

//         var redirectUrl = 'login';

//         //using jquery to post data dynamically
//         var form = $('<form action="' + redirectUrl + '" method="post">' +
//                          '<input type="text" name="id_token" value="' +
//                           googleUser.getAuthResponse().id_token + '" />' +
//                                                                '</form>');
//         $('body').append(form);
//         form.submit();
     }
    </script>
          </p>
           
          <p> 
            <input type="submit" name="bOK" value="Logar" /> 
          </p>
           
          <p class="link">
            Ainda n&atilde;o tem conta?
            <a href="Cadastro.jsp">Cadastre-se</a>
          </p>
    </form>
  </div>
  </div>
  </div>
 </body>
</html> 
