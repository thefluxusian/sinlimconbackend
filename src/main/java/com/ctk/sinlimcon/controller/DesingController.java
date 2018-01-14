package com.ctk.sinlimcon.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ctk.sinlimcon.service.DesignService;
import com.ctk.sinlimcon.vo.DesignVo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class DesingController {

	@Autowired
	private DesignService designService;

	@RequestMapping(value = "/designs", method = RequestMethod.GET)
	@ResponseBody
	public HashMap<String, Object> getDesignList(@RequestParam(value = "userId", required = false) String userId) {
		HashMap<String, Object> result = new HashMap<>();

		try {
			Object userList = designService.getDesignList(userId);
			result.put("designs", userList);
		} catch (Exception e) {
			e.getMessage();
		}
		return result;
	}
	
	@RequestMapping(value = "/designs", method = RequestMethod.POST)
	@ResponseBody
	public HashMap<String, Object> postDesign(@RequestBody DesignVo design) {
		HashMap<String, Object> result = new HashMap<>();

		try {
			Object userList = designService.postDesign(design);
		} catch (Exception e) {
			e.getMessage();
		}
		return result;
	}

}
