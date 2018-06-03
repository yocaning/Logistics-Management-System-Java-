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
    	地区修改管理
    	<hr color="orange" size="5"/>
    	<form action="OutsetAction_updateoutset" method="post">
    		<table>
    			<caption>地区修改</caption>
    			<tr>	
    				<td>地区ID</td>
    				<td><input type="text" name="outset.outsetid" readonly="readonly" value= "${outset.outsetid}"/></td>
    			</tr>
    			<tr>	
    				<td>地区名称</td>
    				<td><input type="text" name="outset.outsetname" value= "${outset.outsetname}"/></td>
    			</tr>
    			<tr>
    				<td>地区负责人</td>
    				<td><input type="text" name="outset.outsetmanager" value= "${outset.outsetmanager}"/></td>
    			</tr>
    			<tr>
    				<td>备注</td>
    				<td><input type="text" name="outset.memo" value="${outset.memo}"/></td>
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
