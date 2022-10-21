/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.0-M17
 * Generated at: 2022-10-21 01:06:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import controller.registro;

public final class Registro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("controller.registro");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/stylelogin.css\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+Mono&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/a81368914c.js\"></script>\n");
      out.write("        <script src=\"https://getbootstrap.com/docs/5.2/getting-started/introduction/\"></script>\n");
      out.write("        <title>Inicia Sesión</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-1\">\n");
      out.write("                \n");
      out.write("                    <div class=\"img\">\n");
      out.write("                        <img src=\"assets/a5.jpg\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    \n");
      out.write("                        <form action=\"registro\" method=\"post\"class=\"formulario\">\n");
      out.write("                            <h1>CREATE UNA CUENTA</h1>\n");
      out.write("                            \n");
      out.write("                                <div class=\"divContainer\">\n");
      out.write("                                    <i class=\"fas fa-user-alt\"></i>\n");
      out.write("                                    <input type=\"text\" name=\"nombre\" placeholder=\"Nombre completo\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"divContainer\">\n");
      out.write("                                    <i class=\"fas fa-user-alt\"></i>\n");
      out.write("                                    <input type=\"text\" name=\"apellidos\" placeholder=\"Apellido completo\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"divContainer\">\n");
      out.write("                                    <i class=\"fas fa-user-circle\"></i>\n");
      out.write("                                    <input type=\"text\" name=\"cuenta\" placeholder=\"Cuenta de usuario\" >\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"divContainer\">\n");
      out.write("                                    <i class=\"fas fa-lock\"></i>\n");
      out.write("                                    <input type=\"password\" name=\"clave\" placeholder=\"Contraseña\">\n");
      out.write("                                    <i class=\"fas fa-eye\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"divContainer\">\n");
      out.write("                                    <i class=\"fas fa-envelope-square\"></i>\n");
      out.write("                                    <input type=\"text\" name=\"mail\" placeholder=\"Correo Electrónico\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"divContainer\">\n");
      out.write("                                    <i class=\"fas fa-calendar-alt\"><label>Fecha de Nacimiento</label></i>\n");
      out.write("                                    <input type=\"date\" name=\"fechaN\">\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"submit\" value=\"REGISTRAR\">\n");
      out.write("                                <br><!-- comment -->\n");
      out.write("                                <p> aceptas nuestras condiciones de uso  <a href=\"#\">Politica de privacidad</a></p>\n");
      out.write("                                <br><!-- comment -->\n");
      out.write("                                <p><a href=\"Login.jsp\">¿Ya tienes una cuenta?</a></p>\n");
      out.write("                            \n");
      out.write("                            <diV>\n");
      out.write("                                <input type=\"submit\"  class = \"btn\" value=\"REGRESAR\">\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("            <script type=\"text/javascript\" src=\"js/login.js\"></script>   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
