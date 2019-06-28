<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ page import="com.qst.itoffer.bean.ResumeBasicinfo" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>简历基本信息修改 - 锐聘网</title>
<base href="<%=basePath%>">
<link href="css/base.css" type="text/css" rel="stylesheet" />
<link href="css/resume.css" type="text/css" rel="stylesheet" />
<meta content="大学生求职,大学生就业,大学生招聘,IT人才,IT人才招聘,大学生名企招聘,,大学生找工作,IT名企招聘，IT行业招聘，IT企业快速入职" name="keywords">
<meta content="锐聘专注于为企业提供高效的人力资源解决方案，同时面向IT类技术人才推出快速一站式免费就业服务。秉承QST青软实训人才服务理念，为数千家企业量身定做个性化、全程化的人才培养体系，同时帮助中高级人才铺设成功之路，为人才和企业架设起沟通之桥。" name="description">
<!-- 日期控件js -->
<script src="js/Calendar6.js" type="text/javascript" language="javascript"></script>
<script type="text/javascript">
	function validate() {
		var realname = document.getElementById("realname");
		var telephone = document.getElementById("telephone");
		var email = document.getElementById("email");
		// 邮箱格式正则表达式
		var emailPattern =/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/;
		// 手机号格式正则表达式
		var phonePattern = /^(((13[0-9]{1})|159|153)+\d{8})$/;
		
		if (realname.value == ""){
			alert("姓名不能为空！");
			realname.focus();
			return false;
		}
		if (telephone.value == ""){
			alert("手机不能为空！");
			telephone.focus();
			return false;
		}else if(!phonePattern.test(telephone.value)){
			alert("手机号格式不正确！");
			telephone.focus();
			return false;
		}
		if (email.value == ""){
			alert("邮箱不能为空！");
			email.focus();
			return false;
		}else if(!emailPattern.test(email.value)){
			alert("邮箱格式不正确！");
			email.focus();
			return false;
		}
		return true;
	}
</script>
</head>
<body>
	<jsp:include page="../top.jsp"></jsp:include>
	<%
	request.setCharacterEncoding("UTF-8"); 
	%>
	<jsp:useBean id="basicinfo" class="com.qst.itoffer.bean.ResumeBasicinfo" scope="request"/>
	
	<!-- 我的简历页面 开始 -->
	<div class="resume_con">
		<!--tab设置-->
		<div class="user_operate">
			<ul style="float: left">
				<li><a href="ResumeBasicinfoServlet?type=select" class="active">我的简历</a></li>
				<li><a href="#">我的申请</a></li>
			</ul>
			<div class="clear"></div>
		</div>
		<!--主体部分-->
		<div class="resume_main">
			<!--左边-->
			<div class="resume_left">
				<div class="resume_title">
					<div style="float: left">基本信息</div>
				</div>
				<div class="all_resume" style="text-align: center;" align="center">
				
				<%if("update".equals(request.getParameter("type"))){ %>
					<jsp:setProperty property="*" name="basicinfo"/>
					<jsp:setProperty property="resumeUpdate" value="<%=basicinfo %>" name="basicinfo"/>
					<h3><font color="red"><jsp:getProperty property="resumeUpdateResult" name="basicinfo"/></font></h3>
				<%} %>
				
<!--------------------- 简历基本信息添加 ------------------------->
<form action="applicant/resumeBasicinfoUpdate.jsp?type=update" method="post" onsubmit="return validate();">
	<div class="table_style" style="margin-left:150px;">
		<table width="350" border="0" cellpadding="3" cellspacing="1" bgcolor="#EEEEEE">
			<tr>
				<td width="110" align="right" bgcolor="#F8F8F8">姓名：</td>
				<td bgcolor="#F8F8F8" align="left">
