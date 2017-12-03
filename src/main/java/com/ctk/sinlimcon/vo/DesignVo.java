package com.ctk.sinlimcon.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class DesignVo {
	
	private String designid;
	private String designname;
	private String userid;
	@DateTimeFormat(pattern = "YYYY-MM-DD HH:MM:SS")
	private Date firstuploadtime;
	@DateTimeFormat(pattern = "YYYY-MM-DD HH:MM:SS")	
	private Date lastupdatetime;
	private int price;
	private String summary;
	
	public String getDesignname() {
		return designname;
	}
	public void setDesignname(String designname) {
		this.designname = designname;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getDesignid() {
		return designid;
	}
	public void setDesignid(String designid) {
		this.designid = designid;
	}
	public Date getFirstuploadtime() {
		return firstuploadtime;
	}
	public void setFirstuploadtime(Date firstuploadtime) {
		this.firstuploadtime = firstuploadtime;
	}
	public Date getLastupdatetime() {
		return lastupdatetime;
	}
	public void setLastupdatetime(Date lastupdatetime) {
		this.lastupdatetime = lastupdatetime;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}

}
