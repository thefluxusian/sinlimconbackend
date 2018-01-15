package com.ctk.sinlimcon.vo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UserVo {
	private String userid;
	private String profileimageurl;
	private String email;
	private String password;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = "Asia/Seoul")
	private Date createtime;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = "Asia/Seoul")
	private Date birthdate;
	private List<DesignVo> design;
	private List<BuyHistoryVo> buyhistory;

	public String getUserId() {
		return userid;
	}

	public void setUserId(String userId) {
		this.userid = userId;
	}

	public String getProfileimageUrl() {
		return profileimageurl;
	}

	public void setProfileimageUrl(String profileimageUrl) {
		this.profileimageurl = profileimageUrl;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateTime() {
		return createtime;
	}

	public void setCreateTime(Date createTime) {
		this.createtime = createTime;
	}

	public Date getBirthDate() {
		return birthdate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthdate = birthDate;
	}

	public List<DesignVo> getDesign() {
		return design;
	}

	public void setDesign(List<DesignVo> design) {
		this.design = design;
	}

	public List<BuyHistoryVo> getBuyHistory() {
		return buyhistory;
	}

	public void setBuyHistory(List<BuyHistoryVo> buyHistory) {
		this.buyhistory = buyHistory;
	}

}
