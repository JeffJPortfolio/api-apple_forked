package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.unionVo;

@Repository
public class MainDao {
	
	@Autowired
	private SqlSession sqlsession;
	
	public List<unionVo> getProProducts() {
        return sqlsession.selectList("main.getProProducts");
    }

    public List<unionVo> getRegularProducts() {
        return sqlsession.selectList("main.getRegularProducts");
    }

    public List<unionVo> getSEModels() {
        return sqlsession.selectList("main.getSEModels");
    }
	
	public List<unionVo> searchProducts(String keyword) {
		String searchQuery = "%" + keyword + "%"; 
		return sqlsession.selectList("main.searchProducts", searchQuery);
	}
	
	public List<unionVo> searchStores(String keyword) {
		String searchQuery = "%" + keyword + "%"; 
		return sqlsession.selectList("main.searchStores", searchQuery);
	}
	
	public List<unionVo> searchCommunities(String keyword) {
		String searchQuery = "%" + keyword + "%"; 
		return sqlsession.selectList("main.searchCommunities", searchQuery);
	}
}
