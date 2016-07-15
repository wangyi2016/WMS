/**
 * 
 */
package com.mjzk.dome.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mjzk.dome.beans.Stock;
import com.mjzk.dome.daoimpl.StockDao;

/**
 * @author wangyi 2016年7月12日 
 *
 */
@Service
public class StockService {

	@Resource
	StockDao StockDao;
	
	@Transactional
	public void saveStock(Stock Stock){
		StockDao.save(Stock);
	}
	
	@Transactional
	public void updateStock(Stock Stock){
		StockDao.update(Stock);
	}
	
	@Transactional
	public Stock findStock(String Stockid){
		return StockDao.findById(Stockid);
	}
	
	@Transactional
	public List<Stock> findAllStock(){
		return StockDao.findAll();
	}
	
	@Transactional
	public List<Stock> findAllStockByWhno(String whno){
		return StockDao.findAllStockByWhno(whno);
	}
	
	@Transactional
	public List<Stock> findAllStockByAddress(String whno,String location){
		return StockDao.findAllStockByAddress(whno,location);
	}
}
