package com.workit.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * PowerBean entity. @author MyEclipse Persistence Tools
 */

public class PowerBean implements java.io.Serializable {

	// Fields

	private Integer powerid;
	private String powername;
	private Byte levels;
	private Integer ppowerid;
	private String url;
	private String memo;
	private Set roleBeans = new HashSet(0);

	// Constructors

	/** default constructor */
	public PowerBean() {
	}

	/** full constructor */
	public PowerBean(String powername, Byte levels, Integer ppowerid,
			String url, String memo, Set roleBeans) {
		this.powername = powername;
		this.levels = levels;
		this.ppowerid = ppowerid;
		this.url = url;
		this.memo = memo;
		this.roleBeans = roleBeans;
	}

	// Property accessors

	public Integer getPowerid() {
		return this.powerid;
	}

	public void setPowerid(Integer powerid) {
		this.powerid = powerid;
	}

	public String getPowername() {
		return this.powername;
	}

	public void setPowername(String powername) {
		this.powername = powername;
	}

	public Byte getLevels() {
		return this.levels;
	}

	public void setLevels(Byte levels) {
		this.levels = levels;
	}

	public Integer getPpowerid() {
		return this.ppowerid;
	}

	public void setPpowerid(Integer ppowerid) {
		this.ppowerid = ppowerid;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Set getRoleBeans() {
		return this.roleBeans;
	}

	public void setRoleBeans(Set roleBeans) {
		this.roleBeans = roleBeans;
	}

}