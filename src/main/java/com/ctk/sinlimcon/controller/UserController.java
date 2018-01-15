package com.ctk.sinlimcon.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ctk.sinlimcon.service.PictureService;
import com.ctk.sinlimcon.service.UserService;
import com.ctk.sinlimcon.vo.PictureVo;

public class UserController {
	@Autowired
	private UserService userservice;

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	@ResponseBody
	public HashMap<String, Object> getUsers(@PathVariable String designId) {
		return null;
	}

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	@ResponseBody
	public Object postUsers(@PathVariable String designid, @RequestBody PictureVo picture) {
		return null;
	}

	@RequestMapping(value = "/users/{userid}", method = RequestMethod.GET)
	@ResponseBody
	public HashMap<String, Object> getUser(@PathVariable String designId) {
		return null;
	}

	@RequestMapping(value = "/users/{userid}", method = RequestMethod.PUT)
	@ResponseBody
	public HashMap<String, Object> putUser(@PathVariable String designId) {
		return null;
	}

	@RequestMapping(value = "/users/{userid}", method = RequestMethod.DELETE)
	@ResponseBody
	public HashMap<String, Object> deleteUser(@PathVariable String designId) {
		return null;
	}
}
