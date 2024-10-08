package com.javaex.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.javaex.dao.AdminDao;
import com.javaex.vo.StoreVo;
import com.javaex.vo.jStoreVo;
import com.javaex.vo.unionVo;

@Service
public class AdminService {

    @Autowired
    private AdminDao adminDao;
    //현오
    public List<jStoreVo> exeStoreList() {
		System.out.println("AdminService.exeStoreList()");

		List<jStoreVo> storeList = adminDao.storeSelectList();

		return storeList;
	}
    //스토어 삭제
    public int  exeDeleteStore(StoreVo storeVo) {
		System.out.println("AdminService.exeDeleteStore(storeVo)");

		int count = adminDao.deleteStore(storeVo);

		return count;
	}
	
	public List<unionVo> exeUserList() {
		System.out.println("AdminService.exeUserList()");

		List<unionVo> userList = adminDao.userSelectList();

		return userList;
	}
	//유저 삭제
    public int  exeDeleteUser(unionVo unionVo) {
		System.out.println("AdminService.exeDeleteUser(storeVo)");

		int count = adminDao.deleteUser(unionVo);

		return count;
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
	
	
	
	
	//등록
	//상점 사진
	public int exeStoreUpload(StoreVo attachVo) {
		System.out.println("AttachService.upload()");

		MultipartFile  file = attachVo.getImg();

		// 파일저장 경로 변수
		String saveDir;

		String osName = System.getProperty("os.name").toLowerCase();

		// 사진에 기본정보로 우리가 관리할 정보를 뽑아내야한다 --> db저장
		// 파일 저장 폴더
		if (osName.contains("linux")) {
			System.out.println("리눅스");
			//saveDir = "/home/ec2-user/upload"; // 아래에서 File.separator로 os를 판단해서 \\인지 /인지 넣어주기때문에 끝에 /를 넣을 필요가 없음
			saveDir = "/app/upload";
		} else {
			System.out.println("윈도우");
			saveDir = "C:\\javaStudy\\upload";
		}

		// 오리지널 파일명
		String orgName = file.getOriginalFilename();
		System.out.println("orgName: " + orgName);

		// 확장자
		String exeName = orgName.substring(orgName.lastIndexOf("."));
		System.out.println("exeName: " + exeName);


		// 저장파일명(겹치지 않아야 한다)
		String saveName = System.currentTimeMillis() + UUID.randomUUID().toString() + exeName;
		System.out.println("saveName: " + saveName);

		String filePath = saveDir + File.separator + saveName; // os를 판단해서 \\인지 /인지 넣어줌
		System.out.println("filePath: " + filePath);

		// (1) DB 저장
		// (1-1) 데이터 묶기
		
		attachVo.setStoreImage(saveName);


		System.out.println("StoreVo: " + attachVo);

		int count = adminDao.insertStore(attachVo);

		// 사진을 서버의 하드디스크에 복사해야된다
		// 파일 저장
		try {
			byte[] fileData = file.getBytes();
			OutputStream os = new FileOutputStream(filePath);
			BufferedOutputStream bos = new BufferedOutputStream(os);

			bos.write(fileData);
			bos.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return count; // 시간 + uuid + .jpg

	}
    //상점 수정
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 /*-------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	   
    /* 시리즈 등록 */
    public int exeAddSeries(unionVo unionVo) {
		System.out.println("AdminService.exeAddSeries()");
		
		int count = adminDao.insertSeries(unionVo);
		
		return count;
	}
    
    /* 상품 등록 */
    public int exeAddProduct(unionVo unionVo) {
        System.out.println("AdminService.exeAddProduct()");

        // 제품 등록 로직
        return adminDao.insertProduct(unionVo);
    }
    
    /* 색상 등록 */
    public int exeAddColor(unionVo unionVo) {
		System.out.println("AdminService.exeAddColor()");
		
		int count = adminDao.insertColor(unionVo);
		
		return count;
	}
    
    /* 디스플레이 등록 */
    public int exeAddDisplay(unionVo unionVo) {
		System.out.println("AdminService.exeAddDisplay()");
		
		int count = adminDao.insertDisplay(unionVo);
		
		return count;
	}
    
    /* 용량 등록 */
    public int exeAddStorage(unionVo unionVo) {
		System.out.println("AdminService.exeAddStorage()");
		
		int count = adminDao.insertStorage(unionVo);
		
		return count;
	}
    
    /* 파일 저장 후 파일명 반환 */
    public String exeUpload(MultipartFile file) {
        System.out.println("AdminService.exeUpload()");

        // 파일 저장 경로 설정
        String saveDir;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("linux")) {
            saveDir = "/app/upload";
        } else {
            saveDir = "C:\\javaStudy\\upload";
        }

        // 오리지널 파일명
        String orgName = file.getOriginalFilename();
        System.out.println("Original File Name: " + orgName);

        // 확장자 추출
        String exeName = orgName.substring(orgName.lastIndexOf("."));
        System.out.println("Extension: " + exeName);

        // 저장 파일명 (UUID로 중복 방지)
        String saveName = System.currentTimeMillis() + UUID.randomUUID().toString() + exeName;
        System.out.println("Save Name: " + saveName);

        // 파일 전체 경로 + 파일명
        String filePath = saveDir + File.separator + saveName;
        System.out.println("File Path: " + filePath);

        // 파일을 실제로 디스크에 저장
        try {
            byte[] fileData = file.getBytes();
            OutputStream os = new FileOutputStream(filePath);
            BufferedOutputStream bos = new BufferedOutputStream(os);
            bos.write(fileData);
            bos.close();
        } catch (Exception e) {
            System.out.println("파일 저장 중 오류: " + e.getMessage());
            return null;
        }

        // 저장된 파일명 반환
        return orgName;
    }
    
    /* 시리즈 가져오기 */
    public List<unionVo> exeGetSeriesList() {
		System.out.println("AdminService.exeGetSeriesList()");
		
		List<unionVo> seriesList = adminDao.getSeriesList();
		System.out.println(seriesList);
		return seriesList;
	}
    
    /* 상품명 가져오기 */
    public List<unionVo> exeGetProductList(int seriesNum) {
		System.out.println("AdminService.exeGetProductList()");
		
		List<unionVo> productList = adminDao.getProductList(seriesNum);
		
		return productList;
	}
    
    /* 색싱 가져오기 */
    public List<unionVo> exeGetColorList(int seriesNum) {
		System.out.println("AdminService.exeGetColorList()");
		
		List<unionVo> colorList = adminDao.getColorList(seriesNum);
		
		return colorList;
	}
    
    /* 디스플레이 가져오기 */
    public List<unionVo> exeGetDisplayList(int seriesNum) {
		System.out.println("AdminService.exeGetDisplayList()");
		
		List<unionVo> displayList = adminDao.getDisplayList(seriesNum);
		
		return displayList;
	}
    
    /* 용량 가져오기 */
    public List<unionVo> exeGetStorageList(int seriesNum) {
		System.out.println("AdminService.exeGetStorageList()");
		
		List<unionVo> storageList = adminDao.getStorageList(seriesNum);
		
		return storageList;
	}
}
