package com.mjzk.dome.serviceimpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mjzk.dome.beans.User;
import com.mjzk.dome.daoimpl.UserDao;

@Service
public class UserService {

	@Resource
	private UserDao userDao; 
	
	@Transactional
	public boolean login(User user){
		return	userDao.loginUser(user);
	}
	
	@Transactional
	public boolean login(String userId,String password){
		return	userDao.loginUser( userId, password);
	}
	
	@Transactional
	public User findUser(User user){
		return	userDao.findUser(user);
	}
	
	@Transactional
	public User findUser(String userId,String password){
		return	userDao.findUser( userId, password);
	}
	
	@Transactional
	public boolean saveUser(User user){
		try {
			System.out.print("用户注册");
			userDao.save(user);
		} catch (Exception e) {
			System.out.println("用户注册失败！");
			e.printStackTrace();
			return false;
		}	
		return true;	
	}
	
	@Transactional
	public boolean upbdate(User user){
		if (userDao.updateUser(user)) {
			return true;
		} else {
            return false;
		}
		
	}
	
}
