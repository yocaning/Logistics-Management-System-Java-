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
    	地点添加管理
    	<hr color="orange" size="5"/>
    	<form action="EndsetAction_saveendset" method="post">
    		<table>
    			<caption>添加地点</caption>
    			<tr>
    				<td>地点名称</td>
    				<td><input type="text" name="endset.endsetname"/></td>
    			</tr>
    			<tr>
    				<td>地区负责人</td>
    				<td><input type="text" name="endset.endsetmanager"/></td>
    			</tr>
    			
    			<tr>
    				<td>备注</td>
    				<td><input type="text" name="endset.memo"/></td>
    			</tr>
    			
    			<tr>
    				<td><input type="reset" value="取消"/></td>
    				<td><input type="submit" value="添加"/></td>
    			</tr>
    		</table>
    	</form>
    	<hr color="orange" size="5"/>
    	yocan物流管理系统 version1.0
    </center>
  </body>
</html>
