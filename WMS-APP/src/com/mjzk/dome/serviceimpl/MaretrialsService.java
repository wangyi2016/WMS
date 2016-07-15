package com.mjzk.dome.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mjzk.dome.beans.Maretrials;
import com.mjzk.dome.daoimpl.MaretrialsDao;

/**
 * @author wangyi 2016年7月12日 
 *
 */
@Service
public class MaretrialsService {

	@Resource
	MaretrialsDao MaretrialsDao;
	
	@Transactional
	public void saveMaretrials(Maretrials Maretrials){
		MaretrialsDao.save(Maretrials);
	}
	
	@Transactional
	public void updateMaretrials(Maretrials Maretrials){
		MaretrialsDao.update(Maretrials);
	}
	
	@Transactional
	public Maretrials findMaretrials(String Maretrialsid){
		return MaretrialsDao.findById(Maretrialsid);
	}
	
	@Transactional
	public List<Maretrials> findAllMaretrials(){
		return MaretrialsDao.findAll();
	}
}
