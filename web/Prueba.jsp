<%-- 
    Document   : Prueba
    Created on : 16 oct. 2022, 20:38:28
    Author     : andy2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ page import="model.Usuario" %>
        <%
        String nombre= request.getParameter("nombre");
        String apellidos= request.getParameter("apellidos");
        String cuenta = request.getParameter("cuenta");
        String mail = request.getParameter("mail");
        String clave= request.getParameter("clave");
        String fechaN= request.getParameter("fechaN");
        %>
        <h1> Hola <%= nombre %> bienvenido al sistema!</h1>
        <br>
        <form action="action">
            
        </form>
            <div>
                <button><a href="Registro.jsp">REGISTRO</a></button>
            </div>
    </body>
</html>
