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
    	角色修改管理
    	<hr color="orange" size="5"/>
    	<form action="RoleAction_updaterole" method="post">
    		<table>
    			<caption>角色修改</caption>
    			<tr>	
    				<td>角色ID</td>
    				<td><input type="text" name="roleBean.roleid" readonly="readonly" value= "${roleBean.roleid}"/></td>
    			</tr>
    			<tr>	
    				<td>角色名称</td>
    				<td><input type="text" name="roleBean.rolename" value= "${roleBean.rolename}"/></td>
    			</tr>
    			<tr>
    				<td>角色权限</td>
    				<td>
    					<s:iterator value="listpower" var="lpower">
    					<input type="checkbox" name="roleBean.powerBeans.powerid" />
			    						<option value="${roleBean.powerBeans}">${lpower.powername }</option>
			    			</s:iterator>
    				</td>
    			</tr>
    			<tr>
    				<td>备注</td>
    				<td><input type="text" name="roleBean.memo" value="${roleBean.memo}"/></td>
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
