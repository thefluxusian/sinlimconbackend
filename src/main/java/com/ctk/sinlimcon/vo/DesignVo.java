package com.ctk.sinlimcon.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DesignVo {

	private String designid;
	private String designname;
	private String userid;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss",timezone="Asia/Seoul")
	private Date firstuploadtime;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss",timezone="Asia/Seoul")
	private Date lastupdatetime;
	private int price;
	private String picturesrc;
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

	@Override
	public String toString() {
		return "DesignVo [designid=" + designid + ", designname=" + designname + ", userid=" + userid
				+ ", firstuploadtime=" + firstuploadtime + ", lastupdatetime=" + lastupdatetime + ", price=" + price
				+ ", summary=" + summary + "]";
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
	
	public String getPicturesrc() {
		return picturesrc;
	}

	public void setPicturesrc(String picturesrc) {
		this.picturesrc = picturesrc;
	}


}
