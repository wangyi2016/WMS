package com.mjzk.dome.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Location entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="LOCATION")
public class Location  {

	@Id
	@Column(name="Location_No")
	private String locationNo;
	@Column(name="Warehouse_No")
	private String warehouseNo;
	@Column(name="Shelf_No")
	private String shelfNo;
	@Column(name="Sign")
	private Integer sign;
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
	public Location() {
	}

	/** minimal constructor */
	public Location(String locationNo, String warehouseNo) {
		this.locationNo = locationNo;
		this.warehouseNo = warehouseNo;
	}

	/** full constructor */
	public Location(String locationNo, String warehouseNo, String remark,
			String createUserId, String createDate, String updateUserId,
			String updateDate) {
		this.locationNo = locationNo;
		this.warehouseNo = warehouseNo;
		this.remark = remark;
		this.createUserId = createUserId;
		this.createDate = createDate;
		this.updateUserId = updateUserId;
		this.updateDate = updateDate;
	}

	// Property accessors

	public String getLocationNo() {
		return this.locationNo;
	}

	public void setLocationNo(String locationNo) {
		this.locationNo = locationNo;
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

	public String getShelfNo() {
		return shelfNo;
	}

	public void setShelfNo(String shelfNo) {
		this.shelfNo = shelfNo;
	}

	public Integer getSign() {
		return sign;
	}

	public void setSign(Integer sign) {
		this.sign = sign;
	}

}