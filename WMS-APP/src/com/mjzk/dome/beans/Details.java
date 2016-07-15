package com.mjzk.dome.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Details entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="DETAILS")
public class Details {

	@Id
	@Column(name="Details_Id")
	private String detailsId;
	@Column(name="Mtl_No")
	private String mtlNo;
	@Column(name="Mtl_Name")
	private String mtlName;
	@Column(name="Task_Id")
	private String taskId;
	@Column(name="Warehouse_No")
	private String warehouseNo;
	@Column(name="Shelf_No")
	private String shelfNo;
	@Column(name="Location_No")
	private String locationNo;
	@Column(name="Tray_No")
	private String trayNo;
	@Column(name="UserId")
	private String userId;
	@Column(name="Qty")
	private Integer qty;
	@Column(name="Action")
	private Integer action;
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
	public Details() {
	}

	/** minimal constructor */
	public Details(String detailsId) {
		this.detailsId = detailsId;
	}

	/** full constructor */
	public Details(String detailsId, String mtlNo, String mtlName,
			String taskId, String warehouseNo, String locationNo,
			String trayNo, String userId, Integer qty, Integer action,
			String remark, String createUserId, String createDate,
			String updateUserId, String updateDate) {
		this.detailsId = detailsId;
		this.mtlNo = mtlNo;
		this.mtlName = mtlName;
		this.taskId = taskId;
		this.warehouseNo = warehouseNo;
		this.locationNo = locationNo;
		this.trayNo = trayNo;
		this.userId = userId;
		this.qty = qty;
		this.action = action;
		this.remark = remark;
		this.createUserId = createUserId;
		this.createDate = createDate;
		this.updateUserId = updateUserId;
		this.updateDate = updateDate;
	}

	// Property accessors

	public String getDetailsId() {
		return this.detailsId;
	}

	public void setDetailsId(String detailsId) {
		this.detailsId = detailsId;
	}

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

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getWarehouseNo() {
		return this.warehouseNo;
	}

	public void setWarehouseNo(String warehouseNo) {
		this.warehouseNo = warehouseNo;
	}

	public String getLocationNo() {
		return this.locationNo;
	}

	public void setLocationNo(String locationNo) {
		this.locationNo = locationNo;
	}

	public String getTrayNo() {
		return this.trayNo;
	}

	public void setTrayNo(String trayNo) {
		this.trayNo = trayNo;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getQty() {
		return this.qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Integer getAction() {
		return this.action;
	}

	public void setAction(Integer action) {
		this.action = action;
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

	public String getShelfNo() {
		return shelfNo;
	}

	public void setShelfNo(String shelfNo) {
		this.shelfNo = shelfNo;
	}

}