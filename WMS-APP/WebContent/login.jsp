<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
<script src="js/source/jquery-1.10.2.js"></script>

<link rel="stylesheet" type="text/css" href="css/login/login.css"/>

</head>
<body>
<div id="container_login">

<div class="content">
<div class="left_content">
<img  src="image/register/login_banner.png"/>
</div><!--left end-->
<div class="right_content">
<div class="right_img_login"><img  src="image/register/login_logofif.png"/>
</div>
<div class="login_background">
	<form id="form" action="login" method="post">
		<div class="div_username"><span>用户名：</span><br /><input id="account"  type="text" name="user.userId" style="height:30px; width:250px; border-radius:5px;" /><span id="eraccount" style=" color:red;"></span></div>
		<div class="div_password"><span>密码：</span><br /><input id="password" type="password" name="user.password" style="height:30px; width:250px; border-radius:5px;"/><span id="erpassword" style=" color:red;">${message }</span></div>
		
		<span class="forget_pas">忘记密码？</span>
		<div class="remeber_number"><input type="checkbox"/> 记住账号</div>
		<div class="btn_login" id="login">登 陆</div>
	</form>
<span class="span_new_count"><a href="register.jsp">注册新账号</a></span>
</div>
</div><!--right end-->
</div><!--content end-->
</div><!--container_login end-->
<script type="text/javascript">
$(document).ready(function(){
	  $("#login").click(function(){
		  if($("#account").val()==""){
			  $("#eraccount").text("用户名不能为空！");
		  }else if($("#password").val()==""){
			  $("#erpassword").text("密码不能为空！");
		  }else{
			  $("#form").submit();
		  }
	  });
	});

</script>
</body>
</html>