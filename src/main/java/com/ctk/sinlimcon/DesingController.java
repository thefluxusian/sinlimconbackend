package com.ctk.sinlimcon;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	public HashMap<String, Object> getDesignList(@RequestParam(value="userId",required=false) String userId) {
		HashMap<String, Object> result = new HashMap<>();
		HashMap<String, Object> header = new HashMap<>();
		HashMap<String, Object> body = new HashMap<>();

		try {
			Object userList = designService.getDesignList(userId);
			header.put("returnCode", 200);
			header.put("returnDesc", "정상적으로 처리되었습니다.");
			result.put("header", header);
			result.put("body", userList);
		} catch (Exception e) {
			e.getMessage();
		}
		return result;
	}



}
