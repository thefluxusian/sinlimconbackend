package com.ctk.sinlimcon.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ctk.sinlimcon.vo.PictureVo;

@Repository("pictureDao")
public class PictureDao {
	
	@Autowired
	private SqlSession session;
	
	public List<PictureVo> getDesign(String designid) {
		List<PictureVo> temp=session.selectList("getPictureByDesignId", designid);
		return temp;
	}
}
