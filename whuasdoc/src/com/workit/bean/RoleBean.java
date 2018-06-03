package com.workit.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * RoleBean entity. @author MyEclipse Persistence Tools
 */

public class RoleBean implements java.io.Serializable {

	// Fields

	private Integer roleid;
	private String rolename;
	private String memo;
	private Set powerBeans = new HashSet(0);
	private Set userBeans = new HashSet(0);

	// Constructors

	/** default constructor */
	public RoleBean() {
	}

	/** full constructor */
	public RoleBean(String rolename, String memo, Set powerBeans, Set userBeans) {
		this.rolename = rolename;
		this.memo = memo;
		this.powerBeans = powerBeans;
		this.userBeans = userBeans;
	}

	// Property accessors

	public Integer getRoleid() {
		return this.roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public String getRolename() {
		return this.rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Set getPowerBeans() {
		return this.powerBeans;
	}

	public void setPowerBeans(Set powerBeans) {
		this.powerBeans = powerBeans;
	}

	public Set getUserBeans() {
		return this.userBeans;
	}

	public void setUserBeans(Set userBeans) {
		this.userBeans = userBeans;
	}

}