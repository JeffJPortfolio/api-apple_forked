package com.javaex.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.javaex.service.AdminService;
import com.javaex.util.JsonResult;
import com.javaex.util.JwtUtil;
import com.javaex.vo.StoreVo;
import com.javaex.vo.jStoreVo;
import com.javaex.vo.unionVo;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;
	//현오
 	//상점
	//상점 리스트 전체
	@GetMapping("/api/admin/store")
	public JsonResult getStoreList() {
		System.out.println("AdminController.exeStoreList()");
		List<jStoreVo> storeList = adminService.exeStoreList();
		
		if(storeList != null) {
			return JsonResult.success(storeList);
		}else {
			return JsonResult.fail("데이터 없음");
		}
	}
	//상점 등록
	@PostMapping("/api/admin/store/add")
	public JsonResult storeAdd(@ModelAttribute StoreVo attachVo) {
		System.out.println("AttachController.storeAdd()");
		

		int count = adminService.exeStoreUpload(attachVo);
		
		if(count != 1) {
			return JsonResult.fail("등록에 실패했습니다.");
		}else {
			return JsonResult.success(count);
		}
	}
	//삭제
	/*
	 * @DeleteMapping("/api/boards/{no}") public JsonResult
	 * delBoard(@PathVariable("no") int no) {
	 * System.out.println("AdminController.delBoard()");
	 * 
	 * int count = boardService.exeDeleteBoard(no);
	 * 
	 * if (count != -1) { // 삭제 성공 return JsonResult.success(count); } else { // 삭제
	 * 실패 return JsonResult.fail("삭제 실패"); } }
	 */

	
	
	
	//유저
	//유저 리스트 전체
	@GetMapping("/api/admin/user")
	public JsonResult getUserList() {
		System.out.println("AdminController.exeUserList()");
		List<unionVo> userList = adminService.exeUserList();
		
		if(userList != null) {
			return JsonResult.success(userList);
		}else {
			return JsonResult.fail("데이터 없음");
		}
	}
	
	//배송관리 리스트 전체
	@GetMapping("/api/admin/dilivery")
	public JsonResult getDeliveryList() {
		System.out.println("AdminController.exeDeliveryList()");
		List<unionVo> deliveryList = adminService.exeDeliveryList();
		
		if(deliveryList != null) {
			return JsonResult.success(deliveryList);
		}else {
			return JsonResult.fail("데이터 없음");
		}
	}
	
	@GetMapping("/api/admin/history")
	public JsonResult getHistoryList() {
		System.out.println("AdminController.exeHistoryList()");
		List<unionVo> historyList = adminService.exeHistoryList();
		
		if(historyList != null) {
			return JsonResult.success(historyList);
		}else {
			return JsonResult.fail("데이터 없음");
		}
	}
	
	/*------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	/* 시리즈 등록 */
	@PostMapping("/api/add/series")
	public JsonResult addSeries(@RequestBody unionVo unionVo) {
		System.out.println("AdminController.addSeries()");

		int count = adminService.exeAddSeries(unionVo);
		
		if (count != 1) { // 등록 실패
			return JsonResult.fail("등록 실패");
		} else { // 등록 성공
			return JsonResult.success(count);
		}
	} 
	
	/* 색상 등록 */
	@PostMapping("/api/add/color")
	public JsonResult addColor(@RequestBody unionVo unionVo) {
		System.out.println("AdminController.addColor()");

		int count = adminService.exeAddColor(unionVo);
		
		if (count != 1) { // 등록 실패
			return JsonResult.fail("등록 실패");
		} else { // 등록 성공
			return JsonResult.success(count);
		}
	}
	
	/* 디스플레이 등록 */
	@PostMapping("/api/add/display")
	public JsonResult addDisplay(@RequestBody unionVo unionVo) {
		System.out.println("AdminController.addDisplay()");

		int count = adminService.exeAddDisplay(unionVo);
		
		if (count != 1) { // 등록 실패
			return JsonResult.fail("등록 실패");
		} else { // 등록 성공
			return JsonResult.success(count);
		}
	}
	
	/* 용량 등록 */
	@PostMapping("/api/add/storage")
	public JsonResult addStorage(@RequestBody unionVo unionVo) {
		System.out.println("AdminController.addStorage()");

		int count = adminService.exeAddStorage(unionVo);
		
		if (count != 1) { // 등록 실패
			return JsonResult.fail("등록 실패");
		} else { // 등록 성공
			return JsonResult.success(count);
		}
	}
	
	/* 상품명 + 본문 이미지 등록 */
