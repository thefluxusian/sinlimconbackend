package com.ctk.sinlimcon.dao;

import java.util.HashMap;
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
		List<DesignVo> designList = session.selectList("selectDesignList");
		System.out.println(designList);
		return designList;
	}


	public DesignVo read(String userId) {
		DesignVo design=session.selectOne("selectDesignById");
		return design;
	}


	public void postDesign(DesignVo design) {
		session.insert("insertDesign",design);
	}


	public void deleteDesign(String designid) {
		session.delete("deleteDesign",designid);
	}


	public Object getDesign(String designid) {
		DesignVo design=session.selectOne("getDesign",designid);
		return design;
	}


	public void putDesign(String designid, DesignVo design) {
		HashMap<String, Object> param=new HashMap<>();
		param.put("designname", design.getDesignname());
		param.put("userid", design.getUserid());
		param.put("price", design.getPrice());
		param.put("summary", design.getSummary());
		param.put("designid", designid);
		session.update("updateDesign", param);
	}
}
