package com.ctk.sinlimcon.vo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UserVo {
	private String userId;
	private String profileimageUrl;
	private String email;
	private String password;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = "Asia/Seoul")
	private Date createTime;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = "Asia/Seoul")
	private Date birthDate;
	private List<DesignVo> design;
	private List<BuyHistoryVo> buyHistory;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProfileimageUrl() {
		return profileimageUrl;
	}

	public void setProfileimageUrl(String profileimageUrl) {
		this.profileimageUrl = profileimageUrl;
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
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public List<DesignVo> getDesign() {
		return design;
	}

	public void setDesign(List<DesignVo> design) {
		this.design = design;
	}

	public List<BuyHistoryVo> getBuyHistory() {
		return buyHistory;
	}

	public void setBuyHistory(List<BuyHistoryVo> buyHistory) {
		this.buyHistory = buyHistory;
	}

}
