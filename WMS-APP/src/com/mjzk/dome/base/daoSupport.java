package com.mjzk.dome.base;

import java.util.List;

/*
 * 所有接口的基类接口
 */
public interface daoSupport<T> {
	
	/*
	 * 添加一条记录
	 */
	public void save(T t) ;
	
	/*
	 * 删除一条记录
	 */
	public void delete(int id) ;
	
	/*
	 * 修改一条记录
	 */
	public void update(T t) ;
	
	/*
	 * 通过id号查找
	 */
	public T findById(int id) ;
		
	/*
	 * 通过编号查找
	 */
	public T findByNumber(String number) ;
	
	/*
	 * 查询所有
	 */
	public List<T> findAll() ;
		
}
