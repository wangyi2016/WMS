/**
 * 
 */
package com.mjzk.dome.test;

import com.mjzk.dome.common.Common;
import com.mjzk.dome.schedule.TaskThread;

/**
 * @author wangyi 2016年7月12日 
 *
 */
public class test1 {

	public static void main(String[] args) {
		TaskThread taskThread1=new TaskThread(1,0,new short[]{24,12524,134,144,4,5,6,7,9,10},"xxx",Common.INPUT_IP);
		taskThread1.start();
		TaskThread taskThread=new TaskThread(1,0,9,"read",Common.INPUT_IP);
		taskThread.start();
	}
}
