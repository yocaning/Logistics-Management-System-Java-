jQuery('document').ready(function($) {	
	/*=========================================*/
	/*         preloder                       */
	/*=========================================*/	
	
	//preloder ready function code		
		setTimeout(function(){
			$('body').addClass('loaded');
			$('h1').css('color','#222222');
		}, 100);
	// end preloder ready function code

		
	/*=========================================*/
	/*         Subscribe                       */
	/*=========================================*/
	
	$('#mc-form').ajaxChimp({
		url: 'http://doelit.us10.list-manage.com/subscribe/post?u=b02e4f21e264536eff4820875&amp;id=4d57faf2cb'
	});/*here Replace Your AjaxChimp Subscription Link */
	
	
	/*=========================================*/
	/*         Slicknav                       */
	/*=========================================*/	
	/* Slicknav */
		$("#nav").slicknav();
	        
     /* Sticky Menu */        
        
        var s = $("#sticker");
            var pos = s.position();					   
            $(window).scroll(function() {
                var windowpos = $(window).scrollTop();
                if (windowpos >= pos.top) {
                    s.addClass("stick");
                } else {
                    s.removeClass("stick");	
                }
            });
		
	/*=========================================*/
	/*         Countdown                       */
	/*=========================================*/	

		$('.countdown').downCount({
			date: '01/23/2019 12:00:00', // Change this date and time
			offset: +10
		}, function () {
			alert('WOOT WOOT, done!');  // Finish Message
		});

	
	/*=========================================*/
	/*         OwlCarousel  1                      */
	/*=========================================*/	
	
		$("#carousel_wrapper_worker").owlCarousel({		
			autoPlay: 7000, //Set autoplay to 3 seconds
			navigation: false,
			pagination: true,
			items : 3,
			itemsDesktop : [1199,3],
			itemsDesktopSmall : [979,2],
		});
		
	/*=========================================*/
	/*         OwlCarousel  2                     */
	/*=========================================*/			
		$("#carousel_wrapper").owlCarousel({		
			autoPlay: 7000, //Set autoplay to 3 seconds
			navigation: false,
			pagination: true,
			items : 3,
			itemsDesktop : [1199,3],
			itemsDesktopSmall : [979,2],
		});
		
	/*====================================================*/
	/*  Home, Services, Team, About, and Contact hover     */
	/*=====================================================*/	   
	$("#section1, #section2, #section3, #section4").hide();
	var menu1 = ("#section1, #section2, #section3, #section4");
	var menu2 = (".home_area, #section2, #section3, #section4");
	var menu3 = (".home_area, #section1, #section3, #section4");
	var menu4 = (".home_area, #section1, #section2, #section4");
	var menu5 = (".home_area, #section1, #section2, #section3");
	
	$(".home").hover(function() {
		$(menu1).hide(0, function() {
			$(".home_area").show(0);
		});
	});
		
	$(".services").hover(function() {
		$(menu2).hide(0, function() {
			$("#section1").show(0);
		});
	});	
	
	$(".team_member").hover(function() {
		$(menu3).hide(0, function() {
			$("#section2").show(0);
		});
	});
	
	$(".about_us").hover(function() {
		$(menu4).hide(0, function() {
			$("#section3").show(0);
		});
	});
		
	$(".contact_us").hover(function() {
		$(menu5).hide(0, function() {
			$("#section4").show(0);
		});
	});
	
	$(".home").mouseenter(function() {
		$(".home_area").addClass('animated fadeIn');
	});	
	$(".home").mouseleave(function() {
		$(".home_area").removeClass('animated fadeIn');
	});
	
	$(".services").mouseenter(function() {
		$("#section1").addClass('animated fadeIn');
	});	
	$(".services").mouseleave(function() {
		$("#section1").removeClass('animated fadeIn');
	});	
	
	$(".team_member").mouseenter(function() {
		$("#section2").addClass('animated fadeIn');
	});	
	$(".team_member").mouseleave(function() {
		$("#section2").removeClass('animated fadeIn');
	});
	
	$(".about_us").mouseenter(function() {
		$("#section3").addClass('animated fadeIn');
	});	
	$(".about_us").mouseleave(function() {
		$("#section3").removeClass('animated fadeIn');
	});
	
	$(".contact_us").mouseenter(function() {
		$("#section4").addClass('animated fadeIn');
	});	
	$(".contact_us").mouseleave(function() {
		$("#section4").removeClass('animated fadeIn');
	});
	
	/*=========================================*/
	/*       Team_member overlay hover         */
	/*=========================================*/

	/*  team_member  */
	$(".member_icon, .member_icon1, .member_icon2, .member_icon3, .overlay, .overlay1, .overlay2, .overlay3").hide();
	
	$(".member_picture1").hover(function() {
		$(".member_icon, .overlay").show(0).addClass('animated flipInY');
	});							
	
	$(".member_picture1").mouseleave(function() {
		$(".member_icon, .overlay").hide(0).removeClass('flipInY');
	});							

		
	$(".member_picture2").hover(function() {
		$(".member_icon1, .overlay1").show(0).addClass('animated flipInY');
	});							
	
	$(".member_picture2").mouseleave(function() {
		$(".member_icon1, .overlay1").hide(0).removeClass('flipInY');
	});							
		
	$(".member_picture3").hover(function() {
		$(".member_icon2, .overlay2").show(0).addClass('animated flipInY');
	});							
	
	$(".member_picture3").mouseleave(function() {
		$(".member_icon2, .overlay2").hide(0).removeClass('flipInY');
	});							
		
	$(".member_picture4").hover(function() {
		$(".member_icon3, .overlay3").show(0).addClass('animated flipInY');
	});							
	
	$(".member_picture4").mouseleave(function() {
		$(".member_icon3, .overlay3").hide(0).removeClass('flipInY');
	});	
	
	/*=========================================*/
	/*        Google map and social icon       */
	/*=========================================*/
	
	/*  google map and social icon  */
	$(".map_hide, .map_corse1, .map_corse2, .hide_social").hide();
	$(".map_show").on('click', function() {
		$(".map_hide, .map_corse1").show(0);
		$(".map_show").hide(0);
	});

	$(".map_corse1").on('click', function() {
		$(".map_hide, .map_corse1").hide(0);
		$(".map_show").show(0);
	});

	$(".show_social").on('click', function() {
		$(".hide_social, .map_corse2").show(0);
		$(".show_social").hide(0);
	});

	$(".map_corse2").on('click', function() {
		$(".hide_social, .map_corse2").hide(0);
		$(".show_social").show(0);
	});

	/*=========================================*/
	/*         color change js                   */
	/*=========================================*/
	
	// button_ color
	$(".home_area").mouseenter(function() {
		$(".home").css('border-color' , '#5885C8');
		
	});		
	$(".home_area").mouseleave(function() {
		$(".home").css('border-color' , '#fff');
		
	});	
		
	$("#section1").mouseenter(function() {
		$(".services").css('border-color' , '#5885C8');
	});			
	$("#section1").mouseleave(function() {
		$(".services").css('border-color' , '#fff');
	});	
			
	$("#section2").mouseenter(function() {
		$(".team_member").css('border-color' , '#5885C8');
	});						
	$("#section2").mouseleave(function() {
		$(".team_member").css('border-color' , '#fff');
	});	
				
	$("#section3").mouseenter(function() {
		$(".about_us").css('border-color' , '#5885C8');
	});						
	$("#section3").mouseleave(function() {
		$(".about_us").css('border-color' , '#fff');
	});	
					
	$("#section4").mouseenter(function() {
		$(".contact_us").css('border-color' , '#5885C8');
	});						
	$("#section4").mouseleave(function() {
		$(".contact_us").css('border-color' , '#fff');
	});	

	
	var color_change =(".email_submit, .overlay, .overlay1, .overlay2, .overlay3 ");
		// blue color
	$(".blue").click(function() {
		$(color_change).css('background', '#2098F5')
		$("ul.countdown li span").css('color', '#2098F5')
		$(".big_icon").css('color', '#2098F5');
		$(".big_icon").hover(function() {
			$(this).css({
				"background": "#2098F5",
				"color": "#fff",
			});
		});
		$(".big_icon").mouseleave(function() {
			$(this).css({
				"background": "#fff",
				"color": "#2098F5",
			});
		});
		$(".home_area").hover(function() {
			$(".home").css('border-color' , '#2098F5');
			
		});		
		$(".home_area").mouseleave(function() {
			$(".home").css('border-color' , '#fff');
			
		});	
		$("#section1").mouseenter(function() {
			$(".services").css('border-color' , '#2098F5');
		});			
		$("#section1").mouseleave(function() {
			$(".services").css('border-color' , '#fff');
		});	
				
		$("#section2").mouseenter(function() {
			$(".team_member").css('border-color' , '#2098F5');
		});						
		$("#section2").mouseleave(function() {
			$(".team_member").css('border-color' , '#fff');
		});	
					
		$("#section3").mouseenter(function() {
			$(".about_us").css('border-color' , '#2098F5');
		});						
		$("#section3").mouseleave(function() {
			$(".about_us").css('border-color' , '#fff');
		});	
						
		$("#section4").mouseenter(function() {
			$(".contact_us").css('border-color' , '#2098F5');
		});						
		$("#section4").mouseleave(function() {
			$(".contact_us").css('border-color' , '#fff');
		});	

		});
		// yellow color
	$(".yellow").click(function() {
		$(color_change).css('background', '#FF8F00')
		$("ul.countdown li span").css('color', '#FF8F00')
		$(".big_icon").css('color', '#FF8F00');
		$(".big_icon").hover(function() {
			$(this).css({
				"background": "#FF8F00",
				"color": "#fff",
			});
		});
		$(".big_icon").mouseleave(function() {
			$(this).css({
				"background": "#fff",
				"color": "#FF8F00",
			});
		});
		$(".home_area").hover(function() {
			$(".home").css('border-color' , '#FF8F00');
			
		});		
		$(".home_area").mouseleave(function() {
			$(".home").css('border-color' , '#fff');
			
		});	
		$("#section1").mouseenter(function() {
			$(".services").css('border-color' , '#FF8F00');
		});			
		$("#section1").mouseleave(function() {
			$(".services").css('border-color' , '#fff');
		});	
				
		$("#section2").mouseenter(function() {
			$(".team_member").css('border-color' , '#FF8F00');
		});						
		$("#section2").mouseleave(function() {
			$(".team_member").css('border-color' , '#fff');
		});	
					
		$("#section3").mouseenter(function() {
			$(".about_us").css('border-color' , '#FF8F00');
		});						
		$("#section3").mouseleave(function() {
			$(".about_us").css('border-color' , '#fff');
		});	
						
		$("#section4").mouseenter(function() {
			$(".contact_us").css('border-color' , '#FF8F00');
		});						
		$("#section4").mouseleave(function() {
			$(".contact_us").css('border-color' , '#fff');
		});	

		});
		// red color 
		$(".red").click(function() {
		$(color_change).css('background', '#C62828')
		$("ul.countdown li span").css('color', '#C62828')
		$(".big_icon").css('color', '#C62828');
		$(".big_icon").hover(function() {
			$(this).css({
				"background": "#C62828",
				"color": "#fff",
			});
		});
		$(".big_icon").mouseleave(function() {
			$(this).css({
				"background": "#fff",
				"color": "#C62828",
			});
		});
		$(".home_area").hover(function() {
			$(".home").css('border-color' , '#C62828');
			
		});		
		$(".home_area").mouseleave(function() {
			$(".home").css('border-color' , '#fff');
			
		});	
		$("#section1").mouseenter(function() {
			$(".services").css('border-color' , '#C62828');
		});			
		$("#section1").mouseleave(function() {
			$(".services").css('border-color' , '#fff');
		});	
				
		$("#section2").mouseenter(function() {
			$(".team_member").css('border-color' , '#C62828');
		});						
		$("#section2").mouseleave(function() {
			$(".team_member").css('border-color' , '#fff');
		});	
					
		$("#section3").mouseenter(function() {
			$(".about_us").css('border-color' , '#C62828');
		});						
		$("#section3").mouseleave(function() {
			$(".about_us").css('border-color' , '#fff');
		});	
						
		$("#section4").mouseenter(function() {
			$(".contact_us").css('border-color' , '#C62828');
		});						
		$("#section4").mouseleave(function() {
			$(".contact_us").css('border-color' , '#fff');
		});	

		});
		// green color 
		$(".green").click(function() {
		$(color_change).css('background', '#2E7D32')
		$("ul.countdown li span").css('color', '#2E7D32')
		$(".big_icon").css('color', '#2E7D32');
		$(".big_icon").hover(function() {
			$(this).css({
				"background": "#2E7D32",
				"color": "#fff",
			});
		});
		$(".big_icon").mouseleave(function() {
			$(this).css({
				"background": "#fff",
				"color": "#2E7D32",
			});
		});
		$(".home_area").hover(function() {
			$(".home").css('border-color' , '#2E7D32');
			
		});		
		$(".home_area").mouseleave(function() {
			$(".home").css('border-color' , '#fff');
			
		});	
		$("#section1").mouseenter(function() {
			$(".services").css('border-color' , '#2E7D32');
		});			
		$("#section1").mouseleave(function() {
			$(".services").css('border-color' , '#fff');
		});	
				
		$("#section2").mouseenter(function() {
			$(".team_member").css('border-color' , '#2E7D32');
		});						
		$("#section2").mouseleave(function() {
			$(".team_member").css('border-color' , '#fff');
		});	
					
		$("#section3").mouseenter(function() {
			$(".about_us").css('border-color' , '#2E7D32');
		});						
		$("#section3").mouseleave(function() {
			$(".about_us").css('border-color' , '#fff');
		});	
						
		$("#section4").mouseenter(function() {
			$(".contact_us").css('border-color' , '#2E7D32');
		});						
		$("#section4").mouseleave(function() {
			$(".contact_us").css('border-color' , '#fff');
		});	

		});
		// purple color 
		$(".purple").click(function() {
		$(color_change).css('background', '#6A1B9A')
		$("ul.countdown li span").css('color', '#6A1B9A')
		$(".big_icon").css('color', '#6A1B9A');
		$(".big_icon").hover(function() {
			$(this).css({
				"background": "#6A1B9A",
				"color": "#fff",
			});
		});
		$(".big_icon").mouseleave(function() {
			$(this).css({
				"background": "#fff",
				"color": "#6A1B9A",
			});
		});
		$(".home_area").hover(function() {
			$(".home").css('border-color' , '#6A1B9A');
			
		});		
		$(".home_area").mouseleave(function() {
			$(".home").css('border-color' , '#fff');
			
		});	
		$("#section1").mouseenter(function() {
			$(".services").css('border-color' , '#6A1B9A');
		});			
		$("#section1").mouseleave(function() {
			$(".services").css('border-color' , '#fff');
		});	
				
		$("#section2").mouseenter(function() {
			$(".team_member").css('border-color' , '#6A1B9A');
		});						
		$("#section2").mouseleave(function() {
			$(".team_member").css('border-color' , '#fff');
		});	
					
		$("#section3").mouseenter(function() {
			$(".about_us").css('border-color' , '#6A1B9A');
		});						
		$("#section3").mouseleave(function() {
			$(".about_us").css('border-color' , '#fff');
		});	
						
		$("#section4").mouseenter(function() {
			$(".contact_us").css('border-color' , '#6A1B9A');
		});						
		$("#section4").mouseleave(function() {
			$(".contact_us").css('border-color' , '#fff');
		});	

		});
		// pink color 
		$(".pink").click(function() {
		$(color_change).css('background', '#AD1457')
		$("ul.countdown li span").css('color', '#AD1457')
		$(".big_icon").css('color', '#AD1457');
		$(".big_icon").hover(function() {
			$(this).css({
				"background": "#AD1457",
				"color": "#fff",
			});
		});
		$(".big_icon").mouseleave(function() {
			$(this).css({
				"background": "#fff",
				"color": "#AD1457",
			});
		});
		$(".home_area").hover(function() {
			$(".home").css('border-color' , '#AD1457');
			
		});		
		$(".home_area").mouseleave(function() {
			$(".home").css('border-color' , '#fff');
			
		});	
		$("#section1").mouseenter(function() {
			$(".services").css('border-color' , '#AD1457');
		});			
		$("#section1").mouseleave(function() {
			$(".services").css('border-color' , '#fff');
		});	
				
		$("#section2").mouseenter(function() {
			$(".team_member").css('border-color' , '#AD1457');
		});						
		$("#section2").mouseleave(function() {
			$(".team_member").css('border-color' , '#fff');
		});	
					
		$("#section3").mouseenter(function() {
			$(".about_us").css('border-color' , '#AD1457');
		});						
		$("#section3").mouseleave(function() {
			$(".about_us").css('border-color' , '#fff');
		});	
						
		$("#section4").mouseenter(function() {
			$(".contact_us").css('border-color' , '#AD1457');
		});						
		$("#section4").mouseleave(function() {
			$(".contact_us").css('border-color' , '#fff');
		});	

		});








});