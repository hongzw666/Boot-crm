<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>注册页面</title>
<style type="text/css">
#tian {
	line-height: 15px;
	color: aqua;
	font-size: 20px;
}
</style>
<meta http-equiv=Content-Type content="text/html; charset=utf-8">
<link href="${pageContext.request.contextPath}/css/style.css"
	type=text/css rel=stylesheet>
<link href="${pageContext.request.contextPath}/css/boot-crm.css"
	type=text/css rel=stylesheet>
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js">
</script>
<meta content="MSHTML 6.00.2600.0" name=GENERATOR>
<script>
// 判断是登录账号和密码是否为空
function check(){
    var usercode = $("#user_code").val();
    var username = $("#user_name").val();
    var password = $("#uesr_password").val();
    if(usercode=="" || password==""|| username==""){
    	$("#message").text("账号或密码不能为空！");
        return false;
    }  
    return true;
}
</script>
</head>
<body leftMargin=0 topMargin=0 marginwidth="0" marginheight="0"
	background="${pageContext.request.contextPath}/images/rightbg.jpg">
	<div ALIGN="center">
		<table border="0" width="1140px" cellspacing="0" cellpadding="0"
			id="table1">
			<tr>
				<td height="93"></td>
				<td></td>
			</tr>
			<tr>
				<td
					background="${pageContext.request.contextPath}/images/rights.jpg"
					width="740" height="412"></td>
				<td class="login_msg" width="400" align="center">
					<!-- margin:0px auto; 控制当前标签居中 -->
					<fieldset style="width: auto; margin: 0px auto;">
						<legend>
							<font style="font-size: 15px" face="宋体"> 欢迎使用BOOT客户管理系统 </font>
						</legend>
						<font color="red"> <%-- 提示信息--%> <span id="message">${msg}</span>
						</font>
						<%-- 提交后的位置：/WEB-INF/jsp/customer.jsp--%>
						<div id="tian">
							<label>
								<form action="${pageContext.request.contextPath }/success"
									method="post" onsubmit="return check()">

									账&nbsp;号：<input id="user_code" type="text" name="user_code"
										placeholder="请输入账号" /><br /> <br /> 姓&nbsp;名：<input
										type="text" placeholder="请输入姓名" id="user_name"
										name="user_name" /></br> <br /> 密&nbsp;码：<input
										id="uesr_password" type="password" name="uesr_password"
										placeholder="请输入密码" /><br /> <br />

									<center>
										<input type="submit" value="注册"
											style="height: 40px; width: 80px; margin-top: 20px; color: #000; background-color: #09C; font-size: 15px;" />
									</center>
								</form>
							</label>
						</div>
					</fieldset>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>