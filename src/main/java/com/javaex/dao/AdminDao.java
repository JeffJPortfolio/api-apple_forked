package com.javaex.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.StoreVo;
import com.javaex.vo.jProductVo;
import com.javaex.vo.jStoreVo;
import com.javaex.vo.unionVo;

@Repository
public class AdminDao {

    @Autowired
    private SqlSession sqlSession;
    //현오
 // 전체 리스트
    //product
 	public List<jProductVo> productSelectList() {
 		System.out.println("AdminDao.productSelectList()");

 		List<jProductVo> productList = sqlSession.selectList("admin.productSelectList");

 		return productList;
 	}
    
    
 	public List<jStoreVo> storeSelectList() {
 		System.out.println("AdminDao.storeSelectList()");

 		List<jStoreVo> storeList = sqlSession.selectList("admin.storeSelectList");

 		return storeList;
 	}
 	//스토어 폐업처리
 	public int deleteStore(StoreVo storeVo) {
 		System.out.println("AdminDao.deleteStore()");

 		int count = sqlSession.update("admin.storeDelete", storeVo);

 		return count;
 	}
 	//스토어 추가
 	public int insertStore(StoreVo storeVo) {
 		System.out.println("AdminDao.insertStore()");
 		
 		int count = sqlSession.insert("admin.insertStore", storeVo);
 		return count;
 	}
 	
 	
 	public List<unionVo> userSelectList() {
 		System.out.println("AdminDao.userSelectList()");

 		List<unionVo> userList = sqlSession.selectList("admin.userSelectList");

 		return userList;
 	}
 	//유저 삭제
 	public int deleteUser(unionVo unionVo) {
 		System.out.println("AdminDao.deleteUser()");

 		int count = sqlSession.update("admin.userDelete", unionVo);

 		return count;
 	}
 	
 	
 	public List<unionVo> deliverySelectList() {
 		System.out.println("AdminDao.deliverySelectList()");

 		List<unionVo> deliveryList = sqlSession.selectList("admin.deliverySelectList");

 		return deliveryList;
 	}
 	
 	public List<unionVo> historySelectList() {
 		System.out.println("AdminDao.historySelectList()");

 		List<unionVo> historyList = sqlSession.selectList("admin.historySelectList");

 		return historyList;
 	}
    
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
	 /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /* 시리즈 등록 */
    public int insertSeries(unionVo unionVo) {
    	System.out.println("AdminService.exeAddSeries()");
		
		int count = sqlSession.insert("admin.seriesInsert", unionVo);
		
		return count;
	}
    
    /* 상품 등록 */
    public int insertProduct(unionVo unionVo) {
        System.out.println("AdminDao.insertProduct()");
        
        return sqlSession.insert("admin.productInsert", unionVo);
    }
    
    /* 색상 등록 */
    public int insertColor(unionVo unionVo) {
    	System.out.println("AdminService.insertColor()");
		
		int count = sqlSession.insert("admin.colorInsert", unionVo);
		
		return count;
	}
    
    /* 디스플레이 등록 */
    public int insertDisplay(unionVo unionVo) {
    	System.out.println("AdminService.insertDisplay()");
		
		int count = sqlSession.insert("admin.displayInsert", unionVo);
		
		return count;
	}
    
    /* 용량 등록 */
    public int insertStorage(unionVo unionVo) {
    	System.out.println("AdminService.insertStorage()");
		
		int count = sqlSession.insert("admin.storageInsert", unionVo);
		
		return count;
	}
    
    /* 시리즈 가져오기 */
    public List<unionVo> getSeriesList() {
		System.out.println("AdminService.getSeriesList()");
		
		List<unionVo> seriesList = sqlSession.selectList("admin.selectSeriesList");
		
		return seriesList;
	}
    
    /* 상품명 가져오기 */
    public List<unionVo> getProductList(int seriesNum) {
		System.out.println("AdminService.getProductList()");
		
		List<unionVo> productList = sqlSession.selectList("admin.selectProductList", seriesNum);
		
		return productList;
	}
    
    /* 색상 가져오기 */
    public List<unionVo> getColorList(int seriesNum) {
		System.out.println("AdminService.getColorList()");
		
		List<unionVo> colorList = sqlSession.selectList("admin.selectColorList", seriesNum);
		
		return colorList;
	}
    
    /* 디스플레이 가져오기 */
    public List<unionVo> getDisplayList(int seriesNum) {
		System.out.println("AdminService.getDisplayList()");
		
		List<unionVo> displayList = sqlSession.selectList("admin.selectDisplayList", seriesNum);
		
		return displayList;
	}
    
    /* 용량 가져오기 */
    public List<unionVo> getStorageList(int seriesNum) {
		System.out.println("AdminService.getStorageList()");
		
		List<unionVo> storageList = sqlSession.selectList("admin.selectStroageList", seriesNum);
		
		return storageList;
	}
}