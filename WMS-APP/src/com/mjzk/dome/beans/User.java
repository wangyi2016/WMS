package com.mjzk.dome.beans;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	
	@Id
	@Column(name="UserId")
	private String userId;
	@Column(name="Password")
	private String password;
	@Column(name="Name")
	private String name;
	@Column(name="Position")
	private String position;
	@Column(name="Group_Name")
	private String groupName;
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

	
	public User() {
	}

	/** minimal constructor */
	public User(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}

	/** full constructor */
	public User(String userId, String password, String name, String position,
			String groupName, String warehouseNo, String remark,
			String createUserId, String createDate, String updateUserId,
			String updateDate) {
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.position = position;
		this.groupName = groupName;
		this.warehouseNo = warehouseNo;
		this.remark = remark;
		this.createUserId = createUserId;
		this.createDate = createDate;
		this.updateUserId = updateUserId;
		this.updateDate = updateDate;
	}

	// Property accessors

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
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