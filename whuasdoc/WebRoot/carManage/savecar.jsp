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
    	车辆信息添加管理
    	<hr color="orange" size="5"/>
    	<form action="CarAction_savecar" method="post">
    		<table>
    			<caption>添加车辆</caption>
    			<tr>
    				<td>车牌号码</td>
    				<td><input type="text" name="car.carnum"/></td>
    			</tr>
    			<tr>
    				<td>车辆种类</td>
    				<td>
    					<SELECT name="car.cartypeBean.typeid">
	    						<option value="1">大型卡车</option>
	    						<option value="2">中型卡车</option>
	    						<option value="3">小型卡车</option>
	    						<option value="4">面包车</option>
	    						<option value="5">运输飞机</option>
	    				</SELECT>
	    			</td>
    				
    			</tr>
    			<tr>
    				<td>保质期</td>
    				<td><input type="text" name="car.baozhitime"/></td>
    			</tr>
    			
    			<tr>
    				<td>车辆状态</td>
    				<td><input type="text" name="car.status"/></td>
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
