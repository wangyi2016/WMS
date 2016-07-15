package com.mjzk.dome.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Warehouse entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="WAREHOUSE")
public class Warehouse  {

	@Id
	@Column(name="Warehouse_No")
	private String warehouseNo;
	@Column(name="Warehouse_Name")
	private String warehouseName;
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
	public Warehouse() {
	}

	/** minimal constructor */
	public Warehouse(String warehouseNo, String warehouseName) {
		this.warehouseNo = warehouseNo;
		this.warehouseName = warehouseName;
	}

	/** full constructor */
	public Warehouse(String warehouseNo, String warehouseName, String remark,
			String createUserId, String createDate, String updateUserId,
			String updateDate) {
		this.warehouseNo = warehouseNo;
		this.warehouseName = warehouseName;
		this.remark = remark;
		this.createUserId = createUserId;
		this.createDate = createDate;
		this.updateUserId = updateUserId;
		this.updateDate = updateDate;
	}

	// Property accessors

	public String getWarehouseNo() {
		return this.warehouseNo;
	}

	public void setWarehouseNo(String warehouseNo) {
		this.warehouseNo = warehouseNo;
	}

	public String getWarehouseName() {
		return this.warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
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