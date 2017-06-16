;(function($) {
	$.featureList = function(tabs, output, options) {
		function slide(nr) {
			if (typeof nr == "undefined") {
				nr = visible_item + 1;
				nr = nr >= total_items ? 0 : nr;
			}

			tabs.removeClass('current').filter(":eq(" + nr + ")").addClass('current');

			output.stop(true, true).filter(":visible").fadeOut();
			output.filter(":eq(" + nr + ")").fadeIn(function() {
				visible_item = nr;	
			});
		}

		var options			= options || {}; 
		var total_items		= tabs.length;
		var visible_item	= options.start_item || 0;
		var aa=options.bb || 0;

		options.pause_on_hover		= options.pause_on_hover		|| true;
		options.transition_interval	= aa;

		output.hide().eq( visible_item ).show();
		tabs.eq( visible_item ).addClass('current');

		//tabs.click(function() {
	   tabs.mouseover(function() {
			if ($(this).hasClass('current')) {
				return false;	
			}

			slide( tabs.index( this) );
		});

		if (options.transition_interval > 0) {
			var timer = setInterval(function () {
				slide();
			}, options.transition_interval);

			if (options.pause_on_hover) {
				tabs.mouseenter(function() {
					clearInterval( timer );

				}).mouseleave(function() {
					clearInterval( timer );
					timer = setInterval(function () {
						slide();
					}, options.transition_interval);
				});
			}
		}
	};
})(jQuery);

$(document).ready(function() {
	$.featureList(
		$("#tabs li a"),
		$("#output li"),{
			//start_item:0
			bb:5000
		}
	);
	$.featureList(
		$("#tabs2 li a"),
		$("#output2 li"),{
			//start_item:1
			bb:6000
		}
	);
});


	
	

