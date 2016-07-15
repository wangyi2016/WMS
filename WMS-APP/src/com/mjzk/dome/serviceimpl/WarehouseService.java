/**
 * 
 */
package com.mjzk.dome.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mjzk.dome.beans.Warehouse;
import com.mjzk.dome.daoimpl.WarehouseDao;

/**
 * @author wangyi 2016年7月12日 
 *
 */
@Service
public class WarehouseService {

	@Resource
	WarehouseDao warehouseDao;
	
	@Transactional
	public void saveWarehouse(Warehouse warehouse){
		warehouseDao.save(warehouse);
	}
	
	@Transactional
	public void updateWarehouse(Warehouse warehouse){
		warehouseDao.update(warehouse);
	}
	
	@Transactional
	public Warehouse findWarehouse(String warehouseid){
		return warehouseDao.findById(warehouseid);
	}
	
	@Transactional
	public List<Warehouse> findAllWarehouse(){
		return warehouseDao.findAll();
	}
}
