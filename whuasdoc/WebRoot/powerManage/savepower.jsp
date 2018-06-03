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
    	权限菜单添加管理
    	<hr color="orange" size="5"/>
    	<form action="PowerAction_savepower" method="post">
    		<table>
    			<caption>添加菜单</caption>
    			<tr>
    				<td>菜单名称</td>
    				<td><input type="text" name="power.powername"/></td>
    			</tr>
    			<tr>
    				<td>菜单等级</td>
    				<td><input type="text" name="power.levels"/></td>
    			</tr>
    			<tr>
    				<td>上级菜单</td>
    				<td>
    					<SELECT name="power.ppowerid">
	    						<option value="1">系统管理</option>
	    						<option value="2">订单管理</option>
	    						<option value="3">客户管理</option>
	    						<option value="75">运输方式管理</option>
	    						<option value="76">配送点管理</option>
	    				</SELECT>
	    			</td>
    			</tr>
    			
    			<tr>
    				<td>url地址</td>
    				<td><input type="text" name="power.url"/></td>
    			</tr>
    			<tr>
    				<td>备注</td>   			
	    			<td><input type="text" name="power.memo"/></td>				
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
