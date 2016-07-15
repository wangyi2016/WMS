package com.mjzk.dome.daoimpl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.mjzk.dome.base.daoSupportImpl;
import com.mjzk.dome.beans.Shelf;

/**
 * 
 * @author wangyi
 *date: 2016年7月14日
 *
 */
@Component
public class ShelfDao extends daoSupportImpl<Shelf> {

	@SuppressWarnings("unchecked")
	public List<Shelf> findShelfByWhno(String whno){
		org.hibernate.Query query = getSession().createQuery("from Shelf  where warehouseNo='" + whno+"'");
		
		if( query.list().size()!=0){
			return  query.list() ;
		}
		return null;
	}
}
