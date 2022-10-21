<%-- 
    Document   : Registro
    Created on : 17 oct. 2022, 20:41:59
    Author     : andy2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/bootstrap.min.css" rel="stylesheet">
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
        <%@ page import="controller.registro" %>
        
        <div class="container">
            <div class="row">
                <div class="col-sm-1">
                
                    <div class="img">
                        <img src="assets/a5.jpg" alt="">
                    </div>
                </div>
                <div class="col-sm-3">
                    
                        <form action="registro" method="post"class="formulario">
                            <h1>CREATE UNA CUENTA</h1>
                            
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
                                <p> aceptas nuestras condiciones de uso  <a href="#">Politica de privacidad</a></p>
                                <br><!-- comment -->
                                <p><a href="Login.jsp">¿Ya tienes una cuenta?</a></p>
                            
                            <diV>
                                <input type="submit"  class = "btn" value="REGRESAR">
                            </div>
                        </form>
                    
                </div>
            </div>
        </div>

            <script type="text/javascript" src="js/login.js"></script>   
    </body>
</html>
