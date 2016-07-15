/**
 * 
 */
package com.mjzk.dome.schedule;

import com.mjzk.dome.action.TestAction;
import com.mjzk.dome.utils.EditModbus;

/**
 * @author wangyi 2016年7月12日 
 *
 */
public class TaskThread extends Thread{

	private int modebusid;
	private int begin;
	private int end;
	private String doit;
	private short[] write;
	private String ip;
	
	public TaskThread(int modebusid,int begin,int end,String doit,String ip) {
		this.begin=begin;
		this.modebusid=modebusid;
		this.end=end;
		this.doit=doit;
		this.ip=ip;
	}
	public TaskThread(int modebusid,int begin,short write[],String doit,String ip) {
		this.begin=begin;
		this.modebusid=modebusid;
		this.write=write;
		this.doit=doit;
		this.ip=ip;
	}

	public void run(){
	    ok:
	    	if (doit.equals("read")) {
	    		while (true) {
	    			int[] a=EditModbus.test(modebusid,begin,end,ip);
	    			for (int i = 0; i < a.length; i++) {
	    				System.out.println(a[i]);
	    				if (a[i]==1) {
	    					System.out.println("game over!");
	    					TestAction testAction=new TestAction();
	    					testAction.TEST();
	    					break ok;
	    				}
	    			}
	    		}
			}else {
	    		EditModbus.testwrite(modebusid, begin, write,ip);
	    		System.out.println("game begin!");
	    		break ok;
			}
		
	}
	
}
