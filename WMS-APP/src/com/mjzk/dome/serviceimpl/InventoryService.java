/**
 * 
 */
package com.mjzk.dome.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mjzk.dome.beans.Inventory;
import com.mjzk.dome.daoimpl.InventoryDao;

/**
 * @author wangyi 2016年7月12日 
 *
 */
@Service
public class InventoryService {
	@Resource
	InventoryDao InventoryDao;
	 
	@Transactional
	public void saveInventory(Inventory Inventory){
		InventoryDao.save(Inventory);
	}
	
	@Transactional
	public void updateInventory(Inventory Inventory){
		InventoryDao.update(Inventory);
	}
	
	@Transactional
	public Inventory findInventory(String Inventoryid){
		return InventoryDao.findById(Inventoryid);
	}
	
	@Transactional
	public List<Inventory> findAllInventory(){
		return InventoryDao.findAll();
	}
}
