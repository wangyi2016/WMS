/**
 * 
 */
package com.mjzk.dome.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mjzk.dome.beans.Location;
import com.mjzk.dome.daoimpl.LocationDao;

/**
 * @author wangyi 2016年7月12日 
 *
 */
@Service
public class LocationService {

	@Resource
	LocationDao locationDao;
	
	@Transactional
	public void saveLocation(Location location){
		locationDao.save(location);
	}
	
	@Transactional
	public void updateLocation(Location location){
		locationDao.update(location);
	}
	
	@Transactional
	public Location findLocation(String locationid){
		return locationDao.findById(locationid);
	}
	
	@Transactional
	public List<Location> findAllLocation(){
		return locationDao.findAll();
	}
	
	@Transactional
	public List<Location> getLocationIsNull(){
		return locationDao.getLocationIsNull();
	}
}
