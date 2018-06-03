package com.workit.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * CartypeBean entity. @author MyEclipse Persistence Tools
 */

public class CartypeBean implements java.io.Serializable {

	// Fields

	private Short typeid;
	private String typename;
	private String cartype;
	private String remark;
	private Set carBeans = new HashSet(0);

	// Constructors

	/** default constructor */
	public CartypeBean() {
	}

	/** minimal constructor */
	public CartypeBean(String cartype) {
		this.cartype = cartype;
	}

	/** full constructor */
	public CartypeBean(String typename, String cartype, String remark,
			Set carBeans) {
		this.typename = typename;
		this.cartype = cartype;
		this.remark = remark;
		this.carBeans = carBeans;
	}

	// Property accessors

	public Short getTypeid() {
		return this.typeid;
	}

	public void setTypeid(Short typeid) {
		this.typeid = typeid;
	}

	public String getTypename() {
		return this.typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public String getCartype() {
		return this.cartype;
	}

	public void setCartype(String cartype) {
		this.cartype = cartype;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set getCarBeans() {
		return this.carBeans;
	}

	public void setCarBeans(Set carBeans) {
		this.carBeans = carBeans;
	}

}