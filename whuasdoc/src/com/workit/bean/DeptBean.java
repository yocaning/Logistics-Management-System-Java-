package com.workit.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * DeptBean entity. @author MyEclipse Persistence Tools
 */

public class DeptBean implements java.io.Serializable {

	// Fields

	private Byte deptid;
	private String deptname;
	private String chargeman;
	private String remark;
	private Set userBeans = new HashSet(0);

	// Constructors

	/** default constructor */
	public DeptBean() {
	}

	/** minimal constructor */
	public DeptBean(String deptname) {
		this.deptname = deptname;
	}

	/** full constructor */
	public DeptBean(String deptname, String chargeman, String remark,
			Set userBeans) {
		this.deptname = deptname;
		this.chargeman = chargeman;
		this.remark = remark;
		this.userBeans = userBeans;
	}


	public Byte getDeptid() {
		return this.deptid;
	}

	public void setDeptid(Byte deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return this.deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getChargeman() {
		return this.chargeman;
	}

	public void setChargeman(String chargeman) {
		this.chargeman = chargeman;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getUserBeans() {
		return this.userBeans;
	}

	public void setUserBeans(Set userBeans) {
		this.userBeans = userBeans;
	}

}