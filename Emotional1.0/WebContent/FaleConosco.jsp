<!DOCTYPE HTML>
<html>
<head>
<title>Emotional | Fale Conosco</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Mosaic Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
 <!-- Bootstrap Core CSS -->
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- Custom CSS -->
<link href="css/style2.css" rel='stylesheet' type='text/css' />
<!-- Graph CSS -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- jQuery -->
<!-- lined-icons -->
<link rel="stylesheet" href="css/icon-font.css" type='text/css' />
<!-- //lined-favicon -->
<link rel="shortcut icon" type="image/png" href="img/123.png"/>	
 <!-- Meters graphs -->
<script src="js/jquery-2.1.4.js"></script>


</head> 
    	 <!-- /w3layouts-agile -->
 <body class="sticky-header left-side-collapsed"  onload="initMap()">
    <section>
      <!-- left side start-->
		<div class="left-side sticky-left-side">

			<!--logo and iconic logo start-->
			<div class="logo">
				<h1><a href="Menu.jsp">Emotion<span>al</span></a></h1>
			</div>
			<div class="logo-icon text-center">
				<a href="Menu.jsp">E </a>
			</div>
 	 <!-- /w3l-agile -->
			<!--logo and iconic logo end-->
			<div class="left-side-inner">

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
		 	 <!-- /w3l-agile -->
		<!-- left side end-->
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
									<form action="#" method="post">

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


												<!--//-->
												<ul class="next-top">
													<li><a class="ar" href="#"> <img src="images/arrow.png" alt=""/></a></li>
													<li><a class="ar2" href="#"><img src="images/arrow2.png" alt=""/></i></a></li>
														
											 </ul>	
											</div>
											<div class="col-md-4 login-pop">
												<div id="loginpop"> <a id="loginButton"><span>Olá ${sessionScope.usuarioLogado.nome} <i class="arrow glyphicon glyphicon-chevron-right"></i></span></a><a class="top-sign" href="${pageContext.request.contextPath}/logout.jsp"><i class="fa fa-sign-in"></i></a>
												</div>

											</div>
										<div class="clearfix"> </div>
								</div>
							<!-------->
						</div>
					<div class="clearfix"></div>
				</div>
			<!--notification menu end -->
			<!-- //header-ends -->
 	 <!-- /w3l-agileits -->
		<!-- //header-ends -->
				
							<div id="page-wrapper">
							
								<div class="inner-content">
								<div class="tittle-head">
											<h3 class="tittle">Onde Estamos </h3>
											<div class="clearfix"> </div>
										</div>
									<!-- /contact-->
									<div class="contact">
									 <div class="contact-left">
									<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3673.869897741387!2d-43.17081508572018!3d-22.955018084987262!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x99801b0b2c6eab%3A0xe94128f9ab152b4d!2sUNIRIO+-+CCET+-+Centro+de+Ci%C3%AAncias+Exatas+e+de+Tecnologia!5e0!3m2!1spt-BR!2sbr!4v1542763972139"></iframe>
									</div>
									<div class="contact-right">
										<p class="phn">+ 55 21 3843-4015</p>
										<p class="phn-bottom">Botafogo, Rio de Janeiro
												<span>Av. Pasteur, 458</span></p>
										<p class="lom">UNIRIO - CCET - Centro de Ciências Exatas e de Tecnologia</p>
									</div>
									<div class="clearfix"> </div>
									<div class="contact-left1">
										<h3>Entre em contato conosco <span>Deixe sua dúvida</span></h3>
										<div class="in-left">
										<form name="formSup" action="faleConosco" method="get" enctype="text/plain" autocomplete="off">
														<p class="your-para">Seu Nome :</p>
														<input id="nome" name="nome" required="required" type="text" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}">
								
														<p class="your-para">Seu e-mail :</p>
														<input id="email" name="email" required="required" type="text" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}" >
														
													

											</form>
										</div>
										<div class="in-right">
											<form>
												<textarea placeholder="" onfocus="this.value='';" onblur="if (this.value == '') {this.value = '';}" required=""></textarea>
												<input type="submit" value="Enviar" name="Enviar">
											</form>
										</div>
										<div class="clearfix"> </div>
									</div>
													<div class="contact-right1">
														<h3><span>Mídias Sociais</span></h3>
														<h4>Nullam ac urna velit pellentesque in <label>arcu tortor 
															Pellentesque nec</label></h4>
														<p>Nullam ac urna velit. Pellentesque in arcu tortor. 
															Pellentesque nec est et elit varius pulvinar eget vitae sapien. 
															Aenean vehicula accumsan gravida. Cum sociis natoque penatibus
															et magnis dis parturient montes, nascetur ridiculus mus. Phasellus 
															et lectus in urna consequat consectetur ut eget risus.</p>
															 <ul class=" side-icons con">
																		<li><a class="fb" href="#"></a></li>
																		<li><a class="twitt" href="#"></a></li>
																		<li><a class="goog" href="#"></a></li>
																		<li><a class="drib" href="#"></a></li>
																   </ul>
													</div>
													<div class="clearfix"> </div>
											<!-- //contact -->
											 	<!-- /w3l-agile -->
					</div>
			  <!--body wrapper end-->
			     <div class="footer">
				<div class="footer-grid">
					<h3>Navegação</h3>
					<ul class="list1">
					 <li><a href="Menu.jsp">Inicial</a></li>
					  <li><a href="Playlist24H.jsp">UmDia</a></li>
					  <li><a href="${pageContext.request.contextPath}/AdicionarAmigo.jsp">Adicionar Amigo</a></li>
					  <li><a href="Musica.jsp">Músicas</a></li>
					  <li><a href="Playlist.jsp">Playlists</a></li>
					  <li><a href="MeusFavoritos.jsp">Meus Favoritos</a></li>
					  <li><a href="FaleConosco.jsp">Contato</a></li>
				    </ul>
				</div>
							
				<div class="footer-grid">
					<h3>Emotional</h3>
				    <ul class="list1">
					  <li><a href="#" data-toggle="modal" data-target="#myModal5">Sua conta</a></li>
					  <li><a href="#">Informações</a></li>
					  <li><a href="#">Endereço</a></li>
					  <li><a href="#">Desconto</a></li>
					  <li><a href="#">Nossa história</a></li>
					  <li><a href="#">Termos de segurança</a></li>
				    </ul>
				</div>
				<div class="footer-grid">
					<h3>Suporte</h3>
					<ul class="list1">
					  <li><a href="FaleConosco.jsp">Fale Conosco</a></li>
					  <li><a href="PerguntasFrequentes.jsp">Perguntas Frequentes</a></li>
					  <li><a href="Suporte.jsp">Ajuda</a></li>
					  <li><a href="#">Mobile</a></li>
				    </ul>
				  </div>
					  <div class="footer-grid">
						<h3>Novidades</h3>
						<p class="footer_desc">Cadastre seu e-mail caso queira receber notificações sobre as novidades do site. </p>
						<div class="search_footer">
						 <form>
						   <input type="text" placeholder="Email...." required="">
						  <input type="submit" value="Enviar">
						  </form>
						</div>
					 </div>
					 <div class="footer-grid footer-grid_last">
						<h3>Sobre nós</h3>
						<p class="footer_desc">O Emotional é um sistema web com a intenção de gerar playlists personalizadas com base no humor através de um reconhecimento facial do usuário.</p>
						<p class="f_text">Telefone: +55 21 3843-4015</p>
						<p class="email">Email : &nbsp;<span><a href="#">info@emotional.com</a></span></p>	
					 </div>
					 <div class="clearfix"> </div>
				</div>
			</div>
        <!--footer section start-->
			<footer>
			   <p>Emotional - Música para todos :: Sentimentos para a sua música </a></p>
			</footer>
        <!--footer section end-->
 	 <!-- /w3l-agile -->
      <!-- main content end-->
         <!-- main content end-->
   </section>
  
<script src="js/jquery.nicescroll.js"></script>
<script src="js/scripts.js"></script>
<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.js"></script>
</body>
</html>