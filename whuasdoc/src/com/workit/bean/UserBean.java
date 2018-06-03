package com.workit.bean;

/**
 * UserBean entity. @author MyEclipse Persistence Tools
 */

public class UserBean implements java.io.Serializable {

	// Fields

	private Short userid;
	private DeptBean deptBean;
	private RoleBean roleBean;
	private String loginname;
	private String username;
	private String password;
	private Byte status;
	private String remark;
	// Constructors

	/** default constructor */
	public UserBean() {
	}

	/** minimal constructor */
	public UserBean(DeptBean deptBean, RoleBean roleBean, String loginname,
			String username, String password) {
		this.deptBean = deptBean;
		this.roleBean = roleBean;
		this.loginname = loginname;
		this.username = username;
		this.password = password;
	}

	/** full constructor */
	public UserBean(DeptBean deptBean, RoleBean roleBean, String loginname,
			String username, String password, Byte status, String remark) {
		this.deptBean = deptBean;
		this.roleBean = roleBean;
		this.loginname = loginname;
		this.username = username;
		this.password = password;
		this.status = status;
		this.remark = remark;
	}

	// Property accessors

	public Short getUserid() {
		return this.userid;
	}

	public void setUserid(Short userid) {
		this.userid = userid;
	}

	public DeptBean getDeptBean() {
		return this.deptBean;
	}

	public void setDeptBean(DeptBean deptBean) {
		this.deptBean = deptBean;
	}

	public RoleBean getRoleBean() {
		return this.roleBean;
	}

	public void setRoleBean(RoleBean roleBean) {
		this.roleBean = roleBean;
	}

	public String getLoginname() {
		return this.loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}