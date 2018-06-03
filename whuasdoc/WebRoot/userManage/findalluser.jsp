<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'findalluser.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="easyui/1.3.4/themes/default/easyui.css" />
	<link rel="stylesheet" type="text/css" href="css/icon.css" />
	<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
	<script type="text/javascript" src="easyui/1.3.4/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="easyui/1.3.4/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="js/check1.js"></script>
	</head>
  
  <body>
 		<script type="text/javascript">
 			$("#userwin").window({
				closed:true,
			});	
 		</script>
		
  		 <div class="easyui-panel" id="sf">
  			<form id="seachuserForm" action=""> 
  				根据用户姓名&nbsp;&nbsp;&nbsp;<input type="text" name="name" value="" />
  					<a id="bt_userseach">查询</a>
  			</form>
  		</div>
    	<table id="usertt">
 		
    	</table>
    	<!--模糊查询  -->
    	
    	 <div id="userwin">
			<center>
		    <form id="myuserForm" action="UserAction_saveuser" method="post"  enctype="multipart/form-data">	
		    <input type="hidden" name="userid" value="0"/>
		    <table>
		    		<tr>
		    			<td>登录账号</td>
		    			<td>
			    			<input type="text" name="username" id="lname"/>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td>密码</td>
		    			<td>
			    			<input type="text" name="password" id="pw"/>
		    			</td>
		    		</tr>		
		    		<tr>
		    			<td>用户</td>
		    			<td>
			    			<input type="text" name="loginname" id="uname"/>
		    			</td>
		    		</tr>
		    	<s:if test="#session.CurrUser.deptBean.branchBean.branchid == 0">
		    			<tr>
		    				<td>学校</td>
		    				<td>
			    				<input type="text" id="bid" name="branchid"/>
		    				</td>
		    			</tr>
		    		</s:if>
		    		<tr>
		    			<td>部门</td>
		    			<td>
			    			<input type="text" id="did" name="deptid"/>
		    			</td>
		    		</tr>
		    		<tr>
		    			<td>角色</td>
		    			<td>
			    			<input type="text" id="rid" name="roleid"/>
		    			</td>
		    		</tr>
		    		<tr align="center">
		    			<td colspan="2">
							<a id="btuser_ok" class="easyui-linkbutton">确定</a>
							<a id="btuser_close" class="easyui-linkbutton">关闭</a>
						</td>
		    		</tr>
		    	</table>
		    </form>
		    </center>
    </div>
    <script type="text/javascript" src="js/check.js">
    	
    </script>
  </body>
</html>
