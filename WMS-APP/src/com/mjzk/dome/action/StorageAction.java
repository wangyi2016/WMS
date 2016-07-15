package com.mjzk.dome.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.commons.lang.ObjectUtils.Null;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.mjzk.dome.base.BaseAction;
import com.mjzk.dome.beans.Stock;
import com.mjzk.dome.beans.Task;

/**
 * 
 * @author wangyi
 *date: 2016年7月14日
 *入库操作
 */
@ParentPackage("struts-default")
@Controller
@Scope("prototype")
public class StorageAction extends BaseAction<Stock>{

	private static final long serialVersionUID = 1L;
	public static Logger logger =Logger.getLogger(PickupAction.class.getName());
	
	@Action(value = "auto")
	public void loginapp() {
		/*List<Task> list=taskService.findAllTask();
		//根据位置计算修改PLC数据
		
		runTask.readPLC(new short[]{24,12524,134,144,4,5,6,7,9,10});*/
		HttpServletResponse response=ServletActionContext.getResponse();
		 response.setContentType("text/html");
	        response.setContentType("text/html;charset=utf-8");
	        PrintWriter out;
			try {
				out = response.getWriter();
				JSONObject json = new JSONObject();
				json.accumulate("tasks", null);
				out.println(json.toString());
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}