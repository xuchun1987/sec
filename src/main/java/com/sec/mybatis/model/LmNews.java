package com.sec.mybatis.model;

import com.sec.bean.Page;

import java.sql.Timestamp;



public class LmNews extends Page {

	private static final long serialVersionUID = 2613568196663253669L;
	
	private Integer id;
	
	private String title;
	
	private String depict;
	
	private String content;
	
	private String listPic;
	
	private Timestamp createTime;
	
	private String createTimeStr;
	
	private Integer status;
	
	

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



	public String getDepict() {
		return depict;
	}

	public void setDepict(String depict) {
		this.depict = depict;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getListPic() {
		return listPic;
	}

	public void setListPic(String listPic) {
		this.listPic = listPic;
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
