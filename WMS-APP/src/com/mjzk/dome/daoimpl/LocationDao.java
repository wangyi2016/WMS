/**
 * 
 */
package com.mjzk.dome.daoimpl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.mjzk.dome.base.daoSupportImpl;
import com.mjzk.dome.beans.Location;

/**
 * @author wangyi 2016年7月12日 
 *
 */
@Component
public class LocationDao extends daoSupportImpl<Location>{

	//获取空货位
	@SuppressWarnings("unchecked")
	public List<Location> getLocationIsNull(){
		org.hibernate.Query query = getSession().createQuery("FROM Location WHERE locationNo NOT in(SELECT locationNo FROM Stock)");
			return  query.list();
	}
	
	//获取有货货位
	@SuppressWarnings("unchecked")
	public List<Location> getLocationNotNull(){
			org.hibernate.Query query = getSession().createQuery("FROM Location WHERE locationNo in(SELECT locationNo FROM Stock)");
				return  query.list();
		}
}
