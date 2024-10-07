package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.MainDao;
import com.javaex.vo.unionVo;

@Service
public class MainService {
	
	@Autowired
	private MainDao maindao;
	
	public List<unionVo> getProProducts() {
        return maindao.getProProducts();
    }

    public List<unionVo> getRegularProducts() {
        return maindao.getRegularProducts();
    }

    public List<unionVo> getSEModels() {
        return maindao.getSEModels();
    }
	
	
	
	public List<unionVo> searchProducts(String keyword) {
		return maindao.searchProducts(keyword);
	}
	
	public List<unionVo> searchStores(String keyword) {
		return maindao.searchStores(keyword);
	}
	
	public List<unionVo> searchCommunities(String keyword) {
		return maindao.searchCommunities(keyword);
	}
}