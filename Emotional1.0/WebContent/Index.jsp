<!DOCTYPE html>
<<<<<<< HEAD:Emotional1.0/WebContent/Index.jsp
<html lang="pt-BR">
             <head>
                 <title>Emotional</title>
                  <meta name="google-signin-scope" content="profile email">
    <meta name="google-signin-client_id" content="900025801880-uodctlul1qu1m0qh28a8uov9k4pcmj6n.apps.googleusercontent.com">
    <script src="https://apis.google.com/js/platform.js" async defer></script>
             </head>
             <body>
                 <h1>Descubra a sua emoï¿½ï¿½o!</h1>
                 
                   <p><a href=Cadastro.jspï¿½ï¿½>Clique aqui</a> para Cadastro.</p>
                 
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
    
             </body>
         </html>
=======
<html lang="pt">
   <head>
      <meta charset="utf-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta name="description" content="">
      <meta name="author" content="">
	  <link rel="icon" href="img/logo1.png" type="image/x-icon" />
      <title>Música para todos - EMOTIONAL</title>
      <!-- Css -->
      <link href="css/bootstrap.css" rel="stylesheet">
      <link href="css/style.css" rel="stylesheet">
	  
   </head>
   <body>
      <nav class="navbar navbar-default navbar-fixed-top">
         <div class="col-md-12">
            <div class="nav">
               <button class="btn-nav">
               <span class="icon-bar inverted top"></span>
               <span class="icon-bar inverted middle"></span>
               <span class="icon-bar inverted bottom"></span>
               </button>
            </div>
            <a class="navbar-brand" href="index.html">
            <img class="logo" src="img/logo1.png" alt="logo">
            </a>
            <div class="nav-content hideNav hidden">
               <ul class="nav-list vcenter">
                  <li class="nav-item"><a class="item-anchor" href="Login.jsp">Entrar</a></li>
                  <li class="nav-item"><a class="item-anchor" href="Cadastro.jsp">Inscrever-se</a></li>
                  <li class="nav-item"><a class="item-anchor" href="portfolio.html">Ajuda</a></li>
                  <li class="nav-item"><a class="item-anchor" href="contact.html">Contato</a></li>
               </ul>
            </div>
         </div>
      </nav>
      <!-- Header -->
      <div class="span12">
         <div class="col-md-6 no-gutter text-center fill">
            <h2 class="vcenter">Sentimentos para a sua música</h2>
         </div>
         <div class="col-md-6 no-gutter text-center">
            <div id="header" data-speed="2" data-type="background">
               <div id="headslide" class="carousel slide" data-ride="carousel">
                  <div class="carousel-inner" role="listbox">
                     <div class="item active">
                        <img src="img/download4.jpg" alt="Slide">
                     </div>
					 <div class="item">
                        <img src="img/download5.jpg" alt="Slide">
                     </div>
                     <div class="item">
                        <img src="img/download3.jpg" alt="Slide">
                     </div>
                     <div class="item">
                        <img src="img/download.jpg" alt="Slide">
                     </div>
                     <div class="item">
                        <img src="img/download1.jpg" alt="Slide">
					 </div>
                     <div class="item">
                        <img src="img/download2.jpg" alt="Slide">
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </div>
      <div style="clear:both;"></div>
      <!-- script -->
      <script src="js/jquery.js"></script>
      <script src="js/bootstrap.min.js"></script>
      <script src="js/menu-color.js"></script>
      <script src="js/modernizr.js"></script>
      <script src="js/script.js"></script>
   </body>
</html>
>>>>>>> 935b9949e4224afc27a2342d307499cac48b4a6f:Emotional1.0/WebContent/index.jsp
