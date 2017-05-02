package com.sec.mybatis.dao;

import com.sec.mybatis.model.LmNews;

import java.util.List;



public interface LmNewsMapper {
	
	LmNews selectByPrimaryKey(Integer id);
	
	int deleteByPrimaryKey(Integer id);
	
	int insertSelective(LmNews lmNews);
	
	int updateByPrimaryKeySelective(LmNews lmNews);
	
	List<LmNews> getNewsList(LmNews lmNews);
	
	int newsDel(Integer id);
}
