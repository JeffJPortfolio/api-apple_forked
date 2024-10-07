package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.AdminDao;
import com.javaex.vo.jStoreVo;
import com.javaex.vo.unionVo;

@Service
public class AdminService {

	@Autowired
	private AdminDao adminDao;
	
	// 리스트
	public List<jStoreVo> exeStoreList() {
		System.out.println("AdminService.exeStoreList()");

		List<jStoreVo> storeList = adminDao.storeSelectList();

		return storeList;
	}
	
	public List<unionVo> exeUserList() {
		System.out.println("AdminService.exeUserList()");

		List<unionVo> userList = adminDao.userSelectList();

		return userList;
	}
	
	public List<unionVo> exeDeliveryList() {
		System.out.println("AdminService.exeDeliveryList()");

		List<unionVo> deliveryList = adminDao.deliverySelectList();

		return deliveryList;
	}
	
	public List<unionVo> exeHistoryList() {
		System.out.println("AdminService.exeHistoryList()");

		List<unionVo> historyList = adminDao.historySelectList();

		return historyList;
	}
}
