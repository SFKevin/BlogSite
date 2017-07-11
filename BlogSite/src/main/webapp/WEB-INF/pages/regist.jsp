<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<title>注册</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
<script type="text/javascript"
	src="${path}/resources/js/jquery-1.11.1.js"></script>
<script type="text/javascript"
	src="${path}/resources/js/jquery.validate.js"></script>
<style type="text/css">
body {
	position: relative;
	top: 200px;
}
#usernameVolidate{
  color:#ff0000;
  position: relative;
  left: 300px;
  display:none
  
}
</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 col-sm-offset-2">
				<div class="panel panel-default">
					<div class="panel-body">
					    <span id="usernameVolidate">用户名已存在</span>
						<form id="signupForm" method="post" class="form-horizontal"
							action="${path}/registed.action">
							<div class="form-group">
								<label class="col-sm-4 control-label" for="username">Username</label>
								<div class="col-sm-5">
									<input type="text" class="form-control" id="authorNickname"
										name="authorNickname" placeholder="Username" />
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-4 control-label" for="email">Email</label>
								<div class="col-sm-5">
									<input type="text" class="form-control" id="authorEmail"
										name="authorEmail" placeholder="Email" />
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-4 control-label" for="password">Password</label>
								<div class="col-sm-5">
									<input type="password" class="form-control" id="authorPassword"
										name="authorPassword" placeholder="Password" />
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-4 control-label" for="confirm_password">Confirm
									password</label>
								<div class="col-sm-5">
									<input type="password" class="form-control"
										id="confirm_password" name="confirm_password"
										placeholder="Confirm password" />
								</div>
							</div>

							<div class="form-group">
								<div class="col-sm-5 col-sm-offset-4">
									<div class="checkbox">
										<label> <input type="checkbox" id="agree" name="agree"
											value="agree" />Please agree to our policy
										</label>
									</div>
								</div>
							</div>

							<div class="form-group">
								<div class="col-sm-9 col-sm-offset-4">
									<button type="submit" class="btn btn-primary" name="signup"
										value="Sign up">Sign up</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		$("#authorNickname").blur(function() {
			$.post("/BlogSite/VolidateServlet", {
				authorNickname : $("#authorNickname").val()
			}, function(data) {
			var obj=eval("("+data+")");
			if(obj[0].authorNickname==$("#authorNickname").val()){
			  $("#usernameVolidate").css("display","block");
			}
			});
		});
		$(document)
				.ready(
						function() {
							$("#signupForm")
									.validate(
											{
												rules : {
													authorNickname : {
														required : true,
														minlength : 2
													},
													authorPassword : {
														required : true,
														minlength : 5
													},
													confirm_password : {
														required : true,
														minlength : 5,
														equalTo : "#authorPassword"
													},
													authorEmail : {
														required : true,
														email : true
													},
													agree : "required"
												},
												messages : {
													authorNickname : {
														required : "Please enter a username",
														minlength : "Your username must consist of at least 2 characters"
													},
													authorPassword : {
														required : "Please provide a password",
														minlength : "Your password must be at least 5 characters long"
													},
													confirm_password : {
														required : "Please provide a password",
														minlength : "Your password must be at least 5 characters long",
														equalTo : "Please enter the same password as above"
													},
													authorEmail : "Please enter a valid email address",
													agree : "Please accept our policy"
												},
												errorElement : "em",
												errorPlacement : function(
														error, element) {
													// Add the `help-block` class to the error element
													error
															.addClass("help-block");

													if (element.prop("type") === "checkbox") {
														error
																.insertAfter(element
																		.parent("label"));
													} else {
														error
																.insertAfter(element);
													}
												},
												highlight : function(element,
														errorClass, validClass) {
													$(element)
															.parents(
																	".col-sm-5")
															.addClass(
																	"has-error")
															.removeClass(
																	"has-success");
												},
												unhighlight : function(element,
														errorClass, validClass) {
													$(element)
															.parents(
																	".col-sm-5")
															.addClass(
																	"has-success")
															.removeClass(
																	"has-error");
												}
											});
						});
	</script>
</body>
</html>
