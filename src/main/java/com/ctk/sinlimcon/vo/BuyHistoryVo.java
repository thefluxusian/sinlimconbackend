package com.ctk.sinlimcon.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BuyHistoryVo {
	private String buyid;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss",timezone="Asia/Seoul")
	private Date buyday;
	private int numberofdownload;
	private String userid;
	private String designid;
	
	public String getBuyid() {
		return buyid;
	}
	public void setBuyid(String buyid) {
		this.buyid = buyid;
	}
	public Date getBuyday() {
		return buyday;
	}
	public void setBuyday(Date buyday) {
		this.buyday = buyday;
	}
	public int getNumberofdownload() {
		return numberofdownload;
	}
	public void setNumberofdownload(int numberofdownload) {
		this.numberofdownload = numberofdownload;
	}
	public String getUserId() {
		return userid;
	}
	public void setUserId(String userId) {
		this.userid = userId;
	}
	public String getDesignId() {
		return designid;
	}
	public void setDesignId(String designId) {
		this.designid = designId;
	}
	
	
}
