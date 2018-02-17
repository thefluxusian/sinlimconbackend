package com.ctk.sinlimcon.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ctk.sinlimcon.service.PictureService;
import com.ctk.sinlimcon.vo.PictureVo;

public class PictureController {
	@Autowired
	private PictureService pictureservice;

	@RequestMapping(value = "/designs/{designId}/pictures", method = RequestMethod.GET)
	@ResponseBody
	public HashMap<String, Object> getDesignList(@PathVariable String designId) {
		Object pictureList = pictureservice.getPictureList(designId);
		HashMap<String, Object> result = new HashMap<>();
		result.put("pictures", pictureList);
		return result;
	}

	@RequestMapping(value = "/designs/{designid}/pictures", method = RequestMethod.POST)
	@ResponseBody
	public Object postPicture(@PathVariable String designid, @RequestBody PictureVo picture) {
		HashMap<String, Object> result = new HashMap<>();
		try {
			pictureservice.postPicture(designid, picture);
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}

	@RequestMapping(value = "/designs/{designid}/pictures/{pictureid}", method = RequestMethod.GET)
	@ResponseBody
	public HashMap<String, Object> getPicture(@PathVariable String designId) {
		return null;
	}

	@RequestMapping(value = "/designs/{designid}/pictures/{pictureid}", method = RequestMethod.PUT)
	@ResponseBody
	public HashMap<String, Object> putPicture(@PathVariable String designId) {
		return null;
	}

	@RequestMapping(value = "/designs/{designid}/pictures/{pictureid}", method = RequestMethod.DELETE)
	@ResponseBody
	public HashMap<String, Object> deletePicture(@PathVariable String designId) {
		return null;
	}
}
