package com.ctk.sinlimcon.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ctk.sinlimcon.dao.UserDao;
import com.ctk.sinlimcon.vo.UserVo;

public class UserService {
	
	@Autowired
	UserDao userdao;
	public Object getUser(String userId) {
		Object temp=userdao.getUser(userId);
		return temp;
	}
	
	public void postUser(UserVo user) {
		userdao.postUser(user);
	}
}
