package com.mjzk.dome.common;

import org.springframework.stereotype.Component;

import com.mjzk.dome.schedule.TaskThread;

/**
 * @author wangyi 2016年7月12日 
 *
 */

@Component
public class RunTask {

	public void readPLC(short write[],String ip){
		TaskThread taskThread1=new TaskThread(1,0,write,"xxx",ip);
		taskThread1.start();
		TaskThread taskThread=new TaskThread(1,0,9,"read",ip);
		taskThread.start();
	}
}
