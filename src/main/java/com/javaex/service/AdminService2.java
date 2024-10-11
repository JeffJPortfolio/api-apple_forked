package com.javaex.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.AdminDao2;
import com.javaex.vo.StoreVo;
import com.javaex.vo.unionVo;

@Service
public class AdminService2 {

	@Autowired
	private AdminDao2 adminDao2;

	// 스토어 삭제
	public int exeDeleteStore(StoreVo storeVo) {
		System.out.println("AdminService.exeDeleteStore(storeVo)");

		int count = adminDao2.deleteStore(storeVo);

		return count;
	}

	public int exeDeleteUser(unionVo unionVo) {
		System.out.println("AdminService.exeDeleteUser(storeVo)");

		int count = adminDao2.deleteUser(unionVo);

		return count;
	}

	// delivery
	public List<unionVo> exeDeliveryList() {
		System.out.println("AdminService.exeDeliveryList()");

		List<unionVo> deliveryList = adminDao2.deliverySelectList();

		return deliveryList;
	}

	// 배송
	public int exeProductSent(unionVo unionVo) {
		System.out.println("AdminService.exeProductSent");

		int count = adminDao2.productSend(unionVo);

		return count;
	}

	public int exeProductArrived(unionVo unionVo) {
		System.out.println("AdminService.exeProductArrived");

		int count = adminDao2.productArrived(unionVo);

		return count;
	}

	// history
	public List<unionVo> exeHistoryList() {
		System.out.println("AdminService.exeHistoryList()");

		List<unionVo> historyList = adminDao2.historySelectList();

		return historyList;
	}

	public List<unionVo> exeProductList() {
		System.out.println("AdminService.exeProductList()");

		List<unionVo> productList = adminDao2.productSelectList();

		return productList;
	}
	
	//-----2024/10/10
	public StoreVo exeGetStoreSelectOne(int storeNum) {
		System.out.println("AdminService.getStoreSelectOne()");

		StoreVo storeVo = adminDao2.storeSelectOne(storeNum);

		return storeVo;
	}
	
	//-----------2024/10/11
	public Map<String, Object> exeGetStoreList2(int crtPage, String keyword) {
	    int listCnt = 2;
	    crtPage = (crtPage > 0) ? crtPage : 1;

	    int StartRowNo = (crtPage - 1) * listCnt;

	    Map<String, Object> limitMap = new HashMap<>();
	    limitMap.put("StartRowNo", StartRowNo);
	    limitMap.put("listCnt", listCnt);
	    limitMap.put("keyword", keyword);

	    List<StoreVo> storeVoList = adminDao2.getStoreList2(limitMap);

	    int pageBtnCount = 10;
	    int totalCnt = adminDao2.selectTotalCntKeyword(keyword);

	    int endPageBtnNo = (int) Math.ceil((crtPage / (double) pageBtnCount)) * pageBtnCount;
	    int startPageBtnNo = (endPageBtnNo - pageBtnCount) + 1;

	    boolean next = listCnt * endPageBtnNo < totalCnt;
	    if (!next) {
	        endPageBtnNo = (int) Math.ceil(totalCnt / (double) listCnt);
	    }

	    boolean prev = startPageBtnNo != 1;

	    Map<String, Object> pMap = new HashMap<>();
	    pMap.put("storeVoList", storeVoList);
	    pMap.put("prev", prev);
	    pMap.put("startPageBtnNo", startPageBtnNo);
	    pMap.put("endPageBtnNo", endPageBtnNo);
	    pMap.put("next", next);

	    return pMap;
	}

}
