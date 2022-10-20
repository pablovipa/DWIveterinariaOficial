
jQuery(document).ready(function () {

    /* ---------------------------------------------------------------------- */
    /*	Custom Functions
     /* ---------------------------------------------------------------------- */
/*price range*/

 $('#sl2').slider();

	var RGBChange = function() {
	  $('#RGB').css('background', 'rgb('+r.getValue()+','+g.getValue()+','+b.getValue()+')')
	};	
		
/*scroll to top*/

$(document).ready(function(){
	$(function () {
		$.scrollUp({
	        scrollName: 'scrollUp', // Element ID
	        scrollDistance: 300, // Distance from top/bottom before showing element (px)
	        scrollFrom: 'top', // 'top' or 'bottom'
	        scrollSpeed: 300, // Speed back to top (ms)
	        easingType: 'linear', // Scroll to top easing (see http://easings.net/)
	        animation: 'fade', // Fade, slide, none
	        animationSpeed: 200, // Animation in speed (ms)
	        scrollTrigger: false, // Set a custom triggering element. Can be an HTML string or jQuery object
					//scrollTarget: false, // Set a custom target element for scrolling to the top
	        scrollText: '<i class="fa fa-angle-up"></i>', // Text for element, can contain HTML
	        scrollTitle: false, // Set a custom <a> title if required.
	        scrollImg: false, // Set true to use image
	        activeOverlay: false, // Set CSS color to display scrollUp active point, e.g '#00FFFF'
	        zIndex: 2147483647 // Z-Index for the overlay
		});
	});
});
    // Logo
    var $logo = $('#logo');

    if (location.href.indexOf("#") != -1) {
        $logo.show();
    }
    // Show logo 
    $('.menu .tabs a').click(function () {
        $logo.fadeIn('slow');
    });
    // Hide logo
    $('.tab-profile').click(function () {
        $logo.fadeOut('slow');
    });

$('#yellow-color').click(function(e){
   $(".main-wrapper-resume").attr("id","yellow"); 
});

$('#red-color').click(function(e){
   $(".main-wrapper-resume").attr("id","red"); 
});

$('#blue-color').click(function(e){
   $(".main-wrapper-resume").attr("id","blue"); 
});

$('#green-color').click(function(e){
   $(".main-wrapper-resume").attr("id","green"); 
});
$(".setting-icon").click(function(){
    $(".color-box").toggleClass("main");
});

    /* ---------------------------------------------------------------------- */
    /*	Resume
     /* ---------------------------------------------------------------------- */

    // Rating bars
    $(".skills li .rating").each(function (index, e) {

        // Vars
        var
                $ratNum = 7,
                $rat = $(e).attr("data-rat"),
                $point = "<span></span>";

        // Append points
        while ($ratNum > 0) {
            $(e).append($point);
            $ratNum--;
        }

        $(e).find("span").each(function (index, e) {
            if (index >= $rat)
                return false;
            // Append Disabled Rats
            $(e).animate({
                opacity: 1
            });
        });

    });

    /* ---------------------------------------------------------------------- */
    /*	About
     /* ---------------------------------------------------------------------- */

    // Profile Photo Slider
    $(".photo-inner ul").carouFredSel({
        direction: "left",
        circular: true,
        auto: true,
        scroll: {
            items: 1,
            fx: 'crossfade',
            duration: 1500,
            wipe: true
        },
        swipe: {
            onTouch: true
        },
        items: {
            width: 153
        }
    });

    /* ---------------------------------------------------------------------- */
    /*	Menu
     /* ---------------------------------------------------------------------- */

    // Needed variables
    var $content = $("#content");

    // Run easytabs
    $content.easytabs({
        animate: true,
        updateHash: false,
        transitionIn: 'slideDown',
        transitionOut: 'slideUp',
        animationSpeed: 600,
        tabs: ".tmenu",
        tabActiveClass: 'active',
    });


    // Hover menu effect
    $content.find('.tabs li a').hover(
            function () {
                $(this).stop().animate({marginTop: "-7px"}, 200);
            }, function () {
        $(this).stop().animate({marginTop: "0px"}, 300);
    }
    );

    // Menu Navigation
    $(".menu .tabs").carouFredSel({
        responsive: true,
        direction: "left",
        circular: false,
        infinite: false,
        pagination: "#menu-controls",
        auto: false,
        scroll: {
            items: 1,
            duration: 300,
            wipe: true
        },
        prev: {
            button: "#menu-prev",
            key: "right"
        },
        next: {
            button: "#menu-next",
            key: "left"
        },
        swipe: {
            onTouch: true
        },
        items: {
            width: 140,
            visible: {
                min: 2,
                max: 5
            }
        }
    });
    /* ---------------------------------------------------------------------- */
    /*	Cats Filter
     /* ---------------------------------------------------------------------- */

    var $catsfilter = $('.cats-filter');

    // Copy categories to item classes
    $catsfilter.find('a').click(function () {
        var currentOption = $(this).attr('data-filter');
        $(this).parent().parent().find('a').removeClass('current');
        $(this).addClass('current');
    });

    /* ---------------------------------------------------------------------- */
    /*	Portfolio
     /* ---------------------------------------------------------------------- */

    // Needed variables
    var $plist = $('#portfolio-list');
    var $pfilter = $('#portfolio-filter');

    // Run Isotope  
    $plist.isotope({
        filter: '*',
        layoutMode: 'masonry',
        animationOptions: {
            duration: 750,
            easing: 'linear'
        }
    });

    // Isotope Filter 
    $pfilter.find('a').click(function () {
        var selector = $(this).attr('data-filter');
        $plist.isotope({
            filter: selector,
            animationOptions: {
                duration: 750,
                easing: 'linear',
                queue: false,
            }
        });
        return false;
    });
});

