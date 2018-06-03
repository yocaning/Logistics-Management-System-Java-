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
    	订单修改管理
    	<hr color="orange" size="5"/>
    	<form action="OrderAction_updateorder" method="post">
    		<table>
    			<caption>订单修改</caption>
    			<tr>	
    				<td>订单ID</td>
    				<td><input type="text" name="order.orderid" readonly="readonly" value= "${order.orderid}"/></td>
    			</tr>
    			<tr>
    				<td>订单号</td>
    				<td><input type="text" name="order.ordernum" value= "${order.ordernum}"/></td>
    			</tr>
    			<tr>
    				<td>订单负责人</td>
    				<td><input type="text" name="order.orderman" value= "${order.orderman}"/></td>
    			</tr>
    			<tr>
    				<td>订单起点</td>
    				<td>
    					<SELECT name="order.outsetBean.outsetid" ">
    						<option selected="${order.outsetBean.outsetid}">${order.outsetBean.outsetname}</option>
	    					<s:iterator value="listoutset" var="loutset">
	    						<option value="${loutset.outsetid }">${loutset.outsetname }</option>
	    					</s:iterator>				
	    				</SELECT>
	    			</td>
    			</tr>
    			<tr>
    				<td>订单终点</td>
    				<td>
    					<SELECT name="order.endsetBean.endsetid" ">
    						<option selected="${order.endsetBean.endsetid}">${order.endsetBean.endsetname}</option>
	    					<s:iterator value="listendset" var="lendset">
	    						<option value="${lendset.endsetid }">${lendset.endsetname }</option>
	    					</s:iterator>				
	    				</SELECT>
	    			</td>
    			</tr>
    			<tr>
    				<td>车辆车牌号</td>
    				<td>
    					<SELECT name="order.carBean.carid" >
    						<option selected="${order.carBean.carid}">${order.carBean.carnum}</option>
	    					<s:iterator value="listcar" var="lcar">
	    						<option value="${lcar.carid }">${lcar.carnum }</option>
	    					</s:iterator>
	    				</SELECT>
	    			</td>
    			</tr>
    			
    			<tr>
    				<td>备注</td>
    				<td><input type="text" name="order.memo" value="${order.memo}"/></td>
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
