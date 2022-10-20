<%-- 
    Document   : Registro
    Created on : 17 oct. 2022, 20:41:59
    Author     : andy2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/styleRegistro.css"/>
        <script src="https://kit.fontawesome.com/a81368914c.js"></script>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+Mono&display=swap" rel="stylesheet">
    </head>
    <body>
        <%@ page import="controller.registro" %>
        <form action="registro" method="post"class="formulario">
            <h1>¡REGISTRATE!</h1>
            <div class="container">
                <div class="divContainer">
                        <i class="fas fa-user-alt"></i>
                        <input type="text" name="nombre" placeholder="Nombre completo">
                </div>
                <div class="divContainer">
                        <i class="fas fa-user-alt"></i>
                        <input type="text" name="apellidos" placeholder="Apellido completo">
                </div>
                <div class="divContainer">
                        <i class="fas fa-user-circle"></i>
                        <input type="text" name="cuenta" placeholder="Cuenta de usuario" >
                </div>
                <div class="divContainer">
                        <i class="fas fa-lock"></i>
                        <input type="password" name="clave" placeholder="Contraseña">
                        <i class="fas fa-eye"></i>
                </div>
                <div class="divContainer">
                        <i class="fas fa-envelope-square"></i>
                        <input type="text" name="mail" placeholder="Correo Electrónico">
                </div>
                <div class="divContainer">
                        <i class="fas fa-calendar-alt"><label>Fecha de Nacimiento</label></i>
                        <input type="date" name="fechaN">
                </div>
                <input type="submit" value="REGISTRAR">
                <br><!-- comment -->
                <p>Al registrarte, aceptas nuestras condiciones de uso y <a href="#">Politica de privacidad</a></p>
                <br><!-- comment -->
                <p><a href="Login.jsp">¿Ya tienes una cuenta?</a></p>
            </div>              
        </form>
        <form action="Login.jsp" method="post">
            <diV>
                <input type="submit"  class = "btn" value="REGRESAR">
            </div>
        </form>
    </body>
</html>
