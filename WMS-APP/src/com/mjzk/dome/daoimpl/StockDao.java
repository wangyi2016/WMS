/**
 * 
 */
package com.mjzk.dome.daoimpl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.mjzk.dome.base.daoSupportImpl;
import com.mjzk.dome.beans.Stock;

/**
 * @author wangyi 2016年7月12日 
 *
 */
@Component
public class StockDao extends daoSupportImpl<Stock>{

	@SuppressWarnings("unchecked")
	public List<Stock> findAllStockByWhno(String whno){
		org.hibernate.Query query = getSession().createQuery("from Stock where warehouseNo='" + whno+"'");
		if (query.list().size()==0) {
			return null;
		}
		return  query.list();
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Stock> findAllStockByAddress(String whno,String location){
		org.hibernate.Query query = getSession().createQuery("from Stock where warehouseNo='" + whno+"' and locationNo='"+location+"'");
		if (query.list().size()==0) {
			return null;
		}
		return  query.list();
		
	}
}
