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
    	部门修改管理
    	<hr color="orange" size="5"/>
    	<form action="DeptAction_updatedept" method="post">
    		<table>
    			<caption>部门修改</caption>
    			<tr>	
    				<td>部门ID</td>
    				<td><input type="text" name="dept.deptid" readonly="readonly" value= "${dept.deptid}"/></td>
    			</tr>
    			<tr>	
    				<td>部门名称</td>
    				<td><input type="text" name="dept.deptname" value= "${dept.deptname}"/></td>
    			</tr>
    			<tr>
    				<td>部门负责人</td>
    				<td><input type="text" name="dept.chargeman" value= "${dept.chargeman}"/></td>
    			</tr>
    			<tr>
    				<td>备注</td>
    				<td><input type="text" name="dept.remark" value="${dept.remark}"/></td>
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
