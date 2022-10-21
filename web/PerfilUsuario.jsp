
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css"/>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://fonts.googleapis.com/css2?family=Oswald:wght@300;400;500;600&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="css/estiloperfil.css">
        <link rel="stylesheet" href="css/style-main.css"/>
        <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:wght@300&display=swap" rel="stylesheet">
        <!--   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@6.1.2/css/fontawesome.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css">  -->

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"> 
    </head>
    <body>
        <section id="container">
            <header>
                <div  id="logo">
                    <h2>USUARIO</h2>
                    <h4>MASCOTA:</h4>
                </div>
                <div class="social-icon-container">
                    <span class="socials-text">
                        <button class="pulse-button">
                            <i class="fa fa-share"></i>
                        </button>
                    </span>

                    <ul class="socialicons">
                        <li> <a href=""><i class="fa fa-facebook"></i></a> </li>
                        <li> <a href=""><i class="fa fa-twitter"></i></a> </li>
                        <li> <a href=""><i class="fa fa-linkedin"></i></a> </li> 
                        <li> <a href=""><i class="fa fa-whatsapp"></i></a> </li>
                    </ul>

                </div>

            </header>

            <section id="content">
                <div id="profile">
                    <div class="about">
                        <div class="photo-inner">
                            <ul>
                                <li><img src="assets/presencial.jpg" alt="alt"/></li>

                            </ul>

                        </div>
                        <h1>USUARIO</h1>
                        <h3>MASCOTA:</h3>
                        <br><!-- comment -->
                        <p></p>
                    </div>
                    <ul class="personal-info">
                        <li><label>nombre</label><span>Vilchez</span></li>
                        <li><label>cumpleaños</label><span>15 de jf</span></li>
                        <li><label>Direccion</label><span>lima </span></li>
                        <li><label>e-mail</label><span class="word-wrap">Vilchez.com</span></li>
                        <li><label>celular</label><span>123456789</span></li>
                        <li><label>website</label><span class="word-wrap">Vilchez.com</span></li>
                    </ul>

                </div>

                <nav class="menu">
                    <ul class="tabs">
                        <li class="tmenu" ><a href="#profile" class="tab-profile active"> 
                                <i>  <i class="fa fa-user"></i> </i>PERFIL
                            </a>
                        </li>
                        <li class="tmenu" >
                            <a href="#resume" > 
                                <i>  <i class="fa fa-wpexplorer"></i> </i>INFO DE MASCOTA
                            </a><!-- comment -->
                        </li>
                        <li class="tmenu" >
                            <a href="#portfolio"> 
                                <i><i class="fa fa-eercast"></i> </i>
                            </a><!-- comment -->
                        </li>
                        <li class="tmenu">
                            <a href="#contact" > 
                                <i><i class="fa fa-telegram"></i> </i>CONTANT
                            </a>
                        </li>
                    </ul>
                </nav>

                
                    <section id="resume">
                        <div class="timeline-section">
                            <div class="main-wrapper-resume">
                                <!-- carttitle-wrapper start -->

                                <div class="carttitle-wrapper">
                                    <div class="color-box">
                                        <button id="red-color" class="btn-style"></button>
                                        <button id="yellow-color" class="btn-style"></button>
                                        <button id="blue-color" class="btn-style"></button>
                                        <button id="green-color" class="btn-style"></button>
                                        <button class="setting-icon "><i class="fa fa-cog fa-spin" aria-hidden="true"></i></button>
                                    </div>
                                    <div class="container no-padding">
                                        <div class="row no-margin">
                                            <div class="col-md-6 no-padding bg-color-left">
                                                <div class="left-name bg-color-1">
                                                    <h2>USUARIO<span class="text-color">APELLIDO</span></h2>
                                                    <h5>MASCOTAS:</h5>
                                                    <p>Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed</p>
                                                </div>
                                                <div class="left-address">
                                                    <ul>
                                                        <li><span class="text-color">Phone no</span>97836277882</li>
                                                        <li><span class="text-color">address</span>lIMA.</li>
                                                        <li><span class="text-color">EMAIL US</span>info@USUARIO.com</li>
                                                    </ul>
                                                </div>
                                                <div class="ex-heading loader">
                                                    <h2>ACTIVO</h2>
                                                </div>
                                               
                                                
                                                
                                                
                                            </div>
                                            <div class="col-md-6 no-padding bg-color-right">
                                                <div class="top-skills">
                                                    <div class="skill-name">
                                                        <div class="sn">ASIDUO</div>
                                                        <ul>
                                                            <li></li>
                                                            <li></li>
                                                            <li></li>
                                                            <li></li>
                                                            <li></li>
                                                        </ul>
                                                    </div>
                                                    <div class="skill-name">
                                                        <div class="sn">AI</div>
                                                        <ul>
                                                            <li></li>
                                                            <li></li>
                                                            <li></li>
                                                            <li></li>
                                                            <li></li>
                                                        </ul>
                                                    </div>
                                                    <div class="skill-name">
                                                        <div class="sn">F</div>
                                                        <ul>
                                                            <li></li>
                                                            <li></li>
                                                            <li></li>
                                                            <li></li>
                                                            <li></li>
                                                        </ul>
                                                    </div>
                                                    <div class="skill-name">
                                                        <div class="sn">S</div>
                                                        <ul>
                                                            <li></li>
                                                            <li></li>
                                                            <li></li>
                                                            <li></li>
                                                            <li></li>
                                                        </ul>
                                                    </div>
                                                </div>
                                               
                                                
                                                <div class="address-qr-right">
                                                    <div class="row no-margin">
                                                        <div class="col-md-5 no-padding">
                                                            <div class="qr-box">
                                                                <img src="images/qr.png">
                                                            </div>
                                                        </div>
                                                        <div class="col-md-7 no-padding">
                                                            <div class="address-right-box">
                                                                <ul>
                                                                    <li>
                                                                        <i class="fa fa-phone-square" aria-hidden="true"></i>
                                                                        <p>45534546565</p>
                                                                    </li>
                                                                    <li>
                                                                        <i class="fa fa-envelope-o" aria-hidden="true"></i>
                                                                        <p>Info@gmail.com</p>
                                                                    </li>
                                                                    <li>
                                                                        <i class="fa fa-map-marker" aria-hidden="true"></i>
                                                                        <p>DerLIMA.</p>
                                                                    </li>
                                                                </ul>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                    </section><!-- /Resume -->
                

                <section id="portfolio">
                    <ul class="cats-filter" id="portfolio-filter">
                        <li><a href="" class="current transition" data-filter="*" >all</a> </li>
                        <li><a href="" class=" transition" data-filter=".webdesign" >web</a> </li>
                        <li><a href="" class=" transition" data-filter=".photography" >hjjtt</a> </li>
                        <li><a href="" class=" transition" data-filter=".illustration" >all</a> </li>
                        <li><a href="" class=" transition" data-filter=".print" >all</a> </li>
                        <li><a href="" class=" transition" data-filter=".animation" >all</a> </li>
                    </ul>
                    <div class="extra-text">
                        jkglkgjfj
                    </div>
                    <ul id="portfolio-list" >
                        <li class="illustration print">
                            <a href="" class="folio">
                                <img src="assets/a1.jpg" alt="alt"/>
                                <h2 class="title">hola</h2>
                                <span class="categorie">
                                    PRINT/ILLUSTRATION
                                </span>
                            </a>
                        </li>
                        <li class="webdesign">
                            <a href="" class="folio">
                                <img src="assets/a2.jpg" alt="alt"/>
                                <h2 class="title">quwkdfljl</h2>
                                <span class="categorie">
                                    WEB
                                </span>
                            </a>
                        </li>
                        <li class="photography">
                            <a href="" class="folio">
                                <img src="assets/a3.jpg" alt="alt"/>
                                <h2 class="title">hola</h2>
                                <span class="categorie">
                                   fotogradia
                                </span>
                            </a>
                        </li>
                        <li class="animation print">
                            <a href="" class="folio">
                                <img src="assets/a4.jpg" alt="alt"/>
                                <h2 class="title">hola</h2>
                                <span class="categorie">
                                    PRINT/ILLUSTRATION
                                </span>
                            </a>
                        </li>
                        <li class="illustration ">
                            <a href="" class="folio">
                                <img src="assets/a5.jpg" alt="alt"/>
                                <h2 class="title">hola</h2>
                                <span class="categorie">
                                    PRINT/ILLUSTRATION
                                </span>
                            </a>
                        </li>
                    </ul>

                </section>
                <section id="contact">
                    <p>
                        fkfjkaskfljasdñfjsalñkfdañkl
                        jkdflsdhjkjlkjhlkjlfhklfgjkfghk
                        lkghlñlkflñhfghklñf
                        fgfgjhjldhjkhhjkdsk
                        dhfdskjaldfhkljasfhalfhlsakjd
                        djslkfsdafljsdhfjks
                    </p>
                </section>
            </section>
            <footer>
                <div class="copyright">copyright &COPY;2022 david</div>
            </footer>
        </section>






        <div  class="container" > </div>
        <div id="container"></div>
        <h2 class="para"></h2>  






        <script src="https://code.jquery.com/jquery-3.6.1.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.min.js"></script>
        <script src="js/main.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.easytabs/3.2.0/jquery.easytabs.min.js" integrity="sha512-PIeHEefO3UOxPQ6b+3/XriKG36VTn7zzhndvXdkFdrfSzQY0aMHzDHRcuqUCEiGSLxoXgO/WGlJI8yXFH1+3Gw==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.isotope/1.5.25/jquery.isotope.min.js" integrity="sha512-ZYeIS5cMze3XxDC3kcrULFj/CcEm6/6q+0gxzBv+t3OKmRIj8homuq2N8+sio09Z025JJ4m/MbM2E/j05NskdA==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.caroufredsel/6.2.1/jquery.carouFredSel.packed.js" integrity="sha512-5Thlno/Mv5W8d5z7eEuOahEZ3nXZ0uAuOgf8m7p7+/9Ltkzt9sn9z6sR87m/9bqW9vqpywUq65YeNW0MuzW9Bw==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    </body>
</html>

