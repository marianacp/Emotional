<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
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

      <p>Olá, ${sessionScope.usuarioLogado.nome}, gostaria de consultar as suas playlists do dia? :</p>
      
      <div id="buscarPlaylist">

  <c:forEach items="${musicas}" var="musica">
				
  
   <p>${musica.titulo_musica}</p>
  <audio controls>
   
  	<source src="${musica.arquivo_musica}" type="audio/mp3">

<<<<<<< HEAD
</audio>
=======
				<!--sidebar nav start-->
					<ul class="nav nav-pills nav-stacked custom-nav">
						<li class="active"><a href="Menu.jsp"><i class="lnr lnr-home"></i><span>Inicial</span></a></li>
						<li><a href="Playlist24H.jsp"><i class="camera"></i> <span>UmDia</span></a></li>
						<li><a href="${pageContext.request.contextPath}/AdicionarAmigo.jsp"><i class="lnr lnr-users"></i> <span>Adicionar Amigo</span></a></li> 
						<li><a href="${pageContext.request.contextPath}/DetectarEmocao.jsp" data-toggle="modal"><i class="fa fa-th"></i><span>Detectar Emoção</span></a></li>
						<li><a href="${pageContext.request.contextPath}/EnviarMusica.jsp"><i class="lnr lnr-music-note"></i> <span>Enviar Música</span></a></li>						
						<li class="menu-list"><a href="#"><i class="lnr lnr-indent-increase"></i> <span>Playlists</span></a>  
							<ul class="sub-menu-list">
							    <li><a href="Playlist.jsp">Todas</a> </li>
								<li><a href="Playlist.jsp">Felicidade</a> </li>
								<li><a href="Playlist.jsp">Tristeza</a> </li>
								<li><a href="Playlist.jsp">Raiva</a> </li>
								<li><a href="Playlist.jsp">Neutralidade</a> </li>
								<li><a href="Playlist.jsp">Surpresa</a> </li>
							</ul>
						</li>
						<li class="menu-list"><a href="#"><i class="lnr lnr-heart"></i>  <span>Meus Favoritos</span></a> 
							<ul class="sub-menu-list">
								<li><a href="MeusFavoritos.jsp">Playlists</a></li>
							</ul>
						</li>
						<li class="menu-list"><a href="#"><i class="fa fa-thumb-tack"></i><span>Contato</span></a>
							<ul class="sub-menu-list">
							    <li><a href="FaleConosco.jsp">Fale Conosco</a> </li>
							    <li><a href="PerguntasFrequentes.jsp">Perguntas Frequentes</a> </li>
								<li><a href="Suporte.jsp">Suporte</a> </li>
							</ul>
						</li>     
					</ul>
				<!--sidebar nav end-->
			</div>
		</div>
		<!-- left side end-->
					<!-- app-->
			<div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
				<div class="modal-dialog facebook" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>						
						</div>
						<div class="modal-body">
							<div class="app-grids">
								<div class="app">
						<div class="col-md-5 app-left mpl">
							<h3>Mosaic mobile app on your smartphone!</h3>
							<p>Download and Avail Special Songs Videos and Audios.</p>
							<div class="app-devices">
								<h5>Gets the app from</h5>
								<a href="#"><img src="images/1.png" alt=""></a>
								<a href="#"><img src="images/2.png" alt=""></a>
								<div class="clearfix"> </div>
							</div>
						</div>
						<div class="col-md-7 app-image">
							<img src="images/apps.png" alt="">
						</div>
						<div class="clearfix"></div>
					</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- //app-->
			 	 <!-- /w3l-agile -->
		<!-- signup -->
			<div class="modal fade" id="myModal5" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
				<div class="modal-dialog" role="document">
					<div class="modal-content modal-info">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>						
						</div>
						<div class="modal-body modal-spa">
							<div class="sign-grids">
								<div class="sign">
									<div class="sign-left">
										<ul>
											<li><a class="fb" href="#"><i></i>Sign in with Facebook</a></li>
											<li><a class="goog" href="#"><i></i>Sign in with Google</a></li>
											<li><a class="linkin" href="#"><i></i>Sign in with Linkedin</a></li>
										</ul>
									</div>
									<div class="sign-right">
										<form action="#" method="post">
											<h3>Create your account </h3>
											<input type="text" value="Name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Name';}" required="">
											<input type="text" value="Mobile number" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Mobile number';}" required="">
											<input type="text" value="Email id" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email id';}" required="">	
											<input type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}" required="">	
											
											<input type="submit" value="CREATE ACCOUNT" >
										</form>
									</div>
									<div class="clearfix"></div>								
								</div>
								<p>By logging in you agree to our <span>Terms and Conditions</span> and <span>Privacy Policy</span></p>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- //signup -->
 	 <!-- /agileits -->
		<!-- main content start-->
		<div class="main-content">
			<!-- header-starts -->
			<div class="header-section">
			<!--toggle button start-->
			<a class="toggle-btn  menu-collapsed"><i class="fa fa-bars"></i></a>
			<!--toggle button end-->
			<!--notification menu start -->
				<div class="menu-right">
					<div class="profile_details">		
						  <div class="col-md-4 serch-part">
								<div id="sb-search" class="sb-search">
									<form>
										<input class="sb-search-input" placeholder="Search" type="search" name="search" id="search">
										<input class="sb-search-submit" type="submit" value="">
										<span class="sb-icon-search"> </span>
									</form>
								</div>
							</div>
							  <!-- search-scripts -->
									<script src="js/classie.js"></script>
									<script src="js/uisearch.js"></script>
										<script>
											new UISearch( document.getElementById( 'sb-search' ) );
										</script>
									<!-- //search-scripts -->
											 <!---->
											  <div class="col-md-4 player">
													<div class="audio-player">
														<audio id="audio-player"  controls="controls">
														<source src="media/Blue Browne.ogg" type="audio/ogg"></source>
																<source src="media/Blue Browne.mp3" type="audio/mpeg"></source>
																<source src="media/Georgia.ogg" type="audio/ogg"></source>
																<source src="media/Georgia.mp3" type="audio/mpeg"></source></audio>
														</div>
												<!---->
												<script type="text/javascript">
													$(function(){
													  $('#audio-player').mediaelementplayer({
														alwaysShowControls: true,
														features: ['playpause','progress','volume'],
														audioVolume: 'horizontal',
														iPadUseNativeControls: true,
														iPhoneUseNativeControls: true,
														AndroidUseNativeControls: true
													});
												 });
												</script>
												<!--audio-->
													<link rel="stylesheet" type="text/css" media="all" href="css/audio.css">
													<script type="text/javascript" src="js/mediaelement-and-player.min.js"></script>
													<!---->
 	 <!-- /agileits -->
>>>>>>> Front

<form name="formDenunciaMusica" action="${pageContext.request.contextPath}/DenunciarMusica.jsp"> 
	<input type="hidden" name="id_musica" value="${musica.id_musica}" >
	
	<input type="submit" value="Denunciar" >
</form>


</c:forEach>
		  
           
           

       
      </div>
    </div>
  </div>  
</body>
</html>