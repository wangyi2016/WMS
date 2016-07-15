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
import com.mjzk.dome.beans.Location;
import com.mjzk.dome.beans.Task;
import com.mjzk.dome.beans.Tray;
import com.mjzk.dome.serviceimpl.LocationService;
import com.mjzk.dome.serviceimpl.TrayService;

@ParentPackage("struts-default")
@Controller
@Scope("prototype")
public class TestAction extends BaseAction<Task> {

	private static final long serialVersionUID = 1L;
	public static Logger logger = Logger.getLogger(TestAction.class.getName());
	@Resource
	private LocationService locationService;
	@Resource
	private TrayService trayService;

	@Action(value = "TEST")
	public void TEST() {
		/*for (int i = 1; i <= 4; i++) {
			Location location = new Location();
			for (int j = 1; j < 10; j++) {
				location.setLocationNo("A-" + i + "-" + j);
				location.setWarehouseNo("WH1");
				location.setShelfNo("WH1-A");
				location.setSign(1);
				locationService.saveLocation(location);
			}
		}*/
		for (int i = 1; i <= 4; i++) {
			Tray tray=new Tray();
			
				if (i<10) {
					tray.setTrayNo("T1-000"+i);
				}else {
					tray.setTrayNo("T1-00"+i);
				}
				tray.setTrayType("T1");
				tray.setWarehouseNo("WH1");
				trayService.saveTray(tray);
			
		}
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out;
		try {
			out = response.getWriter();
			JSONObject json = new JSONObject();
			json.accumulate("test", "ok");
			out.println(json.toString());
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Action(value = "TEST2")
	public void TEST2() {
           List<Location> list = locationService.getLocationIsNull();
		HttpServletResponse response=ServletActionContext.getResponse();
		 response.setContentType("text/html");
	        response.setContentType("text/html;charset=utf-8");
	        PrintWriter out;
			try {
				out = response.getWriter();
				JSONObject json = new JSONObject();
				json.accumulate("test", list);
				out.println(json.toString());
				out.flush();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
