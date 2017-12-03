package com.ctk.sinlimcom.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ctk.sinlimcon.vo.DesignVo;


@Repository("designDao")
public class DesignDao {
	@Autowired
	private SqlSession session;


	public List<DesignVo> readAll() {
		List<DesignVo> userList = session.selectList("selectDesignList");
		System.out.println(userList);
		return userList;
	}
}
