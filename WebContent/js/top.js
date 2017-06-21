/**
 * 
 */
function autoplay() {
	var i = 0;
	var time;
	time = setInterval(function() {
		$(".top_s").eq(i).show(500).siblings().hide(500);
		i++;
		if (i > 3) {
			i = 0;
		}
	}, 5000);
}
autoplay();

$(".top_s").hover(function() {
	clearInterval(time);
}, function() {
	autoplay();
});