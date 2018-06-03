package com.workit.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * CarBean entity. @author MyEclipse Persistence Tools
 */

public class CarBean implements java.io.Serializable {

	// Fields

	private Short carid;
	private CartypeBean cartypeBean;
	private String carnum;
	private Short baozhitime;
	private Byte status;
	private Set orderBeans = new HashSet(0);

	// Constructors

	/** default constructor */
	public CarBean() {
	}

	/** minimal constructor */
	public CarBean(CartypeBean cartypeBean) {
		this.cartypeBean = cartypeBean;
	}

	/** full constructor */
	public CarBean(CartypeBean cartypeBean, String carnum, Short baozhitime,
			Byte status, Set orderBeans) {
		this.cartypeBean = cartypeBean;
		this.carnum = carnum;
		this.baozhitime = baozhitime;
		this.status = status;
		this.orderBeans = orderBeans;
	}

	// Property accessors

	public Short getCarid() {
		return this.carid;
	}

	public void setCarid(Short carid) {
		this.carid = carid;
	}

	public CartypeBean getCartypeBean() {
		return this.cartypeBean;
	}

	public void setCartypeBean(CartypeBean cartypeBean) {
		this.cartypeBean = cartypeBean;
	}

	public String getCarnum() {
		return this.carnum;
	}

	public void setCarnum(String carnum) {
		this.carnum = carnum;
	}

	public Short getBaozhitime() {
		return this.baozhitime;
	}

	public void setBaozhitime(Short baozhitime) {
		this.baozhitime = baozhitime;
	}

	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Set getOrderBeans() {
		return this.orderBeans;
	}

	public void setOrderBeans(Set orderBeans) {
		this.orderBeans = orderBeans;
	}

}