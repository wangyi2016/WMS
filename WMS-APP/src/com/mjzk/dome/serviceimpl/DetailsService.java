/**
 * 
 */
package com.mjzk.dome.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mjzk.dome.beans.Details;
import com.mjzk.dome.daoimpl.DetailsDao;

/**
 * @author wangyi 2016年7月12日 
 *
 */
@Service
public class DetailsService {
	@Resource
	DetailsDao DetailsDao;
	
	@Transactional
	public void saveDetails(Details Details){
		DetailsDao.save(Details);
	}
	
	@Transactional
	public void updateDetails(Details Details){
		DetailsDao.update(Details);
	}
	
	@Transactional
	public Details findDetails(String Detailsid){
		return DetailsDao.findById(Detailsid);
	}
	
	@Transactional
	public List<Details> findAllDetails(){
		return DetailsDao.findAll();
	}
}
