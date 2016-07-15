package com.mjzk.dome.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mjzk.dome.beans.Shelf;
import com.mjzk.dome.daoimpl.ShelfDao;

/**
 * 
 * @author wangyi
 *date: 2016年7月14日
 *
 */
@Service
public class ShelfService {

	@Resource
	ShelfDao ShelfDao;
	
	@Transactional
	public void saveShelf(Shelf Shelf){
		ShelfDao.save(Shelf);
	}
	
	@Transactional
	public void updateShelf(Shelf Shelf){
		ShelfDao.update(Shelf);
	}
	
	@Transactional
	public Shelf findShelf(String Shelfid){
		return ShelfDao.findById(Shelfid);
	}
	
	@Transactional
	public List<Shelf> findAllShelf(){
		return ShelfDao.findAll();
	}
	
	@Transactional
	public List<Shelf> findShelfByWhno(String whno){
		return ShelfDao.findShelfByWhno(whno);
	}
}
