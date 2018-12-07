<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags-->
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="au theme template">
<meta name="author" content="Hau Nguyen">
<meta name="keywords" content="au theme template">

<!-- Title Page-->
<title>Bloquear/Desbloquear</title>

<!-- Fontfaces CSS-->
<link href="css/font-face.css" rel="stylesheet" media="all">
<link href="vendor/font-awesome-4.7/css/font-awesome.min.css"
	rel="stylesheet" media="all">
<link href="vendor/font-awesome-5/css/fontawesome-all.min.css"
	rel="stylesheet" media="all">
<link href="vendor/mdi-font/css/material-design-iconic-font.min.css"
	rel="stylesheet" media="all">

<!-- Bootstrap CSS-->
<link href="vendor/bootstrap-4.1/bootstrap.min.css" rel="stylesheet"
	media="all">

<!-- Vendor CSS-->
<link href="vendor/animsition/animsition.min.css" rel="stylesheet"
	media="all">
<link
	href="vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css"
	rel="stylesheet" media="all">
<link href="vendor/wow/animate.css" rel="stylesheet" media="all">
<link href="vendor/css-hamburgers/hamburgers.min.css" rel="stylesheet"
	media="all">
<link href="vendor/slick/slick.css" rel="stylesheet" media="all">
<link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
<link href="vendor/perfect-scrollbar/perfect-scrollbar.css"
	rel="stylesheet" media="all">

<!-- Main CSS-->
<link href="css/theme.css" rel="stylesheet" media="all">

</head>

<body class="animsition">
	<div class="page-wrapper">
		<!-- HEADER MOBILE-->


		<!-- MENU SIDEBAR-->
		<aside class="menu-sidebar d-none d-lg-block">
			<div class="logo">
				<a href="#"> <img src="images/icon/logo1.png" alt="Cool Admin" />
				</a>
			</div>
			<div class="menu-sidebar__content js-scrollbar1">
				<nav class="navbar-sidebar">
					<ul class="list-unstyled navbar__list">
						<li class="has-sub"><a class="js-arrow" href="MusicaADM.jsp">
								<i class="fas fa-tachometer-alt"> </i>Músicas
						</a></li>

						<li class="active"><a href="table.html"> <i
								class="fas fa-table"></i>Bloquear / Desbloquear
						</a></li>



					</ul>
				</nav>
			</div>
		</aside>
		<!-- END MENU SIDEBAR-->

		<!-- PAGE CONTAINER-->
		<div class="page-container">
			<!-- HEADER DESKTOP-->
			<header class="header-desktop">
				<div class="section__content section__content--p30">
					<div class="container-fluid">
						<div class="header-wrap">
							<div class="header-button">
								<div class="account-wrap">
									<div class="account-item clearfix js-item-menu">
										<div class="image">
											<img src="images/icon/avatar-01.jpg" alt="John Doe" />
										</div>
										<div class="content">
											<p>Olá, ${sessionScope.usuarioLogado.nome}</p>
										</div>
										<div class="account-dropdown js-dropdown">
											<div class="info clearfix">
												<div class="image">
													<a href="#"> <img src="images/icon/avatar-01.jpg"
														alt="John Doe" />
													</a>
												</div>
												<div class="content">
													<h5 class="name">
														<p>Olá, ${sessionScope.usuarioLogado.nome}</p>
													</h5>
													<span class="email">Olá,
														${sessionScope.usuarioLogado.email}</span>
												</div>
											</div>

											<div class="account-dropdown__body">
												<div class="account-dropdown__item">
													<a href="#"> <i class="zmdi zmdi-account"></i>Conta
													</a>
												</div>
												<div class="account-dropdown__item">
													<a href="#"> <i class="zmdi zmdi-settings"></i>Configuração
													</a>
												</div>
											</div>
											<div class="account-dropdown__footer">
												<a href="#"> <i class="zmdi zmdi-power"></i>Logout
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</header>

			<!-- END HEADER DESKTOP-->

			<!-- MAIN CONTENT-->
			<div class="main-content">
				<div class="section__content section__content--p30">
					<div class="container-fluid">
						<div class="row">
							<div class="col-md-12">
								<!-- DATA TABLE -->
								<h3 class="title-5 m-b-35">Bloquear / Desbloquear usuário</h3>

								<div id="sb-search" class="sb-search">
									<form action="buscarUsuario" method="get">

										<input class="sb-search-input" placeholder="Search"
											type="search" name="search" id="search"> <input
											class="sb-search-submit" type="submit" value="search">
										<span class="sb-icon-search"> </span>
									</form>
								</div>

								<!-- search-scripts -->
								<script src="js/classie.js"></script>
								<script src="js/uisearch.js"></script>
								<script>
									new UISearch(document
											.getElementById('sb-search'));
								</script>
								<!-- //search-scripts -->

								<div class="table-responsive table-responsive-data2">
									<table class="table table-data2">
										<thead>
											<tr>

												<th>Nome</th>
												<th>email</th>
												<th>status</th>
												<th></th>
											</tr>
										</thead>
										<tbody>
											<tr class="tr-shadow">
												<td>${sessionScope.usuarioLogado.nome}</td>
												<td><span class="block-email">${sessionScope.usuarioLogado.email}</span>
												</td>

												<td><span class="status--process">Processada</span></td>

												<td>
													<div class="table-data-feature">
														<button class="item" data-toggle="tooltip"
															data-placement="top" title="Send">
															<i class="zmdi zmdi-mail-send"></i>
														</button>
														<button type="button" class="btn btn-danger">Bloquear</button>
													</div>
												</td>
											</tr>



											</tr>
										</tbody>
									</table>
								</div>
								<!-- END DATA TABLE -->
							</div>
						</div>

						<div class="row">
							<div class="col-md-12">
								<div class="copyright"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>

	<!-- Jquery JS-->
	<script src="vendor/jquery-3.2.1.min.js"></script>
	<!-- Bootstrap JS-->
	<script src="vendor/bootstrap-4.1/popper.min.js"></script>
	<script src="vendor/bootstrap-4.1/bootstrap.min.js"></script>
	<!-- Vendor JS       -->
	<script src="vendor/slick/slick.min.js">
		
	</script>
	<script src="vendor/wow/wow.min.js"></script>
	<script src="vendor/animsition/animsition.min.js"></script>
	<script src="vendor/bootstrap-progressbar/bootstrap-progressbar.min.js">
		
	</script>
	<script src="vendor/counter-up/jquery.waypoints.min.js"></script>
	<script src="vendor/counter-up/jquery.counterup.min.js">
		
	</script>
	<script src="vendor/circle-progress/circle-progress.min.js"></script>
	<script src="vendor/perfect-scrollbar/perfect-scrollbar.js"></script>
	<script src="vendor/chartjs/Chart.bundle.min.js"></script>
	<script src="vendor/select2/select2.min.js">
		
	</script>

	<!-- Main JS-->
	<script src="js/main.js"></script>

</body>

</html>
<!-- end document-->
