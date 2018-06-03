package com.workit.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * OutsetBean entity. @author MyEclipse Persistence Tools
 */

public class OutsetBean implements java.io.Serializable {

	// Fields

	private Integer outsetid;
	private String outsetname;
	private String outsetmanager;
	private String memo;
	private Set orderBeans = new HashSet(0);

	// Constructors

	/** default constructor */
	public OutsetBean() {
	}

	/** full constructor */
	public OutsetBean(String outsetname, String outsetmanager, String memo,
			Set orderBeans) {
		this.outsetname = outsetname;
		this.outsetmanager = outsetmanager;
		this.memo = memo;
		this.orderBeans = orderBeans;
	}

	// Property accessors

	public Integer getOutsetid() {
		return this.outsetid;
	}

	public void setOutsetid(Integer outsetid) {
		this.outsetid = outsetid;
	}

	public String getOutsetname() {
		return this.outsetname;
	}

	public void setOutsetname(String outsetname) {
		this.outsetname = outsetname;
	}

	public String getOutsetmanager() {
		return this.outsetmanager;
	}

	public void setOutsetmanager(String outsetmanager) {
		this.outsetmanager = outsetmanager;
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