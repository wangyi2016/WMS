package com.mjzk.dome.daoimpl;

import org.springframework.stereotype.Component;

import com.mjzk.dome.base.daoSupportImpl;
import com.mjzk.dome.beans.User;

@Component
public class UserDao extends daoSupportImpl<User>{

	public boolean loginUser(User user){
		org.hibernate.Query query = getSession().createQuery("from User  where UserId='" + user.getUserId()+"' and password='"+user.getPassword()+"'");
		if(query.list().size() == 0){
			return false ;
		}
		return true;
	}
	
	public boolean loginUser(String userId,String password){
		org.hibernate.Query query = getSession().createQuery("from User  where UserId='" + userId+"' and password='"+password+"'");
		if(query.list().size() == 0){
			return false ;
		}
		return true;
	}
	public User findUser(User user){
		org.hibernate.Query query = getSession().createQuery("from User  where UserId='" + user.getUserId()+"' and password='"+user.getPassword()+"'");
		user=(User) query.list().get(0);
		if(user!=null){
			return (User) user ;
		}
		return null;
	}
	
	public User findUser(String userId,String password){
		org.hibernate.Query query = getSession().createQuery("from User  where UserId='" + userId+"' and password='"+password+"'");
		User user=(User) query.list().get(0);
		if(user!=null){
			return (User) user ;
		}
		return null;
	}
	
	public boolean updateUser(User user){
		try {
			System.out.print("更新用户");
			getSession().merge(user);
		} catch (Exception e) {
			System.out.println("用户更新失败！");
			e.printStackTrace();
			return false;
		}	
		return true;
	}
}
