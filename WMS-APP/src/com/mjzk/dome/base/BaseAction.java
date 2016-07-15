package com.mjzk.dome.base;

import java.lang.reflect.ParameterizedType;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/*
 * 所有action的基本父类
 */
@SuppressWarnings("serial")
public abstract class BaseAction<T> extends ActionSupport implements
		ModelDriven<T>{
	/*
	 * 继承该类的实际类型
	 */
	protected T model;

	public T getModel() {
		return model;
	}

	/*
	 * 通过反射获取泛型类的实际类型并实例化
	 */
	@SuppressWarnings("unchecked")
	public BaseAction() {
		try {
			ParameterizedType pt = (ParameterizedType) this.getClass()
					.getGenericSuperclass();
			Class<T> clazz = (Class<T>) pt.getActualTypeArguments()[0];
			model = clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public void setModel(T model) {
		this.model = model;
	}
}
