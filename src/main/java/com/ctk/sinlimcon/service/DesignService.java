package com.ctk.sinlimcon.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctk.sinlimcon.dao.DesignDao;
import com.ctk.sinlimcon.dao.PictureDao;
import com.ctk.sinlimcon.dao.UserDao;
import com.ctk.sinlimcon.vo.UserVo;
import com.ctk.sinlimcon.vo.DesignVo;
import com.ctk.sinlimcon.vo.PictureVo;


@Service("designService")
public class DesignService {
	
	@Autowired
	DesignDao designdao;
	@Autowired
	UserDao userdao;
	@Autowired
	PictureDao picturedao;
	
	public Object getDesignList(String index) {
		System.out.println(index);
		if (index==null) {
			return designdao.readAll();
		} else {
			int intIndex=Integer.parseInt(index);
			intIndex=intIndex*10;
			//to-do 올바른 인덱스가 들어오지 않았을 떄 처리 필요
			return designdao.readByIndex(intIndex);
		}
	}
	
	public Object getDesign(String designid) {
		DesignVo temp=designdao.getDesign(designid);
		String userId=temp.getUserid();
		UserVo temp2=userdao.getUser(userId);
		List<PictureVo> temp3=picturedao.getDesign(temp.getDesignid());
		HashMap<String, Object> temp4=new HashMap<>();
		temp4.put("design", temp);
		temp4.put("user", temp2);
		temp4.put("picture", temp3);
		return temp4;
	}

	public Object postDesign(DesignVo design) {
		designdao.postDesign(design);
		return null;
	}

	public void deleteDesign(String designid) {
		designdao.deleteDesign(designid);
	}


	public void putDesign(String designid, DesignVo design) {
		designdao.putDesign(designid,design);
	}

	public int getDesignNumber() {
		
		int res=designdao.getDesignNumber();
		return res;
	}
}