<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>登录页面</title>

<style type="text/css">
html, body {
	overflow: hidden;
	background: black;
}
</style>
<meta http-equiv=Content-Type content="text/html; charset=utf-8">
<link href="${pageContext.request.contextPath}/Boot_crm/css/style.css"
	type=text/css rel=stylesheet>
<link href="${pageContext.request.contextPath}/Boot_crm/css/boot-crm.css"
	type=text/css rel=stylesheet>
<script src="${pageContext.request.contextPath}/Boot_crm/js/beijing.js" />
<script src="${pageContext.request.contextPath}/Boot_crm/js/jquery-1.11.3.min.js" />

<meta content="MSHTML 6.00.2600.0" name=GENERATOR>
<script>
	// 判断是登录账号和密码是否为空
	function check() {
		var usercode = $("#usercode").val();
		var password = $("#password").val();
		if (usercode == "" || password == "") {
			$("#message").text("账号或密码不能为空！");
			return false;
		}
		return true;
	}
</script>
</head>
<body leftMargin=0 topMargin=0 marginwidth="0" marginheight="0">
	<div ALIGN="center">
		<table border="0" width="1140px" cellspacing="0" cellpadding="0"
			id="table1">
			<tr>
				<td height="93"></td>
				<td></td>
			</tr>
			<tr>
				<td width="740" height="412"></td>
				<td class="login_msg" width="400" align="center">
					<!-- margin:0px auto; 控制当前标签居中 -->
					<fieldset style="width: auto; margin: 0px auto;">
						<legend>
							<font style="font-size: 15px" face="宋体 " color="white">
								欢迎使用BOOT客户管理系统 </font>
						</legend>
						<font color="red"> <%-- 提示信息--%> <span id="message">${msg}</span>
						</font>
						<%-- 提交后的位置：/WEB-INF/jsp/customer.jsp--%>
						<form action="${pageContext.request.contextPath }/Boot_crm/login"
							method="post" onsubmit="return check()">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br /> <br /> <span
								style="color: white;">账&nbsp;号：</span><input id="usercode"
								type="text" name="usercode" /> <br /> <br /> <span
								style="color: white;"> 密&nbsp;码：</span><input id="password"
								type="password" name="password" /> <br /> <br />
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<center>
								<input style="color: black;" type="submit" value="登录" />
							</center>
						</form>
						<form action="${pageContext.request.contextPath }/Boot_crm/zc"
							method="post">
							&nbsp;&nbsp;&nbsp;
							<center>
								<input type="submit" style="color: black;" value="注册" "/>
							</center>
						</form>
					</fieldset>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>
