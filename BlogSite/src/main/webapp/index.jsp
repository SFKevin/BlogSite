<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>cmsblogs,记录、分享java技术</title>
<script language="javascript" type="text/javascript" src="<c:url value='/resources/js/jquery-1.9.1.min.js'/>" ></script>
<script language="javascript" type="text/javascript" src="<c:url value='/resources/js/blog/index.js'/>" ></script>
</head>
<body>
	<!-- 顶部 -->
	<jsp:include page="base/topper.jsp" />
	<!-- 中间内容 -->
	<div class="home">
		<div class="content-wrap">
			<!-- 博客内容 -->
			<div class="content fl">
				<div class="blog-tabs">
					<div class="tabs-title">
						<ul>
							<li id="zdbl" class="zdbl hit">热门博客</li>
							<li class="readmore">
								<span>more</span>
							</li>
						</ul>
					</div>
					<div class="tabs-content">
						<div id="zdbl_content" class="sticky">
							<ul>
							</ul>
						</div>
					</div>
				</div>
				<div class="newBlog">
					<div class="title"><h3>最新发布</h3></div>
					<ul id="newBlog">
					</ul>
				</div>
			</div>
			<!-- 侧边栏 -->
			<div class="sidebar fr">
				<jsp:include page="base/sidebar.jsp" />
			</div>
		</div>
	</div>
	<!-- 底部 -->
</body>
</html>