/**
 * 
 */
package com.mjzk.dome.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mjzk.dome.beans.Tray;
import com.mjzk.dome.daoimpl.TrayDao;

/**
 * @author wangyi 2016年7月12日 
 *
 */
@Service
public class TrayService {

	@Resource
	TrayDao trayDao;
	
	@Transactional
	public void saveTray(Tray Tray){
		trayDao.save(Tray);
	}
	
	@Transactional
	public void updateTray(Tray Tray){
		trayDao.update(Tray);
	}
	
	@Transactional
	public Tray findTray(String Trayid){
		return trayDao.findById(Trayid);
	}
	
	@Transactional
	public List<Tray> findAllTray(){
		return trayDao.findAll();
	}
}
