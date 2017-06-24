/**
 * 
*/
$(".newsp").click(function() {//公告弹窗
	var _index = $(this).index();
	// alert(_index);
	$(".newsp .gonggao_con").eq(_index).slideDown(300);
});

$(".newsp .gonggao_con .close").click(function(event) {
	// var _index=$(this).index();
	$(this).parent(".gonggao_con").slideUp(300);
	event.stopPropagation();
});