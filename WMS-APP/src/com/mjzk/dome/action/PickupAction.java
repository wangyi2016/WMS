package com.mjzk.dome.action;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.mjzk.dome.base.BaseAction;
import com.mjzk.dome.beans.Task;

/**
 * 
 * @author wangyi
 *date: 2016年7月14日
 *出库操作
 */
@ParentPackage("struts-default")
@Controller
@Scope("prototype")
public class PickupAction extends BaseAction<Task>{

	private static final long serialVersionUID = 1L;
	public static Logger logger =Logger.getLogger(PickupAction.class.getName());
	
	private String stockid; 
}
