package com.mjzk.dome.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Inventory entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="INVENTORY")
public class Inventory  {

	@Id
	@Column(name="Inventory_Id")
	private String inventoryId;
	@Column(name="Mtl_No")
	private String mtlNo;
	@Column(name="Qty")
	private Integer qty;
	@Column(name="State")
	private Integer state;
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
	public Inventory() {
	}

	/** minimal constructor */
	public Inventory(String inventoryId) {
		this.inventoryId = inventoryId;
	}

	/** full constructor */
	public Inventory(String inventoryId, String mtlNo, Integer qty,
			Integer state, String remark, String createUserId,
			String createDate, String updateUserId, String updateDate) {
		this.inventoryId = inventoryId;
		this.mtlNo = mtlNo;
		this.qty = qty;
		this.state = state;
		this.remark = remark;
		this.createUserId = createUserId;
		this.createDate = createDate;
		this.updateUserId = updateUserId;
		this.updateDate = updateDate;
	}

	// Property accessors

	public String getInventoryId() {
		return this.inventoryId;
	}

	public void setInventoryId(String inventoryId) {
		this.inventoryId = inventoryId;
	}

	public String getMtlNo() {
		return this.mtlNo;
	}

	public void setMtlNo(String mtlNo) {
		this.mtlNo = mtlNo;
	}

	public Integer getQty() {
		return this.qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
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