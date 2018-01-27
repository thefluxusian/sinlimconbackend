package com.ctk.sinlimcon.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ctk.sinlimcon.vo.UserVo;

@Repository("userDao")
public class UserDao {
	@Autowired
	private SqlSession session;

	public UserVo getUser(String userId) {
		UserVo user = session.selectOne("getUser", userId);
		return user;
	}

	public void postUser(UserVo user) {
		session.insert("insertUser", user);
	}
}
