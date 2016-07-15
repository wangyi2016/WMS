package com.mjzk.dome.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tray entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="TRAY")
public class Tray  {

	@Id
	@Column(name="Tray_No")
	private String trayNo;
	@Column(name="Tray_Type")
	private String trayType;
	@Column(name="Warehouse_No")
	private String warehouseNo;
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
	public Tray() {
	}

	/** minimal constructor */
	public Tray(String trayNo) {
		this.trayNo = trayNo;
	}

	/** full constructor */
	public Tray(String trayNo, String trayType, String warehouseNo,
			String remark, String createUserId, String createDate,
			String updateUserId, String updateDate) {
		this.trayNo = trayNo;
		this.trayType = trayType;
		this.warehouseNo = warehouseNo;
		this.remark = remark;
		this.createUserId = createUserId;
		this.createDate = createDate;
		this.updateUserId = updateUserId;
		this.updateDate = updateDate;
	}

	// Property accessors

	public String getTrayNo() {
		return this.trayNo;
	}

	public void setTrayNo(String trayNo) {
		this.trayNo = trayNo;
	}

	public String getTrayType() {
		return this.trayType;
	}

	public void setTrayType(String trayType) {
		this.trayType = trayType;
	}

	public String getWarehouseNo() {
		return this.warehouseNo;
	}

	public void setWarehouseNo(String warehouseNo) {
		this.warehouseNo = warehouseNo;
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