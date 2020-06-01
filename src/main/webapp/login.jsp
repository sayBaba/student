	<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"  isELIgnored="false" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>学生信息管理系统</title>
<script src="js/jquery-1.8.3.min.js" type="text/javascript"></script>
<script src="js/login.js" type="text/javascript"></script>
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<center>
		<div class="login">
			<div class="login_head">
				<h3>登录</h3>
			</div>

      <%--      <form action="/student_war/login" method="get">--%>
			<div class="login_window" >
				<div>
					<label>账号:</label> <br> <input type="text" name="ope_name"
						id="ope_name">
				</div>
				<div>
					<label>密码:</label> <br> <input type="password" name="ope_pwd"
						id="ope_pwd">
				</div>

                <div id="div1">${errMsg}</div>

				<input style="width:60px; float:right; margin-top:10px;margin-right:20px;" type="submit" value="登录" onclick="login()">
			</div>
         <%--   </form>--%>
		</div>
	</center>
</body>
</html>