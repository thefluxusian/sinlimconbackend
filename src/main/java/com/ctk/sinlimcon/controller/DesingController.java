package com.ctk.sinlimcon.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
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

	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/designsNumber", method = RequestMethod.GET)
	@ResponseBody
	public int getDesignNumber() {
		HashMap<String, Object> result = new HashMap<>();
		int designNumber=-1;
		try {
			 designNumber= designService.getDesignNumber();
			result.put("number", designNumber);
		} catch (Exception e) {
			e.getMessage();
		}
		return designNumber;
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/designs", method = RequestMethod.GET)
	@ResponseBody
	public Object getDesignList(@RequestParam(value = "index", required = false) String index,HttpServletResponse  response) {
		HashMap<String, Object> result = new HashMap<>();
 	    response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
		response.setStatus(200);
		Object designList=null;
		try {
			designList = designService.getDesignList(index);
			result.put("designs", designList);
		} catch (Exception e) {
			e.getMessage();
		}
		return result;
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/designs/{designid}", method = RequestMethod.GET)
	@ResponseBody
	public Object getDesign(@PathVariable String designid) {
		HashMap<String, Object> result = new HashMap<>();
		Object List=null;
		try {
			 List = designService.getDesign(designid);
		} catch (Exception e) {
			e.getMessage();
		}
		return List;
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/designs", method = RequestMethod.POST)
	@ResponseBody
	public HashMap<String, Object> postDesign(@RequestBody DesignVo design) {
		HashMap<String, Object> result = new HashMap<>();
		System.out.println(design.toString());
		try {
			Object userList = designService.postDesign(design);
		} catch (Exception e) {
			e.getMessage();
		}
		return result;
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/designs/{designid}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteDesign(@PathVariable String designid) {
			designService.deleteDesign(designid);
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/designs/{designid}", method = RequestMethod.PUT)
	@ResponseBody
	public Object putDesign(@PathVariable String designid,@RequestBody DesignVo design) {
		HashMap<String, Object> result = new HashMap<>();

		try {
			 designService.putDesign(designid,design);
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}

}