<input type="text" id="realname" name="realName" value="<jsp:getProperty name="basicinfo" property="realName"/>">
<input type="hidden" name="basicinfoId" value="<jsp:getProperty name="basicinfo" property="basicinfoId"/>">
				<font style="color: red">*</font></td>
			</tr>
		</table>
		<div class="he"></div>
		<table width="350" border="0" cellpadding="3" cellspacing="1"
			bgcolor="#EEEEEE">
			<tr>
				<td width="110" align="right" bgcolor="#F8F8F8">性别：</td>
				<td bgcolor="#F8F8F8" align="left">
				<input type="radio" name="gender" value="男"
				<%if("男".equals(basicinfo.getGender())){ %>
				checked="checked" <%} %>>男&nbsp;&nbsp; 
				<input type="radio" name="gender" value="女"
				<%if("女".equals(basicinfo.getGender())){ %>
				checked="checked" <%} %>>女</td>
			</tr>
		</table>
		<div class="he"></div>
		<table width="350" border="0" cellpadding="3" cellspacing="1"
			bgcolor="#EEEEEE">
			<tr>
				<td width="110" align="right" bgcolor="#F8F8F8">出生日期：</td>
				<td bgcolor="#F8F8F8" align="left">
				<input name="strbirthday" type="text" id="birthday" onclick="SelectDate(this)" 
				readonly="readonly" value="<jsp:getProperty name="basicinfo" property="strbirthday"/>"/></td>
			</tr>
		</table>
		<div class="he"></div>
		<table width="350" border="0" cellpadding="3" cellspacing="1"
			bgcolor="#EEEEEE">
			<tr>
				<td width="110" align="right" bgcolor="#F8F8F8">当前所在地：</td>
				<td bgcolor="#F8F8F8" align="left">
				<input type="text" name="currentLoc" value="<jsp:getProperty name="basicinfo" property="currentLoc"/>"></td>
			</tr>
		</table>
		<div class="he"></div>
		<table width="350" border="0" cellpadding="3" cellspacing="1"
			bgcolor="#EEEEEE">
			<tr>
				<td width="110" align="right" bgcolor="#F8F8F8">户口所在地：</td>
				<td bgcolor="#F8F8F8" align="left">
				<input type="text" name="residentLoc" value="<jsp:getProperty name="basicinfo" property="residentLoc"/>"></td>
			</tr>
		</table>
		<div class="he"></div>
		<table width="350" border="0" cellpadding="3" cellspacing="1"
			bgcolor="#EEEEEE">
			<tr>
				<td width="110" align="right" bgcolor="#F8F8F8">手机：</td>
				<td bgcolor="#F8F8F8" align="left">
				<input type="text" id="telephone" name="telephone" value="<jsp:getProperty name="basicinfo" property="telephone"/>">
				<font style="color: red">*</font></td>
			</tr>
		</table>
		<div class="he"></div>
		<table width="350" border="0" cellpadding="3" cellspacing="1"
			bgcolor="#EEEEEE">
			<tr>
				<td width="110" align="right" bgcolor="#F8F8F8">邮件：</td>
				<td bgcolor="#F8F8F8" align="left">
				<input type="text" id="email" name="email" value="<jsp:getProperty name="basicinfo" property="email"/>">
				<font style="color: red">*</font></td>
			</tr>
		</table>
		<div class="he"></div>
		<table width="350" border="0" cellpadding="3" cellspacing="1"
			bgcolor="#EEEEEE">
			<tr>
				<td width="110" align="right" bgcolor="#F8F8F8">求职意向：</td>
				<td bgcolor="#F8F8F8" align="left">
				<input type="text" name="jobIntension" value="<jsp:getProperty name="basicinfo" property="jobIntension"/>"></td>
			</tr>
		</table>
		<div class="he"></div>
		<table width="350" border="0" cellpadding="3" cellspacing="1"
			bgcolor="#EEEEEE">
			<tr>
				<td width="110" align="right" bgcolor="#F8F8F8">工作经验：</td>
				<td bgcolor="#F8F8F8" align="left">
				<select name="jobExperience">
					<option value="0">请选择</option>
					<option value="刚刚参加工作" <%if("刚刚参加工作".equals(basicinfo.getJobExperience())){ %>
					selected="selected"<%} %>>刚刚参加工作</option>
					<option value="已工作一年"<%if("已工作一年".equals(basicinfo.getJobExperience())){ %>
					selected="selected"<%} %>>已工作一年</option>
					<option value="已工作二年"<%if("已工作二年".equals(basicinfo.getJobExperience())){ %>
					selected="selected"<%} %>>已工作二年</option>
					<option value="已工作三年"<%if("已工作三年".equals(basicinfo.getJobExperience())){ %>
					selected="selected"<%} %>>已工作三年</option>
					<option value="已工作三年以上"<%if("已工作三年以上".equals(basicinfo.getJobExperience())){ %>
					selected="selected"<%} %>>已工作三年以上</option>
				</select></td>
			</tr>
		</table>
		<div class="he"></div>
		<div class="he"></div>
		<div align="center">
			<input name="" type="submit" class="save1" value="保存">
			<input name="" type="button" onclick="javascript:window.location.href='<%=basePath%>ResumeBasicinfoServlet?type=select';" class="cancel2" value="返回">
		</div>
	</div>
</form>
<!--------------------- 简历基本信息添加 结束------------------->
				</div>
			</div>
			<!-- 右侧公共部分：简历完善度 -->
			<iframe src="applicant/resume_right.jsp" width="297" height="440"
				scrolling="no" frameborder="0"></iframe>
			<div style="clear: both"></div>
		</div>
	</div>
	<!-- 我的简历页面结束 -->
	
	<!-- 网站公共尾部 -->
	<iframe src="foot.html" width="100%" height="150" scrolling="no"
		frameborder="0"></iframe>
</body>
</html>