package com.workit.action;


import java.util.List;
import java.util.Set;

import com.opensymphony.xwork2.ActionContext;
import com.workit.bean.DeptBean;
import com.workit.bean.PowerBean;
import com.workit.bean.RoleBean;
import com.workit.bean.UserBean;
import com.workit.dao.UserDao;

public class UserAction {
	private UserBean user;
	private short userid;
	public short getUserid() {
		return userid;
	}

	public void setUserid(short userid) {
		this.userid = userid;
	}

	public UserBean getUser() {
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
	}
	public String login()
	{
		UserDao userdao = new UserDao();
		UserBean curruser = userdao.isExistUser(user);
		if(curruser != null)
		{	
			ActionContext.getContext().getSession().put("curruser", curruser);
			return "loginsucc";
		}else
			return "failer";
	}
	
	private List<UserBean> listuser;
	private DeptBean deptbean;
	private RoleBean rolebean;

	public DeptBean getDeptbean() {
		return deptbean;
	}

	public void setDeptbean(DeptBean deptbean) {
		this.deptbean = deptbean;
	}

	public RoleBean getRolebean() {
		return rolebean;
	}

	public void setRolebean(RoleBean rolebean) {
		this.rolebean = rolebean;
	}

	public List<UserBean> getListuser() {
		return listuser;
	}

	public void setListuser(List<UserBean> listuser) {
		this.listuser = listuser;
	}

	public String findalluser() {
		UserDao userdao =new UserDao();
		listuser = userdao.findalluser();
		ActionContext.getContext().getSession().put("listuser", listuser);
		return "findalluser";
	}
	public String deleteUser(){
		UserDao userdao = new UserDao();
		userdao.deleteUser(userid);
		return "deletesucc";
	}
	public String update(){
		UserDao userdao = new UserDao();
		user = userdao.findCurruser(userid);
		ActionContext.getContext().getSession().put("user", user);
		return "update";
	}
	public String updateUser(){
		UserDao userdao = new UserDao();
		userdao.updateUser(user);
		return "updateuser";
	}
	public String saveUser(){
		UserDao userdao = new UserDao();
		userdao.saveUser(user);
		return "savesucc";
	}
	
}
