package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.AdminService;
import com.javaex.util.JsonResult;
import com.javaex.util.JwtUtil;
import com.javaex.vo.jStoreVo;
import com.javaex.vo.unionVo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class AdminController implements ErrorController{
	
	 @Autowired
	    private AdminService adminService;
	 
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
	
}