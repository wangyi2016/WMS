package com.mjzk.dome.schedule;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;



public class ScheduleManager implements ServletContextListener {

	private static Logger logger = Logger.getLogger(ServletContextListener.class);

	/**
	 * 服务启动的时候，启动调度线程,时刻监听是否有任务需要调度
	 */
	public void contextInitialized(ServletContextEvent event) {

		logger.info("正在初始化数据........");
		
		
		logger.info("已启动调度监控线程 .....");

	//	Common.pool.execute(new ScheduleHandler());
	}

	/**
	 * 当 服务器停止的时候，将已经启动的线程全部停止，关闭所有的数据库连接
	 */
	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("trying to stop the server.........");
		logger.debug("trying to stop the threads..............");
		destoryJDBCDriver();
	}
	
	private void destoryJDBCDriver(){
		final Enumeration<java.sql.Driver> drivers = DriverManager.getDrivers() ;
		Driver driver = null;
		while(drivers.hasMoreElements()){
			driver = drivers.nextElement();
			try {
				DriverManager.deregisterDriver(driver);
			} catch (Exception e) {
			}
		}
	}
}
