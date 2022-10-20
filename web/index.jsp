
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="controller.ControladorProducto"%>
<%
    ControladorProducto cp = new ControladorProducto();
%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" href="assets/a2.jpg">
        <title>CliniVET</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!--iconos fontawesome-->
        <script src="https://kit.fontawesome.com/3e9cb3f872.js" crossorigin="anonymous"></script>

        <!--css bootstrap personalizado-->
        <link rel="stylesheet" href="css/bootstrap.css">
        <!--My CSS-->
        <link rel="stylesheet" href="css/styles.css">
        <!--Footer-->
        <link rel="stylesheet" href="css/footer.css">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/magnific-popup.min.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.7.2/animate.min.css">
        <link rel="stylesheet" href="css/responsive.css"> 
        <link rel="stylesheet" href="css/jquery.flipster.min.css">

        
        
    
    
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/price-range.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
	<link href="css/main.css" rel="stylesheet">
	<link href="css/responsive.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
    </head>
    <body>

        <!--encabezado de la pagina-->
        <header>
            <nav class="navbar navbar-expand-lg navbar-dark " id="nav11">
                <div class="container-fluid">
                    <div class="container-fluid">
                        <a class="navbar-brand" href="#"><span>CliniVET</span></a>
                        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav ml-auto">
                                <li class="nav-item">
                                    <a class="nav-link" href="perfil.html">Inicio</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="login.jsp">Blog</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="shop.jsp"><i class="fa fa-user"></i>Servicios</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="Login.jsp"><i class="fa fa-shopping-cart"></i> Carrito</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="Login.jsp"><i class="fa fa-lock"></i> Login</a>
                                </li>
                            </ul>
                    </div>
                    

                </div>
            </nav>
        </header>
        <!--Slider-->
        <!--Slider-->
        <div class="slideshow-container" id="home">
            <br><br><br><br><br><br>



            <div class="mySlides" style="margin-left: 0px;">
                <h2>VACUNAS  <span>PARA TU MASCOTA</span></h2>
                <img src="assets/a3.jpg" alt="" class="p_img">
                <div class="p_detail">
                    <h3>VACUNAS <i class="fa fa-star rate" aria-hidden="true"></i> <i class="fa fa-star rate" aria-hidden="true"></i> <i class="fa fa-star rate" aria-hidden="true"></i> <i class="fa fa-star rate" aria-hidden="true"></i> <i class="fa fa-star" aria-hidden="true"></i></h3>
                    <h4>TIPO</h4>
                    <p>ESPECIES DOMESTICAS</p>
                    <ul>
                        <li> <i class="fa fa-angle-right" aria-hidden="true"></i>
                            Lorem ipsum dolor sit amet
                        </li>
                        <li> <i class="fa fa-angle-right" aria-hidden="true"></i>
                            Lorem ipsum dolor sit amet
                        </li>
                    </ul>
                    <select>
                        <option value="volvo">Tipo de VACUNA</option>
                        <option value="saab">PARASITOS</option>
                        <option value="opel">RAVIA</option>

                    </select>
                    <a href="#">Saca tu cita</a>  <span>$30</span>
                </div>
            </div>


            <div class="mySlides">
                <br><h2>ASEO Y ESTETICA <span>DE MASCOTAS</span></h2>
                <br>
                <img src="assets/ima2_adobe_express.svg" alt="" class="p_img">
                <div class="p_detail">
                    <h3>Maria <i class="fa fa-star rate" aria-hidden="true"></i> <i class="fa fa-star rate" aria-hidden="true"></i> <i class="fa fa-star rate" aria-hidden="true"></i> <i class="fa fa-star rate" aria-hidden="true"></i> <i class="fa fa-star" aria-hidden="true"></i></h3>
                    <h4>Dictorado </h4>
                    <p>Lorem ipsum dolor sit amet. Reprehenderit, qui blanditiis quidem rerum</p>
                    <ul>
                        <li> <i class="fa fa-angle-right" aria-hidden="true"></i>
                            Lorem ipsum dolor sit amet
                        </li>
                        <li> <i class="fa fa-angle-right" aria-hidden="true"></i>
                            Lorem ipsum dolor sit amet
                        </li>
                    </ul>
                    <select>
                        <option value="volvo">TIPO DE MASCOTA</option>
                        <option value="saab">M</option>
                        <option value="opel">L</option>
                        <option value="audi">XL</option>
                        <option value="audi">XXL</option>
                    </select>
                    <a href="#">ADQUIERELO</a>  <span>$50</span>
                </div>
            </div>


            <div class="mySlides">
                <h2>ALIMENTOS <span>SALUDABLES</span></h2>
                <img src="assets/imagpsico3_adobe_express.svg" alt="" class="p_img">
                <div class="p_detail">
                    <h3>Daniel <i class="fa fa-star rate" aria-hidden="true"></i> <i class="fa fa-star rate" aria-hidden="true"></i> <i class="fa fa-star rate" aria-hidden="true"></i> <i class="fa fa-star rate" aria-hidden="true"></i> <i class="fa fa-star" aria-hidden="true"></i></h3>
                    <h4>Master</h4>
                    <p>Lorem ipsum dolor sit amet. Reprehenderit, qui blanditiis quidem rerum</p>
                    <ul>
                        <li> <i class="fa fa-angle-right" aria-hidden="true"></i>
                            Lorem ipsum dolor sit amet
                        </li>
                        <li> <i class="fa fa-angle-right" aria-hidden="true"></i>
                            Lorem ipsum dolor sit amet
                        </li>
                    </ul>
                    <select>
                        <option value="volvo">RAZA</option>
                        <option value="saab">M</option>
                        <option value="opel">L</option>
                        <option value="audi">XL</option>
                        <option value="audi">XXL</option>
                    </select>
                    <a href="#">ADQUIERELO</a>  <span>$190</span>
                </div>
            </div>

            <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
            <a class="next" onclick="plusSlides(1)">&#10095;</a>
        </div>

        <!--contenido-->
        <main id="main">


        </main>

        <!--Equipo-->
        <section id="equipo" class="mt-4">
            <div class="container">
                <div class="row">
                    <div class="col text-center text-uppercase">
                        <small>Escoge el tipo de</small>
                        <h2>CITA</h2>
                    </div>
                </div>

                <div class="row">
                    <div class="col-12 col-md-6 col-lg-4 mb-4">
                        <div class="card" style="width: 15rem;">

                            <div class="card-body">
                                <h5 class="card-title">TIPO DE CITA</h5>
                                <p class="card-text"></p>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-md-6 col-lg-4 mb-4">
                        <div class="card" style="width: 18rem;">
                            <img src="assets/presencial.jpg" class="card-img-top"  height="200rem" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">PRESENCIAL</h5>
                                <p class="card-text">En consultorio del psicologo</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-md-6 col-lg-4 mb-4">
                        <div class="card" style="width: 18rem; ">
                            <img src="assets/virtual.jpg" class="card-img-top" height="200rem" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">VIRTUAL</h5>
                                <p class="card-text">Platafarma zoom</p>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </section>
        <!--/Equipo-->

        <!--Marcas-->

        <section id="marcas">
            </section>
              <section>
        <div class="container">
            <div class="row">
                <div class="col-sm-3">
                    <div class="left-sidebar">
                        <h2>SERVICIOS</h2>
                        <div class="panel-group category-products" id="accordian"><!--category-productsr-->
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordian" href="#sportswear">
                                            <span class="badge pull-right"><i class="fa fa-plus"></i></span>
                                            VACUNAS
                                        </a>
                                    </h4>
                                </div>
                                <div id="sportswear" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <ul>
                                            <li><a href="">RABIA </a></li>
                                            <li><a href="">NN </a></li>
                                            
                                    </div>
                                </div>
                            </div>
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordian" href="#mens">
                                            <span class="badge pull-right"><i class="fa fa-plus"></i></span>
                                           HIGIENE
                                        </a>
                                    </h4>
                                </div>
                                <div id="mens" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <ul>
                                            <li><a href="">BAÑO</a></li>
                                            <li><a href="">ANTIPULGAS</a></li>
                                           
                                        </ul>
                                    </div>
                                </div>
                            </div>

                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordian" href="#womens">
                                            <span class="badge pull-right"><i class="fa fa-plus"></i></span>
                                           OPERACIONES
                                        </a>
                                    </h4>
                                </div>
                                <div id="womens" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        <ul>
                                            <li><a href="">DDD</a></li>
                                            <li><a href="">D</a></li>
                                            
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4 class="panel-title"><a href="#">PERROS</a></h4>
                                </div>
                            </div>
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4 class="panel-title"><a href="#">GATOS</a></h4>
                                </div>
                            </div>
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4 class="panel-title"><a href="#">AVES</a></h4>
                                </div>
                            </div>
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h4 class="panel-title"><a href="#">REPTILES</a></h4>
                                </div>
                            </div>
                           
                           
                        </div><!--/category-productsr-->

                        <div class="brands_products"><!--brands_products-->
                            <h2>BLOG</h2>
                            <div class="brands-name">
                                <ul class="nav nav-pills nav-stacked">
                                    <li><a href=""> <span class="pull-right">(50)</span>PERROS</a></li>
                                    <li><a href=""> <span class="pull-right">(56)</span>SALUD DE MASCOTAS</a></li>
                                    <li><a href=""> <span class="pull-right">(27)</span>CUIDADO DE MASCOTAS</a></li>
                                    
                                </ul>
                            </div>
                        </div><!--/brands_products-->

                        <div class="price-range"><!--price-range-->
                            <h2>PrECIO</h2>
                            <div class="well">
                                <input type="text" class="span2" value="" data-slider-min="0" data-slider-max="600" data-slider-step="5" data-slider-value="[250,450]" id="sl2" ><br />
                                <b>$ 0</b> <b class="pull-right">$ 200</b>
                            </div>
                        </div><!--/price-range-->

                        <div class="shipping text-center"><!--shipping-->
                            <img src="images/home/shipping.jpg" alt="" />
                        </div><!--/shipping-->

                    </div>
                </div>

                <div class="col-sm-9 padding-right">
                    <div class="features_items"><!--features_items-->
                        <h2 class="title text-center">Features Items</h2>


                        <!--Cargar productos-->
                        <%= cp.getProductos()%>						








                        <ul class="pagination">
                            <li class="active"><a href="">1</a></li>
                            <li><a href="">2</a></li>
                            <li><a href="">3</a></li>
                            <li><a href="">&raquo;</a></li>
                        </ul>
                    </div><!--features_items-->
                </div>
            </div>
        </div>
    </section>

        

        <!--/Marcas-->

        <!--Formulario de contacto-->

        <section id="contacto">
            <div class="container">
                <div class="row">
                    <div class="col text-center text-uppercase mt-4 mb-2">
                        <h2>Contactanos</h2>
                    </div>
                </div>
                <div class="row mt-4 offset-1">
                    <div class="col-10 mb-4">
                        <form>
                            <div class="form-group">
                                <label for="exampleFormControlInput1">Direccion de Email:</label>
                                <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com">
                            </div>
                            <div class="form-group">
                                <label for="exampleFormControlTextarea1">Mensaje: </label>
                                <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
                            </div>
                            <button type="button" class="btn btn-primary btn-lg">Enviar</button>
                        </form>
                    </div>
                </div>
            </div>
        </section>

        <!--/Formulario de contacto-->

        <!--pie de pagina-->
        <footer class="footer-section">
            <div class="container">
                <div class="footer-cta py-5">
                    <div class="row">
                        <div class="col-sm-6 col-xl-4 mb-30">
                            <div class="single-cta">
                                <i class="fas fa-map-marker-alt"></i>
                                <div class="cta-text">
                                    <h4>Encuéntranos</h4>
                                    <span>Los Olivos, Lima - UTP Lima Norte</span>
                                </div>
                            </div>
                        </div>  
                        <div class="col-sm-6 col-xl-4 mb-30">
                            <div class="single-cta">
                                <i class="fas fa-phone"></i>
                                <div class="cta-text">
                                    <h4>Llámanos</h4>
                                    <span>987654321</span>
                                </div>
                            </div>
                        </div> 
                        <div class="col-sm-6 col-xl-4 mb-30">
                            <div class="single-cta">
                                <i class="fas fa-envelope-open"></i>
                                <div class="cta-text">
                                    <h4>Contáctanos</h4>
                                    <span>u20219580@utp.edu.pe</span>
                                </div>
                            </div>
                        </div> 
                    </div>
                </div>
                <div class="footer-content py-5">
                    <div class="row">
                        <div class="col-lg-4">
                            <div class="footer-widget">
                                <div class="footer-logo">
                                    <a href="#"><img src="" class="img-fluid"></a>
                                </div>
                                <div class="footer-text">
                                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Dignissimos cum magni voluptatibus exercitationem inventore dolore quas. Sunt officiis in exercitationem, assumenda nulla eius, inventore quisquam quis corrupti placeat animi recusandae!</p>
                                </div>
                                <div class="footer-social-icon">
                                    <span>Síguenos</span>
                                    <a href="#"><i class="fab fa-facebook-f facebook-bg"></i></a>
                                    <a href="#"><i class="fab fa-twitter twitter-bg"></i></a>
                                    <a href="#"><i class="fab fa-instagram instagram-bg"></i></a>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4">
                            <div class="footer-widget">
                                <div class="footer-logo">
                                    <div class="footer-widget-heading">
                                        <h3>Ir hacia:</h3>
                                    </div>
                                    <ul>
                                        <li><a href="#">Inicio</a></li>
                                        <li><a href="#">Blog</a></li>
                                        <li><a href="#">Nosotros</a></li>
                                        <li><a href="#">Psico-Amigos</a></li>
                                        <li><a href="#">Afíliate</a></li>
                                        <li><a href="#">Inicia sesión</a></li>
                                        <li><a href="#">Registro</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-4">
                            <div class="footer-widget">
                                <div class="footer-logo">
                                    <div class="footer-widget-heading">
                                        <h3>Suscríbete</h3>
                                    </div>
                                    <div class="footer-text">
                                        <p>No olvides suscribirte para obtener información actualizada de nuestra página web.</p>
                                    </div>
                                    <div class="suscribe-form">
                                        <form action="#">
                                            <input type="text" placeholder="Correo">
                                            <button><i class="fab fa-telegram-plane"></i></button>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="copyright-area">
                <div class="container">
                    <div class="row">
                        <div class="col-xl-6 col-lg-6 text-center text-lg-left">
                            <div class="copyright-text">
                                <p>Copyright &copy; 2022 Todos los derechos reservados <a href="#">PsicoFacil</a></p>
                            </div>
                        </div>
                        <div class="col-xl-6 col-lg-6 text-right d-none d-lg-block">
                            <div class="footer-menu">
                                <ul>
                                    <li><a href="#">Inicio</a></li>
                                    <li><a href="#">Términos y condiciones</a></li>
                                    <li><a href="#">Privacidad</a></li>
                                    <li><a href="#">Política</a></li>
                                    <li><a href="#">Contacto</a></li>   
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
        <!--Modal-->
        <div class="modal fade" id="modalTuto" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered modal-dialog-scrollable">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Instrucciones</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <span>Paso 1:</span>
                        <p>Dale click al boton empezar.</p>
                        <span>Paso 2:</span>
                        <p>Escoge el sevicio que se ajustan a tus preferencias.</p>
                        <span>Paso 3:</span>
                        <p>
                            Despues de terminar tu seleccion de preferencias, dale click al boton procesosar y listo! podras 
                            observar, todos lo necesario para ver a tu engreido bien, como tambien un estimado del
                            presupuesto  asi como donde comprarlos .
                        </p>
                        <p></p>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Entendido</button>
                        <a class="btn btn-ncc" href="app.html">Empezar</a>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <a id="back2Top" title="Back to top" href="#" class="smooth-scroll">&#10148;</a>
        <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <script src="js/wow.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/magnific-popup.js/1.1.0/jquery.magnific-popup.min.js"></script>
        <script src="js/jquery.flipster.min.js"></script>
        <script src="js/flipster-custom.js"></script>
        <script src="js/jquery.easing.1.3.js"></script>
        <script src="js/custom.js"></script>
        
        
        <script src="js/jquery.js"></script>
	<script src="js/price-range.js"></script>
    <script src="js/jquery.scrollUp.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/main.js"></script>
        <script>

                $(window).scroll(function () {
                    var scrl = $(window).scrollTop();
                    if (scrl < 60)
                    {
                        $('.header_01').removeClass('fixedbar');
                    } else
                    {
                        $('.header_01').addClass('fixedbar');
                    }
                });
        </script>
        <script>

            (function ($) {
                "use strict";

                $('.anim').magnificPopup({
                    type: 'inline',
                    fixedContentPos: false,
                    fixedBgPos: true,
                    overflowY: 'auto',
                    closeBtnInside: true,
                    preloader: false,
                    midClick: true,
                    removalDelay: 300,
                    mainClass: 'my-mfp-slide-bottom'
                });





            })(jQuery);

            /*Scroll to top when arrow up clicked BEGIN*/
            $(window).scroll(function () {
                var height = $(window).scrollTop();
                if (height > 100) {
                    $('#back2Top').fadeIn();
                } else {
                    $('#back2Top').fadeOut();
                }
            });
            $(document).ready(function () {
                $("#back2Top").click(function (event) {
                    event.preventDefault();
                    $("html, body").animate({scrollTop: 0}, "slow");
                    return false;
                });

            });

        </script>
        <script>
            new WOW().init();
        </script>

        <script>
            $(function () {

                $("a.smooth-scroll").click(function (event) {

                    event.preventDefault();

                    // get/return id like #about, #work, #team and etc
                    var section = $(this).attr("href");

                    $('html, body').animate({
                        scrollTop: $(section).offset().top - 64
                    }, 1250, "easeInOutExpo");
                });
            });

        </script>
    </body>
</html>

