<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; utf-8">
<title>登录</title>
<style type="text/css">
body {
	background-color: #ccffcc;
}

.header {
	position: relative;
	top: 300px;
	left: 40%;
}
</style>
<script language="javascript"
	src="${pageContext.request.contextPath}/resources/js/jquery-1.4.2.js"></script>
<script type="text/javascript">
	function check() {
		var username = $("#user").val();
		var password=$("#pass").val();
		if (username.length==0||password.length==0) {
			alert("用户名或密码不能为空!");
			return false;
		}
	}
</script>
</head>
<body>
	<div class="header">
		<form action="${path}/login.action" method="post"
			onsubmit="return check()">
			<table>
				<tr>
					<td colspan="2" style="color:red;"> ${msg}</td>
				</tr>
				<tr>
					<td>用户名：</td>
					<td><input type="text" name="username" id="user"></td>
				</tr>
				<tr>
					<td>密 码：</td>
					<td><input type="password" name="password" id="pass">
					<td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				</tr>
				<tr>
					<td align="right"><input type="submit" value="登录"></td>
					<td align="right"><a href="${path}/regist.action">去注册</a>
				</tr>
				<tr>
					<td colspan="2" align="center"><a href="${path}/index.jsp">返回首页</a></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>