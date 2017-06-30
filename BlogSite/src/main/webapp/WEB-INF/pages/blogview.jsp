<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; utf-8">
<style type="text/css">
div{
position:relative;
top:20px;
left:40%;
}
p{
margin-left:2cm;
margin-right:2cm;
}
</style>
</head>
<body>
<div>
   <h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${blog.blogTitle}</h1>
   <h3>作者：${author} 发布时间：${blog.blogCreatetime}</h3>
</div>
<p>
${blog.blogContent}
</p>
<br/><br/><br/>
<a href="${path}/index.jsp">返回首页</a>
</body>
</html>