//	@PostMapping("/api/add/product")
//	public JsonResult addProduct(
//	        @RequestPart("unionVo") unionVo unionVo, 
//	        @RequestPart("mainImages") List<MultipartFile> mainImages) {
//
//	    // 원본 파일명을 저장할 리스트
//	    List<String> orgFileNames = new ArrayList<>();
//
//	    // 여러 개의 파일을 순회하며 처리
//	    for (MultipartFile file : mainImages) {
//	        if (!file.isEmpty()) {
//	            // 파일 저장 및 원본 파일명 얻기
//	            String orgName = adminService.exeUpload(file);
//	            orgFileNames.add(orgName); // 각 파일명을 리스트에 추가
//	        }
//	    }
//
//	    // 각 파일을 데이터베이스에 저장
//	    int insertCount = 0;
//	    for (String orgName : orgFileNames) {
//	        // mainImages 필드에 각 파일의 원본 파일명 설정
//	        unionVo.setMainImages(orgName);
//
//	        // 각 파일에 대해 제품 등록 처리 (seriesNum 포함)
//	        insertCount += adminService.exeAddProduct(unionVo);
//	    }
//
//	    // 결과 반환
//	    if (insertCount != mainImages.size()) { // 등록된 파일 수가 맞지 않으면 실패
//	        return JsonResult.fail("등록 실패");
//	    } else {
//	        return JsonResult.success(insertCount);
//	    }
//	}
	
	/* 시리즈 가져오기 */
	@GetMapping("/api/series")
	public JsonResult getSeriesList() {
		System.out.println("AdminController.getSeriesList()");

		List<unionVo> seriesList = adminService.exeGetSeriesList();

		return JsonResult.success(seriesList);
	}
	
	/* 상품명 가져오기 */
	@GetMapping("/api/product/{seriesNum}")
	public JsonResult getProductList(@PathVariable("seriesNum") int seriesNum) {
		System.out.println("AdminController.getProductList()");
		System.err.println("시리즈번호:" +seriesNum);

		List<unionVo> productList = adminService.exeGetProductList(seriesNum);
		return JsonResult.success(productList);
	}
	
	/* 색상 가져오기 */
	@GetMapping("/api/color/{seriesNum}")
	public JsonResult getColorList(@PathVariable("seriesNum") int seriesNum) {
		System.out.println("AdminController.getColorList()");

		List<unionVo> colorList = adminService.exeGetColorList(seriesNum);

		return JsonResult.success(colorList);
	}
	
	/* 디스플레이 가져오기 */
	@GetMapping("/api/display/{seriesNum}")
	public JsonResult getDisplayList(@PathVariable("seriesNum") int seriesNum) {
		System.out.println("AdminController.getDisplayList()");

		List<unionVo> displayList = adminService.exeGetDisplayList(seriesNum);

		return JsonResult.success(displayList);
	}
	
	/* 용량 가져오기 */
	@GetMapping("/api/storage/{seriesNum}")
	public JsonResult getStorageList(@PathVariable("seriesNum") int seriesNum) {
		System.out.println("AdminController.getStorageList()");

		List<unionVo> storageList = adminService.exeGetStorageList(seriesNum);

		return JsonResult.success(storageList);
	}
	
	/* 기타 옵션 + 상세 이미지 등록 */
//	@PostMapping("/api/add/productDetail")
//	public JsonResult addProductDetail(
//	        @RequestPart("unionVo") unionVo unionVo, 
//	        @RequestPart("imageSavedName") List<MultipartFile> imageSavedName) {
//
//	    // 원본 파일명을 저장할 리스트
//	    List<String> orgFileNames = new ArrayList<>();
//
//	    // 여러 개의 파일을 순회하며 처리
//	    for (MultipartFile file : imageSavedName) {
//	        if (!file.isEmpty()) {
//	            // 파일 저장 및 원본 파일명 얻기
//	            String orgName = adminService.exeUpload(file);
//	            orgFileNames.add(orgName); // 각 파일명을 리스트에 추가
//	        }
//	    }
//
//	    // 각 파일을 데이터베이스에 저장
//	    int insertCount = 0;
//	    for (String orgName : orgFileNames) {
//	        // mainImages 필드에 각 파일의 원본 파일명 설정
//	        unionVo.setMainImages(orgName);
//
//	        // 각 파일에 대해 제품 등록 처리 (seriesNum 포함)
//	        insertCount += adminService.exeAddProduct(unionVo);
//	    }
//
//	    // 결과 반환
//	    if (insertCount != imageSavedName.size()) { // 등록된 파일 수가 맞지 않으면 실패
//	        return JsonResult.fail("등록 실패");
//	    } else {
//	        return JsonResult.success(insertCount);
//	    }
//	}

}
