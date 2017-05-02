package com.sec.mybatis.dao;

import com.sec.mybatis.model.LmUsers;

import java.util.List;
import java.util.Map;



public interface LmUsersMapper {
	
	LmUsers selectByPrimaryKey(Integer id);
	
	int deleteByPrimaryKey(Integer id);
	
	int insertSelective(LmUsers lmUsers);
	
	int updateByPrimaryKeySelective(LmUsers lmUsers);
	
	List<LmUsers> getUsersList(LmUsers lmUsers);
	
	int getUsersListCount(LmUsers lmUsers);
	
	int usersDel(Integer id);
	
	LmUsers getUsersByUname(Map<String, Object> map);
	
	int isExistUname(Map<String, Object> map);
}
