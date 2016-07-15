package com.mjzk.dome.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Task entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="TASK")
public class Task  {

	@Id
	@Column(name="Task_Id")
	private String taskId;
	@Column(name="Mtl_No")
	private String mtlNo;
	@Column(name="Warehouse_No")
	private String warehouseNo;
	@Column(name="Shelf_No")
	private String shelfNo;
	@Column(name="Location_No")
	private String locationNo;
	@Column(name="Qty")
	private Integer qty;
	@Column(name="Action")
	private Integer action;
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
	public Task() {
	}

	/** minimal constructor */
	public Task(String taskId) {
		this.taskId = taskId;
	}

	/** full constructor */
	public Task(String taskId, String mtlNo, String warehouseNo,
			String locationNo, Integer qty, Integer action, Integer state,
			String remark, String createUserId, String createDate,
			String updateUserId, String updateDate) {
		this.taskId = taskId;
		this.mtlNo = mtlNo;
		this.warehouseNo = warehouseNo;
		this.locationNo = locationNo;
		this.qty = qty;
		this.action = action;
		this.state = state;
		this.remark = remark;
		this.createUserId = createUserId;
		this.createDate = createDate;
		this.updateUserId = updateUserId;
		this.updateDate = updateDate;
	}

	// Property accessors

	public String getTaskId() {
		return this.taskId;
	}

	public String getShelfNo() {
		return shelfNo;
	}

	public void setShelfNo(String shelfNo) {
		this.shelfNo = shelfNo;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getMtlNo() {
		return this.mtlNo;
	}

	public void setMtlNo(String mtlNo) {
		this.mtlNo = mtlNo;
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