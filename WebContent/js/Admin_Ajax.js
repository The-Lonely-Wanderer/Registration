/**
 * 
 */
var xmlHttp;
function createxmlhttprequest() {
	// 判断是否为IE浏览器
	if (window.ActiveXObject) {
		// 通过IE下的ActiveXObject实现 xmlhttprequest对象
		xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
	} else if (window.XMLHttpRequest) {
		// 直接创建对应的 xmlhttprequest对象
		xmlHttp = new XMLHttpRequest();
	}
}
function huanzhe_ajax(){
	createxmlhttprequest();
	xmlHttp.open('GET',"AllUserServlet",true);
	xmlHttp.send(null);
	xmlHttp.onreadystatechange=function(){
		if(xmlHttp.readyState==4&&xmlHttp.status==200){
			var alList=new ArrayLis();
			var alList=xmlHttp.responseXML.getElementsByTagName("alList")[0].firstChild.data;			
			
			var json = jQuery.parseJSON(data);
			alert(alList);
			
			
			
			//alert(listArray);
			//showtable(alList);
		}
		
	}
	
	
}
