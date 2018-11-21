<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="shortcut icon" type="image/png" href="img/123.png"/>
        <title>Menu do Sistema</title>
    </head>
    <body>
        <h1>Menu do Sistema</h1>
        <p>Olá ${sessionScope.usuarioLogado.nome}</p>
        <ul>
            <li>
                <a href="${pageContext.request.contextPath}/logout.jsp">Sair</a>               
            </li>
            <li> 
            <a href="${pageContext.request.contextPath}/DetectarEmocao.jsp">Detectar Emoção</a>
            </li>
            <c:set var = "tipo" scope = "session" value = "${sessionScope.usuarioLogado.tipoUsuario}"/>
            <c:if test = "${tipo = 'M'}">
             <li>
            	<a href="${pageContext.request.contextPath}/EnviarMusica.jsp">Enviar Música</a>
            	</li>
            </c:if>
            <li>
                <a href="${pageContext.request.contextPath}/AdicionarAmigo.jsp">Adicionar Amigo</a>               
            </li>
            
        </ul>
    </body>
</html>
