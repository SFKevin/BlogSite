<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/styles/baseStyle.css'/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/styles/styles.css'/>" />
<script type="text/javascript" src="../resources/js/jquery-1.11.1.js"></script>
</head>
<script type="text/javascript">
	
</script>
<body>
	<div class="header" id="header">
		<div class="blogTitle">
			<h1>
				<a href="${path}/index.jsp">kfsun的博客</a>
			</h1>
			<h2>心有多大，舞台就有多大</h2>
			<c:if test="${empty sessionScope.username}">
				<h2>
					<a href="${path}/logining.action">登录</a> <a
						href="${path}/regist.action">注册</a>
				</h2>
			</c:if>
			<c:if test="${!empty sessionScope.username}">
				<h2>${sessionScope.username}欢迎您!&nbsp;&nbsp;&nbsp;<a
						href="${path}/blog.jsp">写文章</a>
				</h2>
			</c:if>
		</div>
		<div class="navigator">
			<ul>
				<li><a href="${path}/index.jsp">首页</a></li>
				<li><a href="${path}/java.action">JAVA</a></li>
				<li><a href="${path}/android.action">Andriod</a></li>
				<li class="clicked"><a href="${path}/design.action">架构设计</a></li>
				<li><a href="${path}/other.action">其他技术</a></li>
				<li><a href="${path}/life.action">程序人生</a></li>
				<li><a href="${path}/work.action">我的作品</a></li>
				<li><a href="${path}/about.action">关于博主</a></li>
			</ul>
		</div>
	</div>
	<div class="bottom_tools">
		<a id="scrollUp" title="飞回顶部" href="javascript:;"></a>
	</div>
</body>
</html>