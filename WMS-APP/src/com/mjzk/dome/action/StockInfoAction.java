package com.mjzk.dome.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.mjzk.dome.base.BaseAction;
import com.mjzk.dome.beans.Maretrials;
import com.mjzk.dome.beans.Shelf;
import com.mjzk.dome.beans.Stock;
import com.mjzk.dome.beans.User;
import com.mjzk.dome.common.Temporary;
import com.mjzk.dome.serviceimpl.LocationService;
import com.mjzk.dome.serviceimpl.MaretrialsService;
import com.mjzk.dome.serviceimpl.ShelfService;
import com.mjzk.dome.serviceimpl.StockService;

/**
 * @author wangyi 2016年7月13日 
 *
 */

@ParentPackage("struts-default")
@Controller
@Scope("prototype")
public class StockInfoAction extends BaseAction<Stock>{
	private static final long serialVersionUID = 1L;
	public static Logger logger =Logger.getLogger(StockInfoAction.class.getName());

	@Resource
	private StockService stockService;
	@Resource
	private MaretrialsService maretrialsService;
	@Resource
	private LocationService locationService;
	@Resource
	private ShelfService shelfService;
	private String whAddress;
	private String laddress;
	private String mtl_No;
	
	/*
	 * 获取所有有货的库位信息
	 */
	@Action(value = "getStocks")
	public void getStock() {
		List<Stock> list = null;
		List<Shelf> shelfs = null;
		List<Temporary> list2 = new ArrayList<Temporary>();
		// 返回仓库所有信息
		list = stockService.findAllStockByWhno(whAddress);
		shelfs = shelfService.findShelfByWhno(whAddress);

		for (int i = 0; i < list.size(); i++) {
			Temporary temporary = new Temporary();
			temporary.setLocationNo(list.get(i).getLocationNo());
			temporary.setMtlNo(list.get(i).getMtlNo());
			temporary.setQty(list.get(i).getQty());
			temporary.setRemark(list.get(i).getRemark());
			temporary.setShelfNo(list.get(i).getShelfNo());
			temporary.setStockId(list.get(i).getStockId());
			temporary.setTrayNo(list.get(i).getTrayNo());
			temporary.setUpdateDate(list.get(i).getUpdateDate());
			temporary.setWarehouseNo(list.get(i).getWarehouseNo());
			Maretrials maretrials = maretrialsService.findMaretrials(list
					.get(i).getMtlNo());
			temporary.setMtlName(maretrials.getMtlName());
			temporary.setMtlType(maretrials.getMtlType());

			list2.add(temporary);
		}
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out;
		try {
			out = response.getWriter();
			JSONObject json = new JSONObject();
			json.accumulate("Stocks", list2);
			json.accumulate("Shelfs", shelfs);
			out.println(json.toString());
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * 根据物料编号返回物料信息
	 */
	@Action(value = "getMaretrial")
	public void getMaretrial() {
		Maretrials maretrials = maretrialsService.findMaretrials(mtl_No);
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out;
		try {
			out = response.getWriter();
			JSONObject json = new JSONObject();
			json.accumulate("maretrials", maretrials);
			out.println(json.toString());
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * 根据库位信息返回物料信息
	 */
	@Action(value = "getMaretrialByAddress")
	public void getMaretrialByAddress() {
		List<Maretrials> list = new ArrayList<Maretrials>();
		// 获取详细的库位信息
		List<Stock> stocks = stockService.findAllStockByAddress(whAddress,
				laddress);
		for (int i = 0; i < stocks.size(); i++) {
			Maretrials maretrials = maretrialsService.findMaretrials(stocks.get(i).getMtlNo());
			if (maretrials != null) {
				list.add(maretrials);
			}
		}
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out;
		try {
			out = response.getWriter();
			JSONObject json = new JSONObject();
			json.accumulate("maretrials", list);
			out.println(json.toString());
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getWhAddress() {
		return whAddress;
	}

	public void setWhAddress(String whAddress) {
		this.whAddress = whAddress;
	}

	public String getLaddress() {
		return laddress;
	}

	public void setLaddress(String laddress) {
		this.laddress = laddress;
	}

	public String getMtl_No() {
		return mtl_No;
	}

	public void setMtl_No(String mtl_No) {
		this.mtl_No = mtl_No;
	}
}
