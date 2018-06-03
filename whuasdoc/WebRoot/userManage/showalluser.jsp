<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showalluser.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>

<TABLE cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
  <TR height=28>
    <TD background=images/title_bg1.jpg>当前位置:&gt;&gt;系统管理&gt;&gt;员工管理 </TD></TR>
  <TR>
    <TD bgColor=#b1ceef height=1></TD></TR>
  <TR height=20>
    <TD background=images/shadow_bg.jpg></TD></TR></TABLE>

<TABLE cellSpacing=0 cellPadding=0 width="95%" align=center border=0>
  <TR height=20>
    <TD></TD></TR>
  <TR height=22>
    <TD style="PADDING-LEFT: 20px; FONT-WEIGHT: bold; COLOR: #666666" 
    align=middle >员工列表
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="PreUserAction_getroledept">【后台添加员工】</a></TD></TR>
  <TR bgColor=#ecf4fc height=12>
    <TD></TD></TR>
  <TR height=20>
    <TD></TD></TR></TABLE>
<TABLE cellSpacing=0 cellPadding=2 width="95%" align=center border=1>
  	<TR align="center">
    	<TD>用户ID</TD>
    	<TD>用户账号</TD>
    	<TD>用户名</TD>
    	<TD>部门</TD>
    	<TD>角色</TD>
    	<TD>状态</TD>
    	<TD>备注</TD>
    	<TD>操作</TD>
	</TR>
	<s:iterator value="listuser" var="luser">
	<TR align="center">
    	<TD>${luser.userid}</TD>
    	<TD>${luser.loginname}</TD>
    	<TD>${luser.username}</TD>
    	<TD>${luser.deptBean.deptname} </TD>
    	<TD>${luser.roleBean.rolename}</TD>
    	<TD>${luser.status}</TD>
    	<TD>${luser.remark}</TD>
    	<td><a href="UserAction_update?userid=${luser.userid }">【修改】</a>&nbsp;|&nbsp;
    	<a href="UserAction_deleteUser?userid=${luser.userid }">【删除】</a></td>
	</TR>
	</s:iterator>  
  </TABLE>
  </body>
</html>
