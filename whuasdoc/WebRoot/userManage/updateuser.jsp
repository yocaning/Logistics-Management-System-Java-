<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/emp.css">
  </head>
  
  <body>
    <center>
    	尊敬的管理员您好：<br/>
    	员工管理
    	<hr color="orange" size="5"/>
    	<form action="UserAction_updateUser" method="post">
    		<table>
    			<caption>员工修改</caption>
    			<tr>	
    				<td>员工ID</td>
    				<td><input type="text" name="user.userid" readonly="readonly" value= "${user.userid}"/></td>
    			</tr>
    			<tr>	
    				<td>员工帐号</td>
    				<td><input type="text" name="user.username" value= "${user.username}"/></td>
    			</tr>
    			<tr>
    				<td>员工姓名</td>
    				<td><input type="text" name="user.loginname" value= "${user.loginname}"/></td>
    			</tr>
    			<tr>
    				<td>帐号密码</td>
    				<td><input type="text" name="user.password" value="${user.password}"/></td>
    			</tr>
    			<tr>
    				<td>账号状态</td>
    				<td>
    					<SELECT name="user.status">
	    						<option value="1">激活</option>
	    						<option value="2">离线</option>
	    				</SELECT>
	    			</td>
    			</tr>
    			
    			<tr>
    				<td>备注</td>
    				<td><input type="text" name="user.remark" value="${user.remark}"/></td>
    			</tr>
    			<tr>
    				<td>员工部门</td>
    				<td>
	    				<SELECT name="user.deptBean.deptid" ">
	    					<s:iterator value="listdept" var="ldept">
	    						<option value="${ldept.deptid }">${ldept.deptname }</option>
	    					</s:iterator>
	    				</SELECT>
					</td>
    			</tr>
    			<tr>
    				<td>员工角色</td>
    				<td>
	    				<SELECT name="user.roleBean.roleid" ">
	    					<s:iterator value="listrole" var="lrole">
	    						<option value="${lrole.roleid }">${lrole.rolename }</option>
	    					</s:iterator>
	    				</SELECT>
					</td>
    			</tr>
    			
    			<tr>
    				<td><input type="reset" value="取消"/></td>
    				<td><input type="submit" value="确定"/></td>
    			</tr>
    		</table>
    	</form>
    	<hr color="orange" size="5"/>
    	yocan物流管理系统 version1.0
    </center>
  </body>
</html>
