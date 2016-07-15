/**
 * 
 */
package com.mjzk.dome.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mjzk.dome.beans.MaretrialsType;
import com.mjzk.dome.daoimpl.MaretrialsTypeDao;

/**
 * @author wangyi 2016年7月12日 
 *
 */
@Service
public class MaretrialsTypeService {
	@Resource
	MaretrialsTypeDao MaretrialsTypeDao;
	
	@Transactional
	public void saveMaretrialsType(MaretrialsType MaretrialsType){
		MaretrialsTypeDao.save(MaretrialsType);
	}
	
	@Transactional
	public void updateMaretrialsType(MaretrialsType MaretrialsType){
		MaretrialsTypeDao.update(MaretrialsType);
	}
	
	@Transactional
	public MaretrialsType findMaretrialsType(String MaretrialsTypeid){
		return MaretrialsTypeDao.findById(MaretrialsTypeid);
	}
	
	@Transactional
	public List<MaretrialsType> findAllMaretrialsType(){
		return MaretrialsTypeDao.findAll();
	}
}
