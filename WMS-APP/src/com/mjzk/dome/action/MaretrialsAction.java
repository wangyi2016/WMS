package com.mjzk.dome.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.mjzk.dome.base.BaseAction;
import com.mjzk.dome.beans.Maretrials;
import com.mjzk.dome.serviceimpl.MaretrialsService;

@ParentPackage("struts-default")
@Controller
@Scope("prototype")
public class MaretrialsAction extends BaseAction<Maretrials>{

	private static final long serialVersionUID = 1L;
	public static Logger logger =Logger.getLogger(PickupAction.class.getName());
	
	@Resource
	private MaretrialsService maretrialsService;
	
	/*
	 * 获取所有物料信息
	 */
	@Action(value = "getMaretrialses")
	public void getMaretrialses() {
		List<Maretrials> list=maretrialsService.findAllMaretrials();
		HttpServletResponse response=ServletActionContext.getResponse();
		 response.setContentType("text/html");
	        response.setContentType("text/html;charset=utf-8");
	        PrintWriter out;
			try {
				out = response.getWriter();
				JSONObject json = new JSONObject();
				json.accumulate("list", list);
				out.println(json.toString());
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
