package com.workit.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * EndsetBean entity. @author MyEclipse Persistence Tools
 */

public class EndsetBean implements java.io.Serializable {

	// Fields

	private Integer endsetid;
	private String endsetname;
	private String endsetmanager;
	private String memo;
	private Set orderBeans = new HashSet(0);

	// Constructors

	/** default constructor */
	public EndsetBean() {
	}

	/** full constructor */
	public EndsetBean(String endsetname, String endsetmanager, String memo,
			Set orderBeans) {
		this.endsetname = endsetname;
		this.endsetmanager = endsetmanager;
		this.memo = memo;
		this.orderBeans = orderBeans;
	}

	// Property accessors

	public Integer getEndsetid() {
		return this.endsetid;
	}

	public void setEndsetid(Integer endsetid) {
		this.endsetid = endsetid;
	}

	public String getEndsetname() {
		return this.endsetname;
	}

	public void setEndsetname(String endsetname) {
		this.endsetname = endsetname;
	}

	public String getEndsetmanager() {
		return this.endsetmanager;
	}

	public void setEndsetmanager(String endsetmanager) {
		this.endsetmanager = endsetmanager;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Set getOrderBeans() {
		return this.orderBeans;
	}

	public void setOrderBeans(Set orderBeans) {
		this.orderBeans = orderBeans;
	}

}