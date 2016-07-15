package com.mjzk.dome.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Groups entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="GROUPS")
public class Groups {

	// Fields
	@Id
	@Column(name="Name")
	private String name;
	@Column(name="Grade")
	private Integer grade;
	@Column(name="Remark")
	private String remark;
	@Column(name="Create_UserId")
	private String createUserId;
	@Column(name="Create_Date")
	private String createDate;
	@Column(name="Update_UserId")
	private String updateUserId;
	@Column(name="Update_Date")
	private String updateDate;

	// Constructors

	/** default constructor */
	public Groups() {
	}

	/** minimal constructor */
	public Groups(String name, Integer grade) {
		this.name = name;
		this.grade = grade;
	}

	/** full constructor */
	public Groups(String name, Integer grade, String remark,
			String createUserId, String createDate, String updateUserId,
			String updateDate) {
		this.name = name;
		this.grade = grade;
		this.remark = remark;
		this.createUserId = createUserId;
		this.createDate = createDate;
		this.updateUserId = updateUserId;
		this.updateDate = updateDate;
	}

	// Property accessors

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getGrade() {
		return this.grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCreateUserId() {
		return this.createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public String getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getUpdateUserId() {
		return this.updateUserId;
	}

	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}

	public String getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

}