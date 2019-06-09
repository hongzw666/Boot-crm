<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8">
<title>注册页面</title>
<style type="text/css">
	body{
		margin:0;
		background-image:url(../../images/rightbg.jpg);
	}
	
	#bj{
		background-image:url(../../images/rights.jpg);
		width:740px;
		height:412px;
		}
	#tian{
		line-height: 30px;
		color: aqua;
		font-size: 20px;
		}
</style>
<meta http-equiv=Content-Type content="text/html; charset=utf-8">
<link href="${pageContext.request.contextPath}/css/style.css"
	   type=text/css rel=stylesheet>
<link href="${pageContext.request.contextPath}/css/boot-crm.css"
	   type=text/css rel=stylesheet>
<script src=
       "${pageContext.request.contextPath}/js/jquery-1.11.3.min.js">
</script>
<meta content="MSHTML 6.00.2600.0" name=GENERATOR>

</head>
<body>
<div ALIGN="center">
<table border="0" width="1140px" cellspacing="0" cellpadding="0"
                                                           id="table1">
	<tr>
		<td height="93"></td>
		<td></td>
	</tr>
	<tr>
   <td id="bj">
   </td>
   <td class="login_msg" width="400" align="center">
	 <!-- margin:0px auto; 控制当前标签居中 -->
	 <fieldset style="width: auto; margin: 0px auto;">
		  <legend>
		     <font style="font-size:15px" face="宋体">
		          欢迎您注册客户管理系统
		     </font>
		  </legend> 
		<font color="red">
			 
			 <span id="message"></span>
		</font>
		
		<div id="tian">
			<label>
				<form action="${pageContext.request.contextPath }" 
			                       method="post">
			       账&nbsp;号：<input type="text" placeholder="请输入账号" name="username" required /></br>
			       姓&nbsp;名：<input type="text" placeholder="请输入姓名"  required /></br>  
			       密&nbsp;码：<input type="password" placeholder="请输入密码" name="pwd" required /></br>
            
				  </form>
				  
				   <form action="${pageContext.request.contextPath }zcsuccess/" 
			                       method="post">
			 <input type="submit" value="提交注册" style="height: 40px; width: 80px; margin-top: 20px; color:#000; 
				   background-color:#09C; font-size: 15px;" />
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