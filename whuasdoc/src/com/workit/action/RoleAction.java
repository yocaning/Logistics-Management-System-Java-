package com.workit.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.workit.bean.RoleBean;
import com.workit.dao.RoleDao;

public class RoleAction {
			private RoleBean roleBean;
			private Integer roleid;
			private List<RoleBean> listrole;
			
			public List<RoleBean> getListrole() {
				return listrole;
			}
			public void setListrole(List<RoleBean> listrole) {
				this.listrole = listrole;
			}
			public RoleBean getRoleBean() {
				return roleBean;
			}
			public void setRoleBean(RoleBean roleBean) {
				this.roleBean = roleBean;
			}
			public Integer getRoleid() {
				return roleid;
			}
			public void setRoleid(Integer roleid) {
				this.roleid = roleid;
			}
			
			public String findallrole() {
				RoleDao roledao =new RoleDao();
				listrole = roledao.findallrole();
				ActionContext.getContext().getSession().put("listrole", listrole);
				return "findallrole";
			}
			public String deleterole(){
				RoleDao roledao =new RoleDao();
				roledao.deleteRole(roleid);
				return "deletesucc";
			}
			public String update(){
				RoleDao roledao =new RoleDao();
				roleBean = roledao.findCurrurole(roleid);
				ActionContext.getContext().getSession().put("roleBean", roleBean);
				return "update";
			}
			public String updaterole(){
				RoleDao roledao =new RoleDao();
				roledao.updateRole(roleBean);
				return "updaterole";
			}
			public String saverole(){
				RoleDao roledao =new RoleDao();
				roledao.saveRole(roleBean);
				return "savesucc";
			}
}
