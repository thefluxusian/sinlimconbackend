package com.ctk.sinlimcon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctk.sinlimcom.dao.DesignDao;
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
}