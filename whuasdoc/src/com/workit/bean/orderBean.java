package com.workit.bean;

import java.math.BigDecimal;

/**
 * orderBean entity. @author MyEclipse Persistence Tools
 */

public class orderBean implements java.io.Serializable {

	// Fields

	private Integer orderid;
	private CarBean carBean;
	private EndsetBean endsetBean;
	private OutsetBean outsetBean;
	private BigDecimal ordernum;
	private String orderman;
	private String memo;

	// Constructors

	/** default constructor */
	public orderBean() {
	}

	/** minimal constructor */
	public orderBean(CarBean carBean, EndsetBean endsetBean,
			OutsetBean outsetBean, BigDecimal ordernum) {
		this.carBean = carBean;
		this.endsetBean = endsetBean;
		this.outsetBean = outsetBean;
		this.ordernum = ordernum;
	}

	/** full constructor */
	public orderBean(CarBean carBean, EndsetBean endsetBean,
			OutsetBean outsetBean, BigDecimal ordernum, String orderman,
			String memo) {
		this.carBean = carBean;
		this.endsetBean = endsetBean;
		this.outsetBean = outsetBean;
		this.ordernum = ordernum;
		this.orderman = orderman;
		this.memo = memo;
	}

	// Property accessors

	public Integer getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public CarBean getCarBean() {
		return this.carBean;
	}

	public void setCarBean(CarBean carBean) {
		this.carBean = carBean;
	}

	public EndsetBean getEndsetBean() {
		return this.endsetBean;
	}

	public void setEndsetBean(EndsetBean endsetBean) {
		this.endsetBean = endsetBean;
	}

	public OutsetBean getOutsetBean() {
		return this.outsetBean;
	}

	public void setOutsetBean(OutsetBean outsetBean) {
		this.outsetBean = outsetBean;
	}

	public BigDecimal getOrdernum() {
		return this.ordernum;
	}

	public void setOrdernum(BigDecimal ordernum) {
		this.ordernum = ordernum;
	}

	public String getOrderman() {
		return this.orderman;
	}

	public void setOrderman(String orderman) {
		this.orderman = orderman;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}