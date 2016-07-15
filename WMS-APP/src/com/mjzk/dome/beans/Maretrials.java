package com.mjzk.dome.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Maretrials entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="MARETRIALS")
public class Maretrials  {

	@Id
	@Column(name="Mtl_No")
	private String mtlNo;
	@Column(name="Mtl_Name")
	private String mtlName;
	@Column(name="Mtl_Type")
	private String mtlType;
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
	public Maretrials() {
	}

	/** minimal constructor */
	public Maretrials(String mtlNo, String mtlName, String mtlType) {
		this.mtlNo = mtlNo;
		this.mtlName = mtlName;
		this.mtlType = mtlType;
	}

	/** full constructor */
	public Maretrials(String mtlNo, String mtlName, String mtlType,
			String remark, String createUserId, String createDate,
			String updateUserId, String updateDate) {
		this.mtlNo = mtlNo;
		this.mtlName = mtlName;
		this.mtlType = mtlType;
		this.remark = remark;
		this.createUserId = createUserId;
		this.createDate = createDate;
		this.updateUserId = updateUserId;
		this.updateDate = updateDate;
	}

	// Property accessors

	public String getMtlNo() {
		return this.mtlNo;
	}

	public void setMtlNo(String mtlNo) {
		this.mtlNo = mtlNo;
	}

	public String getMtlName() {
		return this.mtlName;
	}

	public void setMtlName(String mtlName) {
		this.mtlName = mtlName;
	}

	public String getMtlType() {
		return this.mtlType;
	}

	public void setMtlType(String mtlType) {
		this.mtlType = mtlType;
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