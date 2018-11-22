<!DOCTYPE HTML>
<html>
<head>
<title>Emotional | Home </title>
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
						<li><a href="${pageContext.request.contextPath}/EnviarMusica.jsp" data-toggle="modal"><i class="fa fa-th"></i><span>Enviar Música</span></a></li>
						<li><a href="Musica.jsp"><i class="lnr lnr-music-note"></i> <span>Músicas</span></a></li>						
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
												<div id="loginpop"> <a id="loginButton"><span> Olá ${sessionScope.usuarioLogado.nome}<i class="arrow glyphicon glyphicon-chevron-right"></i></span></a><a class="top-sign" href="${pageContext.request.contextPath}/logout.jsp"><i class="fa fa-sign-in"></i></a>
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
				
				      <div class="music-left">
					      <!--banner-section-->
							<div class="banner-section">
								<div class="banner">
									 <div class="callbacks_container">
										<ul class="rslides callbacks callbacks1" id="slider4">
											   	<li>
														<div class="banner-img">
															 <img src="images/11.jpg" class="img-responsive" alt="">
														 </div>
														<div class="banner-info">
																	  <h3>  </h3>
																	  <p>  <span>  </span></p>
														 </div>

												</li>
												<li>
													<div class="banner-img">
															 <img src="images/22.jpg" class="img-responsive" alt="">
														 </div>
														<div class="banner-info">
																	  <h3>  </h3>
																	  <p>  <span>  </span></p>
														 </div>


												</li>
												<li>
												 <div class="banner-img">
															 <img src="images/33.png" class="img-responsive" alt="">
														 </div>
														<div class="banner-info"> 
																	  <h3> </h3>
																	  <p> <span>  </span></p>
														 </div>

												 	 <!-- /w3layouts-agileits -->
												</li>
											</ul>
										</div>
										<!--banner-->
									<script src="js/responsiveslides.min.js"></script>
								 <script>
									// You can also use "$(window).load(function() {"
									$(function () {
									  // Slideshow 4
									  $("#slider4").responsiveSlides({
										auto: true,
										pager:true,
										nav:true,
										speed: 500,
										namespace: "callbacks",
										before: function () {
										  $('.events').append("<li>before event fired.</li>");
										},
										after: function () {
										  $('.events').append("<li>after event fired.</li>");
										}
									  });
								
									});
								  </script>
								<div class="clearfix"> </div>
							</div>
						</div>	
				<!--//End-banner-->
					<!--albums-->
					<!-- pop-up-box --> 
							<link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all">
							<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
							 <script>
									$(document).ready(function() {
									$('.popup-with-zoom-anim').magnificPopup({
										type: 'inline',
										fixedContentPos: false,
										fixedBgPos: true,
										overflowY: 'auto',
										closeBtnInside: true,
										preloader: false,
										midClick: true,
										removalDelay: 300,
										mainClass: 'my-mfp-zoom-in'
									});
									});
							</script>		
					<!--//pop-up-box -->
						<div class="albums">
								<div class="tittle-head">
									<h3 class="tittle">Lançamentos <span class="new">Novo</span></h3>
									<a href="index.html"><h4 class="tittle">Veja tudo</h4></a>
									<div class="clearfix"> </div>
								</div>
								<div class="col-md-3 content-grid">
								<a class="play-icon popup-with-zoom-anim" href="#small-dialog"><img src="images/v1.jpg" title="allbum-name"></a>
								<a class="button play-icon popup-with-zoom-anim" href="#small-dialog">Escute agora</a>
							</div>
							<div id="small-dialog" class="mfp-hide">
								<iframe src="https://player.vimeo.com/video/12985622"></iframe>
								
							</div>
							<div class="col-md-3 content-grid">
								<a class="play-icon popup-with-zoom-anim" href="#small-dialog"><img src="images/v2.jpg" title="allbum-name"></a>

								<a class="button play-icon popup-with-zoom-anim" href="#small-dialog">Escute agora</a>
							</div>
							<div class="col-md-3 content-grid">
								<a class="play-icon popup-with-zoom-anim" href="#small-dialog"><img src="images/v3.jpg" title="allbum-name"></a>

								<a class="button play-icon popup-with-zoom-anim" href="#small-dialog">Escute agora</a>
							</div>
							<div class="col-md-3 content-grid last-grid">
								<a class="play-icon popup-with-zoom-anim" href="#small-dialog"><img src="images/v4.jpg" title="allbum-name"></a>
	
								<a class="button play-icon popup-with-zoom-anim" href="#small-dialog">Escute agora</a>
							</div>
							<div class="col-md-3 content-grid">
								<a class="play-icon popup-with-zoom-anim" href="#small-dialog"><img src="images/v5.jpg" title="allbum-name"></a>

								<a class="button play-icon popup-with-zoom-anim" href="#small-dialog">Escute agora</a>
							</div>
							<div id="small-dialog" class="mfp-hide">
								<iframe src="https://player.vimeo.com/video/12985622"></iframe>
								
							</div>
							<div class="col-md-3 content-grid">
								<a class="play-icon popup-with-zoom-anim" href="#small-dialog"><img src="images/v6.jpg" title="allbum-name"></a>
		
								<a class="button play-icon popup-with-zoom-anim" href="#small-dialog">Escute agora</a>
							</div>
							<div class="col-md-3 content-grid">
								<a class="play-icon popup-with-zoom-anim" href="#small-dialog"><img src="images/v7.jpg" title="allbum-name"></a>

								<a class="button play-icon popup-with-zoom-anim" href="#small-dialog">Escute agora</a>
							</div>
							<div class="col-md-3 content-grid last-grid">
								<a class="play-icon popup-with-zoom-anim" href="#small-dialog"><img src="images/v8.jpg" title="allbum-name"></a>
												<a class="button play-icon popup-with-zoom-anim" href="#small-dialog">Escute agora</a>
											</div>
											<div class="clearfix"> </div>
										</div>
					<!--//End-albums-->
						<!--//discover-view-->
						
						<div class="albums second">
										<div class="tittle-head">
											<h3 class="tittle">Novidades <span class="new">Conheça</span></h3>
											<a href="index.html"><h4 class="tittle two">Veja todos</h4></a>
											<div class="clearfix"> </div>
										</div>
											<div class="col-md-3 content-grid">
												<a href="single.html"><img src="images/v11.jpg" title="allbum-name"></a>
												<div class="inner-info"><a href="single.html"><h5>Pop</h5></a></div>
											</div>
											<div class="col-md-3 content-grid">
													<a href="single.html"><img src="images/v22.jpg" title="allbum-name"></a>
													<div class="inner-info"><a href="single.html"><h5>Pop</h5></a></div>
												</div>
											<div class="col-md-3 content-grid">
													<a href="single.html"><img src="images/v33.jpg" title="allbum-name"></a>
													<div class="inner-info"><a href="single.html"><h5>Pop</h5></a></div>
												</div>
											<div class="col-md-3 content-grid last-grid">
													<a href="single.html"><img src="images/v44.jpg" title="allbum-name"></a>
													<div class="inner-info"><a href="single.html"><h5>Pop</h5></a></div>
											</div>
											<div class="col-md-3 content-grid">
													<a href="single.html"><img src="images/v55.jpg" title="allbum-name"></a>
													<div class="inner-info"><a href="single.html"><h5>Pop</h5></a></div>
											</div>
											<div class="col-md-3 content-grid">
												<a href="single.html"><img src="images/v66.jpg" title="allbum-name"></a>
												<div class="inner-info"><a href="single.html"><h5>Pop</h5></a></div>
											</div>
											<div class="col-md-3 content-grid">
													<a href="single.html"><img src="images/v11.jpg" title="allbum-name"></a>
													<div class="inner-info"><a href="single.html"><h5>Pop</h5></a></div>
											</div>
											<div class="col-md-3 content-grid last-grid">
													<a href="single.html"><img src="images/v22.jpg" title="allbum-name"></a>
													<div class="inner-info"><a href="single.html"><h5>Pop</h5></a></div>
											</div>
											<div class="clearfix"> </div>
									</div>
								<!--//discover-view-->
							</div>
							<!--//music-left-->
						    <!--/music-right-->
						   <div class="music-right">
								<!--/video-main-->
								 <div class="video-main">
									<div class="video-record-list">
										<div id="jp_container_1" class="jp-video jp-video-270p" role="application" aria-label="media player">
											<div class="jp-type-playlist">
												<div id="jquery_jplayer_1" class="jp-jplayer" style="width: 480px; height: 270px;"><img id="jp_poster_0" src="video/play1.png" style="width: 480px; height: 270px; display: inline;"><video id="jp_video_0" preload="metadata" src="http://192.168.30.9/vijayaa/2015/Dec/mosaic/web/video/Ellie-Goulding.webm" title="1. Ellie-Goulding" style="width: 0px; height: 0px;"></video></div>
												<div class="jp-gui">
													<div class="jp-video-play" style="display: block;">
														<button class="jp-video-play-icon" role="button" tabindex="0">play</button>
													</div>
													<div class="jp-interface">
														<div class="jp-progress">
															<div class="jp-seek-bar" style="width: 100%;">
																<div class="jp-play-bar" style="width: 0%;"></div>
															</div>
														</div>
														<div class="jp-current-time" role="timer" aria-label="time">00:00</div>
														<div class="jp-duration" role="timer" aria-label="duration">00:18</div>
														<div class="jp-controls-holder">
															<div class="jp-controls">
																<button class="jp-previous" role="button" tabindex="0">previous</button>
																<button class="jp-play" role="button" tabindex="0">play</button>
															</div>
															<div class="jp-volume-controls">
																<button class="jp-mute" role="button" tabindex="0">mute</button>
																<button class="jp-volume-max" role="button" tabindex="0">max volume</button>
																<div class="jp-volume-bar">
																	<div class="jp-volume-bar-value" style="width: 100%;"></div>
																</div>
															</div>
															<div class="jp-toggles">
															
																<button class="jp-full-screen" role="button" tabindex="0">full screen</button>
															</div>
														</div>
														<div class="jp-details" style="display: none;">
															<div class="jp-title" aria-label="title">1. Ellie-Goulding</div>
														</div>
													</div>
												</div>
												<div class="jp-playlist">
													<ul style="display: block;"><li class="jp-playlist-current"><div><a href="javascript:;" class="jp-playlist-item-remove" style="display: none;">×</a><a href="javascript:;" class="jp-playlist-item jp-playlist-current" tabindex="0">1. Ellie-Goulding <span class="jp-artist">by Pixar</span></a></div></li><li><div><a href="javascript:;" class="jp-playlist-item-remove" style="display: none;">×</a><a href="javascript:;" class="jp-playlist-item" tabindex="0">2. Mark-Ronson-Uptown <span class="jp-artist">by Pixar</span></a></div></li><li><div><a href="javascript:;" class="jp-playlist-item-remove" style="display: none;">×</a><a href="javascript:;" class="jp-playlist-item" tabindex="0">3. Ellie-Goulding <span class="jp-artist">by Pixar</span></a></div></li><li><div><a href="javascript:;" class="jp-playlist-item-remove" style="display: none;">×</a><a href="javascript:;" class="jp-playlist-item" tabindex="0">4. Maroon-Sugar <span class="jp-artist">by Pixar</span></a></div></li><li><div><a href="javascript:;" class="jp-playlist-item-remove" style="display: none;">×</a><a href="javascript:;" class="jp-playlist-item" tabindex="0">5. Pharrell-Williams <span class="jp-artist">by Pixar</span></a></div></li><li><div><a href="javascript:;" class="jp-playlist-item-remove" style="display: none;">×</a><a href="javascript:;" class="jp-playlist-item" tabindex="0">6. Ellie-Goulding <span class="jp-artist">by Pixar</span></a></div></li><li><div><a href="javascript:;" class="jp-playlist-item-remove" style="display: none;">×</a><a href="javascript:;" class="jp-playlist-item" tabindex="0">7. Pharrell-Williams <span class="jp-artist">by Pixar</span></a></div></li></ul>
												</div>
												<div class="jp-no-solution" style="display: none;">
													<span>Atualização Requerida</span>
													Para ouvir esta música você precisará atualizar a versão do seu browser para uma versão mais recente ou baixar o <a href="http://get.adobe.com/flashplayer/" target="_blank">Flash plugin</a>.
												</div>
											</div>
										</div>
									</div>
								</div>
								<!-- script for play-list -->
				<link href="css/jplayer.blue.monday.min.css" rel="stylesheet" type="text/css">
				<script type="text/javascript" src="js/jquery.jplayer.min.js"></script>
				<script type="text/javascript" src="js/jplayer.playlist.min.js"></script>
				<script type="text/javascript">
				//<![CDATA[
				$(document).ready(function(){

					new jPlayerPlaylist({
						jPlayer: "#jquery_jplayer_1",
						cssSelectorAncestor: "#jp_container_1"
					}, [
						
						{
							title:"1. Ellie-Goulding",
							artist:"",
							mp4: "video/Ellie-Goulding.mp4",
							ogv: "video/Ellie-Goulding.ogv",
							webmv: "video/Ellie-Goulding.webm",
							poster:"video/play1.png"
						},
						{
							title:"2. Mark-Ronson-Uptown",
							artist:"",
							mp4: "video/Mark-Ronson-Uptown.mp4",
							ogv: "video/Mark-Ronson-Uptown.ogv",
							webmv: "video/Mark-Ronson-Uptown.webm",
							poster:"video/play2.png"
						},
						{
							title:"3. Ellie-Goulding",
							artist:"",
							mp4: "video/Ellie-Goulding.mp4",
							ogv: "video/Ellie-Goulding.ogv",
							webmv: "video/Ellie-Goulding.webm",
							poster:"video/play1.png"
						},
						{
							title:"4. Maroon-Sugar",
							artist:"",
							mp4: "video/Maroon-Sugar.mp4",
							ogv: "video/Maroon-Sugar.ogv",
							webmv: "video/Maroon-Sugar.webm",
							poster:"video/play4.png"
						},
						{
							title:"5. Pharrell-Williams",
							artist:"",
							mp4: "video/Pharrell-Williams.mp4",
							ogv: "video/Pharrell-Williams.ogv",
							webmv: "video/Pharrell-Williams.webm",
							poster:"video/play5.png"
						},
						{
							title:"6. Ellie-Goulding",
							artist:"",
							mp4: "video/Ellie-Goulding.mp4",
							ogv: "video/Ellie-Goulding.ogv",
							webmv: "video/Ellie-Goulding.webm",
							poster:"video/play1.png"
						},
						{
							title:"7. Pharrell-Williams",
							artist:"",
							mp4: "video/Pharrell-Williams.mp4",
							ogv: "video/Pharrell-Williams.ogv",
							webmv: "video/Pharrell-Williams.webm",
							poster:"video/play5.png"
						}
					], {
						swfPath: "../../dist/jplayer",
						supplied: "webmv,ogv,mp4",
						useStateClassSkin: true,
						autoBlur: false,
						smoothPlayBar: true,
						keyEnabled: true
					});

				});
				//]]>
					</script>
			<!-- //script for play-list -->

								<!--//video-main-->
								<!--/app_store-->
									  <div class="apps">
												<h3 class="hd-tittle">EM BREVE </h3>
												<div class="banner-button">
													<a href="#"><img src="images/1.png" alt=""></a>
												</div>
												<div class="banner-button green-button">
													<a href="#"><img src="images/2.png" alt=""></a>
												</div>
													<div class="clearfix"></div>
										</div>
								  <!--//app_store-->
						         <!--/start-paricing-tables-->
									<div class="price-section">
											<div class="pricing-inner">
												<h3 class="hd-tittle">Melhore seu plano</h3>
												<div class="pricing">
													<div class="price-top">
														<h3><span>R$20</span></h3>
														<h4>por ano</h4>
													</div>
													<div class="price-bottom">
														<ul>
															<li><a class="icon" href="#"><i class="glyphicon glyphicon-ok"></i></a><a class="text" href="#">Download de mais músicas </a><div class="clearfix"></div></li>
															<li><a class="icon" href="#"><i class="glyphicon glyphicon-ok"></i></a><a class="text" href="#">Músicas em alta definicção</a><div class="clearfix"></div></li>
															<li><a class="icon" href="#"><i class="glyphicon glyphicon-ok"></i></a><a class="text" href="#">Menos propagandas</a><div class="clearfix"></div></li>
															<li><a class="icon" href="#"><i class="glyphicon glyphicon-ok"></i></a><a class="text" href="#">Playlists com mais de 24H</a><div class="clearfix"></div></li>
														</ul>
														<a href="single.html" class="price">Dê um up!</a>
													</div>
												</div>
												<div class="pricing two">
													<div class="price-top">
														<h3><span>R$30</span></h3>
														<h4>por ano</h4>
													</div>
													<div class="price-bottom">
														<ul>
															<li><a class="icon" href="#"><i class="glyphicon glyphicon-ok"></i></a><a class="text" href="#">Download ilimitado de músicas</a><div class="clearfix"></div></li>
															<li><a class="icon" href="#"><i class="glyphicon glyphicon-ok"></i></a><a class="text" href="#">Músicas em alta definição</a><div class="clearfix"></div></li>
															<li><a class="icon" href="#"><i class="glyphicon glyphicon-ok"></i></a><a class="text" href="#">Sem propagandas</a><div class="clearfix"></div></li>
															<li><a class="icon" href="#"><i class="glyphicon glyphicon-ok"></i></a><a class="text" href="#">Criação de playlists</a><div class="clearfix"></div></li>
														</ul>
														<a href="single.html" class="price">Dê um up!</a>
													</div>
												</div>
													<div class="clearfix"></div>
												</div>
												<!--//end-pricing-tables-->
												</div>
											</div>
													 <!--//music-right-->
											<div class="clearfix"></div>
			 	 <!-- /w3l-agile-its -->
										</div>
						<!--body wrapper start-->
						
						<div class="review-slider">
								<div class="tittle-head">
									<h3 class="tittle">Álbuns em destaque <span class="new">Novos</span></h3>
									<div class="clearfix"> </div>
								</div>
								 <ul id="flexiselDemo1">
								<li>
									<a href="single.html"><img src="images/v1.jpg" alt=""/></a>
									<div class="slide-title"><h4>Adele21 </div>
									<div class="date-city">
										<h5>Jan-02-16</h5>
										<div class="buy-tickets">
											<a href="single.html"> MAIS</a>
										</div>
									</div>
								</li>
								<li>
									<a href="single.html"><img src="images/v2.jpg" alt=""/></a>
									<div class="slide-title"><h4>Adele21 </div>
									<div class="date-city">
										<h5>Jan-02-16</h5>
										<div class="buy-tickets">
											<a href="single.html">MAIS</a>
										</div>
									</div>
								</li>
								<li>
									<a href="single.html"><img src="images/v3.jpg" alt=""/></a>
									<div class="slide-title"><h4>Shomlock</h4></div>
									<div class="date-city">
										<h5>Jan-02-16</h5>
										<div class="buy-tickets">
											<a href="single.html">MAIS</a>
										</div>
									</div>
								</li>
								<li>
									<a href="single.html"><img src="images/v4.jpg" alt=""/></a>
									<div class="slide-title"><h4>Stuck on a feeling</h4></div>
									<div class="date-city">
										<h5>Jan-02-16</h5>
										<div class="buy-tickets">
											<a href="single.html">MAIS</a>
										</div>
									</div>
								</li>
								<li>
									<a href="single.html"><img src="images/v5.jpg" alt=""/></a>
									<div class="slide-title"><h4>Ricky Martine </h4></div>
									<div class="date-city">
										<h5>Jan-02-16</h5>
										<div class="buy-tickets">
											<a href="single.html">MAIS</a>
										</div>
									</div>
								</li>
								<li>
									<a href="single.html"><img src="images/v6.jpg" alt=""/></a>
									<div class="slide-title"><h4>Ellie Goluding </h4></div>
									<div class="date-city">
										<h5>Jan-02-16</h5>
										<div class="buy-tickets">
											<a href="single.html">MAIS</a>
										</div>
									</div>
								</li>
								<li>
									<a href="single.html"><img src="images/v6.jpeg" alt=""/></a>
									<div class="slide-title"><h4>Fifty Shades </h4></div>
									<div class="date-city">
										<h5>Jan-02-16</h5>
										<div class="buy-tickets">
											<a href="single.html">MAIS</a>
										</div>
									</div>
								</li>
							</ul>
							<script type="text/javascript">
						$(window).load(function() {
							
						  $("#flexiselDemo1").flexisel({
								visibleItems: 5,
								animationSpeed: 1000,
								autoPlay: true,
								autoPlaySpeed: 3000,    		
								pauseOnHover: false,
								enableResponsiveBreakpoints: true,
								responsiveBreakpoints: { 
									portrait: { 
										changePoint:480,
										visibleItems: 2
									}, 
									landscape: { 
										changePoint:640,
										visibleItems: 3
									},
									tablet: { 
										changePoint:800,
										visibleItems: 4
									}
								}
							});
							});
						</script>
						<script type="text/javascript" src="js/jquery.flexisel.js"></script>	
						</div>
								</div>
							<div class="clearfix"></div>
						<!--body wrapper end-->
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
					  <li><a href="${pageContext.request.contextPath}/EnviarMusica.jsp">Enviar Música</a></li>
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
   </section>
  
<script src="js/jquery.nicescroll.js"></script>
<script src="js/scripts.js"></script>
<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.js"></script>
</body>
</html>