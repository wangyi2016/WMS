package com.mjzk.dome.base;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

@SuppressWarnings("unchecked")
@Component
public abstract class daoSupportImpl<T> implements daoSupport<T> {

	private Class<T> clazz;

	@Resource
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/*
	 * 利用反射找到该泛型的实际类型
	 */
	@SuppressWarnings("unchecked")
	public daoSupportImpl() {
		// 使用反射技术得到T的真实类型
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass(); // 获取当前new的对象的
																							// 泛型的父类
																							// 类型
		this.clazz = (Class<T>) pt.getActualTypeArguments()[0]; // 获取第一个类型参数的真实类型
		System.out.println("clazz ---> " + clazz);
	}

	public void save(T t) {
		getSession().save(t);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		Object object = findById(id);
		if (object != null) {
			getSession().delete(object);
		}
	}

	public void update(T t) {
		// TODO Auto-generated method stub
		getSession().merge(t);
	}

	public T findById(int id) {
		// TODO Auto-generated method stub
		if (new Integer(id) != null) {
			return (T) getSession().get(clazz, id);
		}
		return null;
	}
	public T findById(String id) {
		// TODO Auto-generated method stub
		if (id != null) {
			return (T) getSession().get(clazz, id);
		}
		return null;
	}

	public T findByNumber(String number) {
		// TODO Auto-generated method stub
		org.hibernate.Query query = getSession().createQuery("from MJ_AGV agv where agv.agv_code=" + number);
		if(query.list().size() == 0){
			return null ;
		}
		return (T) query.list().get(0);
	}

	/** 查询所有记录 **/
	public List<T> findAll() {
		return getSession().createQuery("from " + clazz.getSimpleName()).list();
	}
	
	/**
	 * 分页查找
	 * 
	 * @param page
	 *            第多少页
	 * @param pageSize
	 *            每页最多显示多少条
	 * @return 返回结果集
	 */
	public List<T> findByPage(int page, int pageSize) {
		
		Query query = getSession().createQuery(" from " + clazz.getSimpleName()) ;
		query.setMaxResults(pageSize); /** 每页最多显示多少条 **/
		query.setFirstResult((page - 1) * pageSize); /** 每页的起始记录 **/
		List<T> list = query.list();
        return list ;
	}
}
