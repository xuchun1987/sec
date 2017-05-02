package com.sec.mybatis.model;

import com.sec.bean.Page;

import java.sql.Timestamp;



public class LmUsers extends Page {

	private static final long serialVersionUID = -2174894196138415010L;

	private Integer id;
	
	private String uname;
	
	private String psd;
	
	private Timestamp createTime;
	
	private Integer status;
	
	private String createTimeStr;
	
	

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPsd() {
		return psd;
	}

	public void setPsd(String psd) {
		this.psd = psd;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
}
