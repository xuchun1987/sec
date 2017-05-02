package com.sec.bean;

import java.io.Serializable;

public class Page implements Serializable {

	private static final long serialVersionUID = 205140053441862902L;
	
	private Integer page=0;
	
	private Integer rows=10;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}
	
	

}
