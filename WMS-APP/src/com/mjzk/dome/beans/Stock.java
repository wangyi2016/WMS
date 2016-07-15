package com.mjzk.dome.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Stock entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="STOCK")
public class Stock  {

	@Id
	@Column(name="Stock_Id")
	private String stockId;
	@Column(name="Mtl_No")
	private String mtlNo;
	@Column(name="Warehouse_No")
	private String warehouseNo;
	@Column(name="Shelf_No")
	private String shelfNo;
	@Column(name="Location_No")
	private String locationNo;
	@Column(name="ST_No")
	private String stNo;
	@Column(name="Tray_No")
	private String trayNo;
	@Column(name="Qty")
	private Integer qty;
	@Column(name="Remark")
	private String remark;
	@Column(name="Update_Date")
	private String updateDate;

	// Constructors

	/** default constructor */
	public Stock() {
	}

	/** minimal constructor */
	public Stock(String stockId) {
		this.stockId = stockId;
	}

	/** full constructor */
	public Stock(String stockId, String mtlNo, String warehouseNo,
			String locationNo, String trayNo, Integer qty, String remark,
			String updateDate) {
		this.stockId = stockId;
		this.mtlNo = mtlNo;
		this.warehouseNo = warehouseNo;
		this.locationNo = locationNo;
		this.trayNo = trayNo;
		this.qty = qty;
		this.remark = remark;
		this.updateDate = updateDate;
	}

	// Property accessors

	public String getStockId() {
		return this.stockId;
	}

	public String getShelfNo() {
		return shelfNo;
	}

	public void setShelfNo(String shelfNo) {
		this.shelfNo = shelfNo;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
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

	public String getTrayNo() {
		return this.trayNo;
	}

	public void setTrayNo(String trayNo) {
		this.trayNo = trayNo;
	}

	public Integer getQty() {
		return this.qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getStNo() {
		return stNo;
	}

	public void setStNo(String stNo) {
		this.stNo = stNo;
	}

}