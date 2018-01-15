package com.ctk.sinlimcon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctk.sinlimcon.dao.DesignDao;
import com.ctk.sinlimcon.vo.DesignVo;

@Service("designService")
public class DesignService {
	@Autowired
	DesignDao designdao;

	public Object getDesignList(String userId) {
		if (userId==null) {
			return designdao.readAll();
		} else {
			return designdao.read(userId);
		}
	}

	public Object postDesign(DesignVo design) {
		designdao.postDesign(design);
		return null;
	}

	public void deleteDesign(String designid) {
		designdao.deleteDesign(designid);
	}

	public Object getDesign(String designid) {
		return designdao.getDesign(designid);
	}

	public void putDesign(String designid, DesignVo design) {
		designdao.putDesign(designid,design);
	}
}