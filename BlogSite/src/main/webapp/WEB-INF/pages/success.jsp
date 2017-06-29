<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Refresh" content="3;url=${path}/index.jsp">
<title>注册成功</title>
<script type="text/javascript">
onload=function(){
  setInterval(go,1000);
}
var x=3;
function go(){
 x--;
 if(x>0){
 document.getElementById("sp").innerHTML=x;
 }
}
</script>
<style type="text/css">
body{
text-align:center;
}
span{
font-family:"Times New Roman";
font-size: 600%;
background-color:#ff0000;
position: relative;
top:107px;
}
</style>
</head>
<body>
<h2>注册成功！3秒后将回到首页。<a href="${path}/login.action">去登录</a></h2>
<span id="sp">3</span>
</body>
</html>