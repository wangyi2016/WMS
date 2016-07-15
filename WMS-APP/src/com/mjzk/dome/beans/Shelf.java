package com.mjzk.dome.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author wangyi
 *date: 2016年7月14日
 *
 */
@Entity
@Table(name="SHELF")
public class Shelf {

	@Id
	@Column(name="Shelf_No")
	private String shelfNo;
	@Column(name="Shelf_Name")
	private String shelfName;
	@Column(name="Warehouse_No")
	private String warehouseNo;
	@Column(name="Height")
	private Integer height;
	@Column(name="Width")
	private Integer width;
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
	
	
	public Shelf() {
	}


	public String getShelfNo() {
		return shelfNo;
	}


	public void setShelfNo(String shelfNo) {
		this.shelfNo = shelfNo;
	}


	public String getShelfName() {
		return shelfName;
	}


	public void setShelfName(String shelfName) {
		this.shelfName = shelfName;
	}


	public String getWarehouseNo() {
		return warehouseNo;
	}


	public void setWarehouseNo(String warehouseNo) {
		this.warehouseNo = warehouseNo;
	}


	public Integer getHeight() {
		return height;
	}


	public void setHeight(Integer height) {
		this.height = height;
	}


	public Integer getWidth() {
		return width;
	}


	public void setWidth(Integer width) {
		this.width = width;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public String getCreateUserId() {
		return createUserId;
	}


	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}


	public String getCreateDate() {
		return createDate;
	}


	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}


	public String getUpdateUserId() {
		return updateUserId;
	}


	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}


	public String getUpdateDate() {
		return updateDate;
	}


	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

}
