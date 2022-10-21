

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/stylelogin.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+Mono&display=swap" rel="stylesheet">
        <script src="https://kit.fontawesome.com/a076d05399.js"></script>
        <script src="https://kit.fontawesome.com/a81368914c.js"></script>
        <script src="https://getbootstrap.com/docs/5.2/getting-started/introduction/"></script>
        <title>Inicia Sesión</title>

    </head>
    <body>
        <%@ page import="controller.Login" %>
        <img  class="wave" src="assets/fondologin.jpg" alt="">
        <div class="container">
            <div class="img">
                <img src="assets/a5.jpg" alt="">
            </div>
            <div class="login-container">
                <form action="Login" method="post">
                    <img class="usuario" src="assets/login2.jpg" alt="">
                    <h2>Ingresa</h2>
                    <div class="input-div one">
                        <div class="i">
                            <i class="fas fa-user-alt"></i>
                        </div>
                        <div>
                            <h5>Cuenta de usuario:</h5>
                            <input type="text" class="input" name="cuenta">
                        </div>
                    </div>
                    <div class="input-div two">
                        <div class="i">
                            <i class="fas fa-lock"></i>
                        </div>
                        <div>
                            <h5>Contraseña:</h5>
                            <input type="password" class="input" name="clave">
                        </div>
                    </div>
                    <a href="#">¿Olvidaste tu contraseña?</a><br>
                    <a href="Registro.jsp">¿Aun no tienes una cuenta? Registrate acá</a>
                    <input type="submit" class="btn" value="Ingresar">
                </form>
            </div>
        </div>
        <script type="text/javascript" src="js/login.js"></script>      
    </body>
</html>
