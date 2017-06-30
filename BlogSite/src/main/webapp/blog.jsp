<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>写博客</title>
<style type="text/css">
body{
 position:relative;
 left:30%;
}
</style>
</head>
<body>
	<form action="${path}/write.action" method="post">
		<table>
			<tr>
				<td>分类：</td>
				<td><select name="blogColumnAlias">
						<option value="java">Java</option>
						<option value="andriod">Android</option>
						<option value="design">架构设计</option>
						<option value="technology">其他技术</option>
						<option value="life">程序人生</option>
						<option value="work">我的作品</option>
				</select></td>
			</tr>
			<tr>
				<td>博客标题：</td>
				<td><input type="text" style="width:500px;" name="blogTitle" /></td>
			</tr>
			<tr>
				<td>内容：</td>
				<td><textarea style="width:500px;height:700px;"
					name="blogContent"></textarea></td>
			</tr>
			<tr>
				<td>置顶：</td>
				<td> 
				   <select name="blogStick">
				       <option value='Y'>是</option>
				       <option value='N'>否</option>
				   </select>
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="发布"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><a href="${path}/index.jsp">返回首页</a></td>
			</tr>
		</table>
	</form>
</body>
</html>