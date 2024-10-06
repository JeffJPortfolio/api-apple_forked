package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.jStoreVo;
import com.javaex.vo.unionVo;

@Repository
public class AdminDao {
	@Autowired
	private SqlSession sqlSession;

	// 전체 리스트
	public List<jStoreVo> storeSelectList() {
		System.out.println("AdminDao.storeSelectList()");

		List<jStoreVo> storeList = sqlSession.selectList("admin.storeSelectList");

		return storeList;
	}
	
	public List<unionVo> userSelectList() {
		System.out.println("AdminDao.userSelectList()");

		List<unionVo> userList = sqlSession.selectList("admin.userSelectList");

		return userList;
	}
}
