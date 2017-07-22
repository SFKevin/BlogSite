<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>cmsblogs,记录、分享java技术</title>
<link rel="stylesheet" type="text/css" href="${path}/resources/styles/index.css" />
<script language="javascript" type="text/javascript"
	src="<c:url value='/resources/js/jquery-1.9.1.min.js'/>"></script>
<script language="javascript" type="text/javascript"
	src="<c:url value='/resources/js/blog/index.js'/>"></script>
</head>
<body>
	<!-- 顶部 -->
	<jsp:include page="base/Worktopper.jsp" />
	<!-- 中间内容 -->
	<div class="home">
		<div class="content-wrap">
			<!-- 博客内容 -->
			<div class="content fl">
				<div class="blog-tabs">
					<div class="tabs-title">
						<ul>
							<li id="zdbl" class="zdbl hit">最新发布</li>
							<li class="readmore"><a href="${path}/workAll.action?pageNo=1"><span>more</span></a></li>
						</ul>
					</div>
					<br>
					<table>
					<c:forEach items="${dataList}" var="o" varStatus="status">
						 <tr>
							<td id="title" class="title"><a href="${path}/view.action?blog_Id=${o.blogId}">标题：${o.blogTitle}</a></td>
						 </tr>
						 <tr><td>&nbsp;</td></tr>
						 <tr>
							<td id="abstract" class="abstract"><a href="${path}/view.action?blog_Id=${o.blogId}">${o.blogContent}</a></td>
						<tr>
						<tr><td>&nbsp;</td></tr>
						<tr><td><hr></td></tr>
					</c:forEach>
					</table>
				</div>
			</div>
			<div class="sidebar fr">
				<jsp:include page="base/sidebar.jsp" />
			</div>
</body>
</html>