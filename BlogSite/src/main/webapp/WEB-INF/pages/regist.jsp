<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; utf-8">
<title>登录</title>
<style type="text/css">
body{
background-color:#ccffcc;
}
.header{
position:relative;
top:300px;
left:40%;
}
</style>
<script type="text/javascript">
function check(){
  var user=document.getElementById("user").value;
  var pass=document.getElementById("pass").vlaue;
  if(user==""||user==null||pass==""||pass==null){
   alert("用户名或密码不能为空！");
    return false;
  }else{
   return true;
  }
}
</script>
</head>
<body>
<div class="header">
	<form action="${path}/registed.action" method="post">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="authorNickname" autofocus id="user"></td>
			</tr>
			<tr>
				<td>密 码：</td>
				<td><input type="password" name="authorPassword" id="pass">
				<td>
			</tr>
			<tr>
				<td>QQ：</td>
				<td><input type="text" name="authorQq">
				<td>
			</tr>
			<tr>
				<td>Email：</td>
				<td><input type="text" name="authorEmail">
				<td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="注册"></td>
			</tr>
	      <tr><td colspan="2" align="center"><a href="${path}/index.jsp">返回首页</a></td></tr>
		</table>
	</form>
</div>
</body>
</html>