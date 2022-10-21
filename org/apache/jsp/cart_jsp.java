/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.0-M17
 * Generated at: 2022-10-20 22:58:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import classes.Producto;
import controller.ControladorProducto;
import classes.Articulo;
import java.util.ArrayList;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("classes.Articulo");
    _jspx_imports_classes.add("controller.ControladorProducto");
    _jspx_imports_classes.add("classes.Producto");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      response.setContentType("text/html");
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
      out.write("\n");

     HttpSession sesion = request.getSession(true);
     ArrayList<Articulo> articulos = sesion.getAttribute("carrito") == null ? null : (ArrayList) sesion.getAttribute("carrito");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <title>Cart | E-Shopper</title>\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/price-range.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/animate.css\" rel=\"stylesheet\">\n");
      out.write("	<link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("	<link href=\"css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"js/html5shiv.js\"></script>\n");
      out.write("    <script src=\"js/respond.min.js\"></script>\n");
      out.write("    <![endif]-->       \n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/ico/favicon.ico\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("</head><!--/head-->\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("	<header id=\"header\"><!--header-->\n");
      out.write("		<div class=\"header_top\"><!--header_top-->\n");
      out.write("			<div class=\"container\">\n");
      out.write("				<div class=\"row\">\n");
      out.write("					<div class=\"col-sm-6\">\n");
      out.write("						<div class=\"contactinfo\">\n");
      out.write("							<ul class=\"nav nav-pills\">\n");
      out.write("								<li><a href=\"\"><i class=\"fa fa-phone\"></i> +2 95 01 88 821</a></li>\n");
      out.write("								<li><a href=\"\"><i class=\"fa fa-envelope\"></i> info@domain.com</a></li>\n");
      out.write("							</ul>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"col-sm-6\">\n");
      out.write("						<div class=\"social-icons pull-right\">\n");
      out.write("							<ul class=\"nav navbar-nav\">\n");
      out.write("								<li><a href=\"\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("								<li><a href=\"\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("								<li><a href=\"\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("								<li><a href=\"\"><i class=\"fa fa-dribbble\"></i></a></li>\n");
      out.write("								<li><a href=\"\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("							</ul>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div><!--/header_top-->\n");
      out.write("		\n");
      out.write("		<div class=\"header-middle\"><!--header-middle-->\n");
      out.write("			<div class=\"container\">\n");
      out.write("				<div class=\"row\">\n");
      out.write("					<div class=\"col-sm-4\">\n");
      out.write("						<div class=\"logo pull-left\">\n");
      out.write("							<a href=\"index.html\"><img src=\"images/home/logo.png\" alt=\"\" /></a>\n");
      out.write("						</div>\n");
      out.write("						<div class=\"btn-group pull-right\">\n");
      out.write("							<div class=\"btn-group\">\n");
      out.write("								<button type=\"button\" class=\"btn btn-default dropdown-toggle usa\" data-toggle=\"dropdown\">\n");
      out.write("									USA\n");
      out.write("									<span class=\"caret\"></span>\n");
      out.write("								</button>\n");
      out.write("								<ul class=\"dropdown-menu\">\n");
      out.write("									<li><a href=\"\">Canada</a></li>\n");
      out.write("									<li><a href=\"\">UK</a></li>\n");
      out.write("								</ul>\n");
      out.write("							</div>\n");
      out.write("							\n");
      out.write("							<div class=\"btn-group\">\n");
      out.write("								<button type=\"button\" class=\"btn btn-default dropdown-toggle usa\" data-toggle=\"dropdown\">\n");
      out.write("									DOLLAR\n");
      out.write("									<span class=\"caret\"></span>\n");
      out.write("								</button>\n");
      out.write("								<ul class=\"dropdown-menu\">\n");
      out.write("									<li><a href=\"\">Canadian Dollar</a></li>\n");
      out.write("									<li><a href=\"\">Pound</a></li>\n");
      out.write("								</ul>\n");
      out.write("							</div>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"col-sm-8\">\n");
      out.write("						<div class=\"shop-menu pull-right\">\n");
      out.write("							<ul class=\"nav navbar-nav\">\n");
      out.write("								<li><a href=\"\"><i class=\"fa fa-user\"></i> Account</a></li>\n");
      out.write("								<li><a href=\"\"><i class=\"fa fa-star\"></i> Wishlist</a></li>\n");
      out.write("								<li><a href=\"checkout.html\"><i class=\"fa fa-crosshairs\"></i> Checkout</a></li>\n");
      out.write("								<li><a href=\"cart.html\" class=\"active\"><i class=\"fa fa-shopping-cart\"></i> Cart</a></li>\n");
      out.write("								<li><a href=\"login.html\"><i class=\"fa fa-lock\"></i> Login</a></li>\n");
      out.write("							</ul>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div><!--/header-middle-->\n");
      out.write("	\n");
      out.write("		<div class=\"header-bottom\"><!--header-bottom-->\n");
      out.write("			<div class=\"container\">\n");
      out.write("				<div class=\"row\">\n");
      out.write("					<div class=\"col-sm-9\">\n");
      out.write("						<div class=\"navbar-header\">\n");
      out.write("							<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("								<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("								<span class=\"icon-bar\"></span>\n");
      out.write("								<span class=\"icon-bar\"></span>\n");
      out.write("								<span class=\"icon-bar\"></span>\n");
      out.write("							</button>\n");
      out.write("						</div>\n");
      out.write("						<div class=\"mainmenu pull-left\">\n");
      out.write("							<ul class=\"nav navbar-nav collapse navbar-collapse\">\n");
      out.write("								<li><a href=\"index.html\">Home</a></li>\n");
      out.write("								<li class=\"dropdown\"><a href=\"#\">Shop<i class=\"fa fa-angle-down\"></i></a>\n");
      out.write("                                    <ul role=\"menu\" class=\"sub-menu\">\n");
      out.write("                                        <li><a href=\"shop.html\">Products</a></li>\n");
      out.write("										<li><a href=\"product-details.html\">Product Details</a></li> \n");
      out.write("										<li><a href=\"checkout.html\">Checkout</a></li> \n");
      out.write("										<li><a href=\"cart.html\" class=\"active\">Cart</a></li> \n");
      out.write("										<li><a href=\"login.html\">Login</a></li> \n");
      out.write("                                    </ul>\n");
      out.write("                                </li> \n");
      out.write("								<li class=\"dropdown\"><a href=\"#\">Blog<i class=\"fa fa-angle-down\"></i></a>\n");
      out.write("                                    <ul role=\"menu\" class=\"sub-menu\">\n");
      out.write("                                        <li><a href=\"blog.html\">Blog List</a></li>\n");
      out.write("										<li><a href=\"blog-single.html\">Blog Single</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li> \n");
      out.write("								<li><a href=\"404.html\">404</a></li>\n");
      out.write("								<li><a href=\"contact-us.html\">Contact</a></li>\n");
      out.write("							</ul>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"col-sm-3\">\n");
      out.write("						<div class=\"search_box pull-right\">\n");
      out.write("							<input type=\"text\" placeholder=\"Search\"/>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div><!--/header-bottom-->\n");
      out.write("	</header><!--/header-->\n");
      out.write("\n");
      out.write("	<section id=\"cart_items\">\n");
      out.write("		<div class=\"container\">\n");
      out.write("			<div class=\"breadcrumbs\">\n");
      out.write("				<ol class=\"breadcrumb\">\n");
      out.write("				  <li><a href=\"#\">Home</a></li>\n");
      out.write("				  <li class=\"active\">Shopping Cart</li>\n");
      out.write("				</ol>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"table-responsive cart_info\" id=\"cart-container\">\n");
      out.write("                            <table class=\"table table-condensed\" id=\"shop-table\">\n");
      out.write("					<thead>\n");
      out.write("						<tr class=\"cart_menu\">\n");
      out.write("							<td class=\"image\">Item</td>\n");
      out.write("							<td class=\"description\"></td>\n");
      out.write("							<td class=\"price\">Price</td>\n");
      out.write("							<td class=\"quantity\">Quantity</td>\n");
      out.write("							<td class=\"total\">Total</td>\n");
      out.write("							<td></td>\n");
      out.write("						</tr>\n");
      out.write("					</thead>\n");
      out.write("					<tbody>\n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                                ");

                                                    ControladorProducto cp = new ControladorProducto();
                                                    double total = 0;
                                                    if(articulos != null){
                                                    for(Articulo a: articulos){
                                                        Producto producto = cp.getProducto(a.getIdProducto());
                                                        total += a.getCantidad() * producto.getPrecio();
                                                        
                                                                                                            
                                                
      out.write("\n");
      out.write("                                            \n");
      out.write("						<tr>\n");
      out.write("							<td class=\"cart_product\">\n");
      out.write("                                                            <a href=\"\"><img src=\"");
      out.print( producto.getImg());
      out.write("\" alt=\"\" width=\"120\"></a>\n");
      out.write("							</td>\n");
      out.write("							<td class=\"cart_description\">\n");
      out.write("								<h4><a href=\"\">");
      out.print( producto.getNombre());
      out.write("</a></h4>\n");
      out.write("								<p>Web ID: ");
      out.print( producto.getId());
      out.write("</p>\n");
      out.write("							</td>\n");
      out.write("							<td class=\"cart_price\">\n");
      out.write("								<p>$");
      out.print( producto.getPrecio());
      out.write("</p>\n");
      out.write("							</td>\n");
      out.write("							<td class=\"cart_quantity\">\n");
      out.write("								<div class=\"cart_quantity_button\">\n");
      out.write("									<a class=\"cart_quantity_up\" href=\"\"> + </a>\n");
      out.write("                                                                        <input class=\"cart_quantity_input\" type=\"text\" name=\"quantity\" value=\"");
      out.print( a.getCantidad());
      out.write("\" autocomplete=\"off\" size=\"2\">\n");
      out.write("									<a class=\"cart_quantity_down\" href=\"\"> - </a>\n");
      out.write("								</div>\n");
      out.write("							</td>\n");
      out.write("							<td class=\"cart_total\">\n");
      out.write("								<p class=\"cart_total_price\">$");
      out.print( Math.round(producto.getPrecio()*a.getCantidad()*100.0) / 100.0);
      out.write("</p>\n");
      out.write("							</td>\n");
      out.write("							<td class=\"cart_delete\">\n");
      out.write("                                                            <span id=\"idarticulo\" style=\"display:none;\">");
      out.print( producto.getId());
      out.write("</span>\n");
      out.write("                                                            <a class=\"cart_quantity_delete\" href=\"\" id=\"deleteitem\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("							</td>\n");
      out.write("						</tr>\n");
      out.write("                                                \n");
      out.write("                                                ");
}}
      out.write("\n");
      out.write("                                                \n");
      out.write("                                                \n");
      out.write("                                                \n");
      out.write("                                                \n");
      out.write("                                                \n");
      out.write("                                                \n");
      out.write("                                                \n");
      out.write("\n");
      out.write("						\n");
      out.write("					</tbody>\n");
      out.write("				</table>\n");
      out.write("                                ");
 if (articulos == null){
      out.write("\n");
      out.write("                                <h4>No hay Articulos en el carro</h4>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("			</div> \n");
      out.write("                                                <a href=\"javascript:window.history.go(-2);\">Seguir Comprando</a>\n");
      out.write("		</div>\n");
      out.write("	</section> <!--/#cart_items-->\n");
      out.write("\n");
      out.write("	<section id=\"do_action\">\n");
      out.write("		<div class=\"container\">\n");
      out.write("			<div class=\"heading\">\n");
      out.write("				<h3>What would you like to do next?</h3>\n");
      out.write("				<p>Choose if you have a discount code or reward points you want to use or would like to estimate your delivery cost.</p>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"row\">\n");
      out.write("				<div class=\"col-sm-6\">\n");
      out.write("					<div class=\"chose_area\">\n");
      out.write("						<ul class=\"user_option\">\n");
      out.write("							<li>\n");
      out.write("								<input type=\"checkbox\">\n");
      out.write("								<label>Use Coupon Code</label>\n");
      out.write("							</li>\n");
      out.write("							<li>\n");
      out.write("								<input type=\"checkbox\">\n");
      out.write("								<label>Use Gift Voucher</label>\n");
      out.write("							</li>\n");
      out.write("							<li>\n");
      out.write("								<input type=\"checkbox\">\n");
      out.write("								<label>Estimate Shipping & Taxes</label>\n");
      out.write("							</li>\n");
      out.write("						</ul>\n");
      out.write("						<ul class=\"user_info\">\n");
      out.write("							<li class=\"single_field\">\n");
      out.write("								<label>Country:</label>\n");
      out.write("								<select>\n");
      out.write("									<option>United States</option>\n");
      out.write("									<option>Bangladesh</option>\n");
      out.write("									<option>UK</option>\n");
      out.write("									<option>India</option>\n");
      out.write("									<option>Pakistan</option>\n");
      out.write("									<option>Ucrane</option>\n");
      out.write("									<option>Canada</option>\n");
      out.write("									<option>Dubai</option>\n");
      out.write("								</select>\n");
      out.write("								\n");
      out.write("							</li>\n");
      out.write("							<li class=\"single_field\">\n");
      out.write("								<label>Region / State:</label>\n");
      out.write("								<select>\n");
      out.write("									<option>Select</option>\n");
      out.write("									<option>Dhaka</option>\n");
      out.write("									<option>London</option>\n");
      out.write("									<option>Dillih</option>\n");
      out.write("									<option>Lahore</option>\n");
      out.write("									<option>Alaska</option>\n");
      out.write("									<option>Canada</option>\n");
      out.write("									<option>Dubai</option>\n");
      out.write("								</select>\n");
      out.write("							\n");
      out.write("							</li>\n");
      out.write("							<li class=\"single_field zip-field\">\n");
      out.write("								<label>Zip Code:</label>\n");
      out.write("								<input type=\"text\">\n");
      out.write("							</li>\n");
      out.write("						</ul>\n");
      out.write("						<a class=\"btn btn-default update\" href=\"\">Get Quotes</a>\n");
      out.write("						<a class=\"btn btn-default check_out\" href=\"\">Continue</a>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"col-sm-6\">\n");
      out.write("					<div class=\"total_area\">\n");
      out.write("						<ul>\n");
      out.write("                                                    <li>Cart Sub Total <span id=\"txt-subtotal\">$");
      out.print( Math.round(total*100.0)/100.0);
      out.write("</span></li>\n");
      out.write("							<li>Eco Tax <span>$0.0</span></li>\n");
      out.write("							<li>Shipping Cost <span>Free</span></li>\n");
      out.write("                                                        <li>Total <span id=\"txt-total\">");
      out.print( Math.round(total*100.0)/100.0);
      out.write("</span></li>\n");
      out.write("						</ul>\n");
      out.write("							<a class=\"btn btn-default update\" href=\"\">Update</a>\n");
      out.write("							<a class=\"btn btn-default check_out\" href=\"\">Check Out</a>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</section><!--/#do_action-->\n");
      out.write("\n");
      out.write("	<footer id=\"footer\"><!--Footer-->\n");
      out.write("		<div class=\"footer-top\">\n");
      out.write("			<div class=\"container\">\n");
      out.write("				<div class=\"row\">\n");
      out.write("					<div class=\"col-sm-2\">\n");
      out.write("						<div class=\"companyinfo\">\n");
      out.write("							<h2><span>e</span>-shopper</h2>\n");
      out.write("							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,sed do eiusmod tempor</p>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"col-sm-7\">\n");
      out.write("						<div class=\"col-sm-3\">\n");
      out.write("							<div class=\"video-gallery text-center\">\n");
      out.write("								<a href=\"#\">\n");
      out.write("									<div class=\"iframe-img\">\n");
      out.write("										<img src=\"images/home/iframe1.png\" alt=\"\" />\n");
      out.write("									</div>\n");
      out.write("									<div class=\"overlay-icon\">\n");
      out.write("										<i class=\"fa fa-play-circle-o\"></i>\n");
      out.write("									</div>\n");
      out.write("								</a>\n");
      out.write("								<p>Circle of Hands</p>\n");
      out.write("								<h2>24 DEC 2014</h2>\n");
      out.write("							</div>\n");
      out.write("						</div>\n");
      out.write("						\n");
      out.write("						<div class=\"col-sm-3\">\n");
      out.write("							<div class=\"video-gallery text-center\">\n");
      out.write("								<a href=\"#\">\n");
      out.write("									<div class=\"iframe-img\">\n");
      out.write("										<img src=\"images/home/iframe2.png\" alt=\"\" />\n");
      out.write("									</div>\n");
      out.write("									<div class=\"overlay-icon\">\n");
      out.write("										<i class=\"fa fa-play-circle-o\"></i>\n");
      out.write("									</div>\n");
      out.write("								</a>\n");
      out.write("								<p>Circle of Hands</p>\n");
      out.write("								<h2>24 DEC 2014</h2>\n");
      out.write("							</div>\n");
      out.write("						</div>\n");
      out.write("						\n");
      out.write("						<div class=\"col-sm-3\">\n");
      out.write("							<div class=\"video-gallery text-center\">\n");
      out.write("								<a href=\"#\">\n");
      out.write("									<div class=\"iframe-img\">\n");
      out.write("										<img src=\"images/home/iframe3.png\" alt=\"\" />\n");
      out.write("									</div>\n");
      out.write("									<div class=\"overlay-icon\">\n");
      out.write("										<i class=\"fa fa-play-circle-o\"></i>\n");
      out.write("									</div>\n");
      out.write("								</a>\n");
      out.write("								<p>Circle of Hands</p>\n");
      out.write("								<h2>24 DEC 2014</h2>\n");
      out.write("							</div>\n");
      out.write("						</div>\n");
      out.write("						\n");
      out.write("						<div class=\"col-sm-3\">\n");
      out.write("							<div class=\"video-gallery text-center\">\n");
      out.write("								<a href=\"#\">\n");
      out.write("									<div class=\"iframe-img\">\n");
      out.write("										<img src=\"images/home/iframe4.png\" alt=\"\" />\n");
      out.write("									</div>\n");
      out.write("									<div class=\"overlay-icon\">\n");
      out.write("										<i class=\"fa fa-play-circle-o\"></i>\n");
      out.write("									</div>\n");
      out.write("								</a>\n");
      out.write("								<p>Circle of Hands</p>\n");
      out.write("								<h2>24 DEC 2014</h2>\n");
      out.write("							</div>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"col-sm-3\">\n");
      out.write("						<div class=\"address\">\n");
      out.write("							<img src=\"images/home/map.png\" alt=\"\" />\n");
      out.write("							<p>505 S Atlantic Ave Virginia Beach, VA(Virginia)</p>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("		\n");
      out.write("		<div class=\"footer-widget\">\n");
      out.write("			<div class=\"container\">\n");
      out.write("				<div class=\"row\">\n");
      out.write("					<div class=\"col-sm-2\">\n");
      out.write("						<div class=\"single-widget\">\n");
      out.write("							<h2>Service</h2>\n");
      out.write("							<ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("								<li><a href=\"\">Online Help</a></li>\n");
      out.write("								<li><a href=\"\">Contact Us</a></li>\n");
      out.write("								<li><a href=\"\">Order Status</a></li>\n");
      out.write("								<li><a href=\"\">Change Location</a></li>\n");
      out.write("								<li><a href=\"\">FAQâs</a></li>\n");
      out.write("							</ul>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"col-sm-2\">\n");
      out.write("						<div class=\"single-widget\">\n");
      out.write("							<h2>Quock Shop</h2>\n");
      out.write("							<ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("								<li><a href=\"\">T-Shirt</a></li>\n");
      out.write("								<li><a href=\"\">Mens</a></li>\n");
      out.write("								<li><a href=\"\">Womens</a></li>\n");
      out.write("								<li><a href=\"\">Gift Cards</a></li>\n");
      out.write("								<li><a href=\"\">Shoes</a></li>\n");
      out.write("							</ul>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"col-sm-2\">\n");
      out.write("						<div class=\"single-widget\">\n");
      out.write("							<h2>Policies</h2>\n");
      out.write("							<ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("								<li><a href=\"\">Terms of Use</a></li>\n");
      out.write("								<li><a href=\"\">Privecy Policy</a></li>\n");
      out.write("								<li><a href=\"\">Refund Policy</a></li>\n");
      out.write("								<li><a href=\"\">Billing System</a></li>\n");
      out.write("								<li><a href=\"\">Ticket System</a></li>\n");
      out.write("							</ul>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"col-sm-2\">\n");
      out.write("						<div class=\"single-widget\">\n");
      out.write("							<h2>About Shopper</h2>\n");
      out.write("							<ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("								<li><a href=\"\">Company Information</a></li>\n");
      out.write("								<li><a href=\"\">Careers</a></li>\n");
      out.write("								<li><a href=\"\">Store Location</a></li>\n");
      out.write("								<li><a href=\"\">Affillate Program</a></li>\n");
      out.write("								<li><a href=\"\">Copyright</a></li>\n");
      out.write("							</ul>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"col-sm-3 col-sm-offset-1\">\n");
      out.write("						<div class=\"single-widget\">\n");
      out.write("							<h2>About Shopper</h2>\n");
      out.write("							<form action=\"#\" class=\"searchform\">\n");
      out.write("								<input type=\"text\" placeholder=\"Your email address\" />\n");
      out.write("								<button type=\"submit\" class=\"btn btn-default\"><i class=\"fa fa-arrow-circle-o-right\"></i></button>\n");
      out.write("								<p>Get the most recent updates from <br />our site and be updated your self...</p>\n");
      out.write("							</form>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("					\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("		\n");
      out.write("		<div class=\"footer-bottom\">\n");
      out.write("			<div class=\"container\">\n");
      out.write("				<div class=\"row\">\n");
      out.write("					<p class=\"pull-left\">Copyright Â© 2013 E-SHOPPER Inc. All rights reserved.</p>\n");
      out.write("					<p class=\"pull-right\">Designed by <span><a target=\"_blank\" href=\"http://www.themeum.com\">Themeum</a></span></p>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("		\n");
      out.write("	</footer><!--/Footer-->\n");
      out.write("	\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("	<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("	<script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("    <script src=\"js/carrito.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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