package com.mjzk.dome.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.mjzk.dome.base.BaseAction;
import com.mjzk.dome.beans.User;
import com.mjzk.dome.serviceimpl.StockService;
import com.mjzk.dome.serviceimpl.UserService;

@ParentPackage("struts-default")
@Controller
@Scope("prototype")
public class LoginAction extends BaseAction<User>{

	private static final long serialVersionUID = 1L;
	public static Logger logger =Logger.getLogger(LoginAction.class.getName());

	
	private String userId1;
	private String password1;
	private String password2;
	private String oldpassword;
	private User user;//用户对象
	@Resource
	private UserService userService;
	@Resource
	private StockService stockService;
	
	private String  message;
	
	@Action(value = "login", results = { @Result(name = "success", location = "/main.jsp"), @Result(name = "error", location = "/login.jsp")})
	public String login() {
		HttpServletRequest request=ServletActionContext.getRequest();
		
		if (user!=null&&!user.getUserId().equals(null)) {
			 if (userService.login(user)) {
				 user=userService.findUser(user);
				 request.getSession().setAttribute("user", user);
				 logger.info("用户登陆："+user.getUserId());
				 return SUCCESS;
			}
			 message="账号密码错误！！";
		}
		return ERROR;
	}

	@Action(value = "loginapp", results = { @Result(name = "success", location = "/WEB-INF/jsondata/data.jsp") })
	public void loginapp() {
		HttpServletRequest request = ServletActionContext.getRequest();
		boolean login = false;
		if (userId1 != null && !userId1.equals("")) {
			if (userService.login(userId1, password1)) {

				login = true;
				message = "登录成功";
				user = userService.findUser(userId1, password1);
				request.getSession().setAttribute("user", user);
				logger.info("用户登陆：" + user.getUserId());

			} else {
				message = "账号密码错误！！";
			}
		}
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out;
		try {
			out = response.getWriter();
			JSONObject json = new JSONObject();
			json.accumulate("login", login);
			json.accumulate("msg", message);
			out.println(json.toString());
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Action(value = "out", results = { @Result(name = "success", location = "/login.jsp")})
	public String outUser() {
		HttpServletRequest request=ServletActionContext.getRequest();
		 request.getSession().removeAttribute("user");
		return SUCCESS;
	}
	
	@Action(value = "changepd", results = { @Result(name = "success", location = "/WEB-INF/jsondata/data.jsp")})
	public void change() {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		// 以下代码从JSON.java中拷过来的
		response.setContentType("text/html");
		PrintWriter out;
		try {
			out = response.getWriter();
			// 将要被返回到客户端的对象
			JSONObject json = new JSONObject();
			user = (User) request.getSession().getAttribute("user");
			if ((oldpassword).equals(user.getPassword())) {
				user = userService.findUser(user);
				user.setPassword(password2);
				if (userService.upbdate(user)) {
					request.getSession().setAttribute("user", user);
					json.accumulate("success", true);
				} else {
					json.accumulate("success", false);
				}
			} else {
				json.accumulate("success", false);
			}
			out.println(json.toString());
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Action(value = "register", results = { @Result(name = "success", location = "/main.jsp"), @Result(name = "error", location = "/register.jsp")})
	public String register() {
		HttpServletRequest request=ServletActionContext.getRequest();
		
		if (user!=null&&!user.getUserId().equals(null)) {
			
			user.setPassword(user.getPassword());
			System.out.println(user.getPassword());
			 if (userService.saveUser(user)) {
				request.getSession().setAttribute("user", user);
				return SUCCESS;
			}
			 message="注册失败！";
		}
		return ERROR;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public String getOldpassword() {
		return oldpassword;
	}

	public void setOldpassword(String oldpassword) {
		this.oldpassword = oldpassword;
	}
	public String getUserId1() {
		return userId1;
	}
	public void setUserId1(String userId1) {
		this.userId1 = userId1;
	}
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	
}
