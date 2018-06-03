<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.workit.bean.PowerBean"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
	<HEAD>
		<META http-equiv=Content-Type content="text/html; charset=gb2312">
		<LINK href="css/admin.css" type="text/css" rel="stylesheet">
		<SCRIPT language=javascript>
	function expand(el)
	{
		childObj = document.getElementById("child" + el);

		if (childObj.style.display == 'none')
		{
			childObj.style.display = 'block';
		}
		else
		{
			childObj.style.display = 'none';
		}
		return;
	}
</SCRIPT>
	</HEAD>
	<BODY>
		<TABLE height="100%" cellSpacing=0 cellPadding=0 width=170
			background=images/menu_bg.jpg border=0>
			<TR>
				<TD vAlign=top align=middle>
					<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>

						<TR>
							<TD height=10></TD>
						</TR>
					</TABLE>
					<%
						List<PowerBean> listpower = new ArrayList<PowerBean>();
						if(session.getAttribute("listpower") != null)
							listpower = (List<PowerBean>)session.getAttribute("listpower");
						for (PowerBean fpower:listpower){
							if (fpower.getLevels() == 1){
						
					 %>
					<TABLE cellSpacing=0 cellPadding=0 width=150 border=0>
						<TR height=22>
							<TD style="PADDING-LEFT: 30px" background=images/menu_bt.jpg>
								<A class=menuParent onclick=expand(<%=fpower.getPowerid()%>) href="javascript:void(0);"><%=fpower.getPowername() %></A>
							</TD>
						</TR>
						<TR height=4>
							<TD></TD>
						</TR>
					</TABLE>
					
					<TABLE id=child<%=fpower.getPowerid() %> style="DISPLAY: none" cellSpacing=0 cellPadding=0
						width=150 border=0>
						
							<%
								for (PowerBean spower:listpower){
									if (fpower.getPowerid().equals(spower.getPpowerid())){		
							 %>
						<TR height=20>
							<TD align="center" width=30>
								<IMG height=9 src="images/menu_icon.gif" width=9>
							</TD>
							<TD>
								<A class=menuChild href="<%=spower.getUrl()
								 %>" target=main><%=spower.getPowername() %></A>
							</TD>
						</TR>
							
						<%
								}
							}
							 %>
					</TABLE>
					<%
						}
					}
					 %>

				</TD>
				<TD width=1 bgColor=#d1e6f7></TD>
			</TR>
		</TABLE>
	</BODY>
</HTML>
