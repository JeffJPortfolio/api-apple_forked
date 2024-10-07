package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.MainService;
import com.javaex.util.JsonResult;
import com.javaex.vo.unionVo;

@RestController
public class MainController {
	
	@Autowired
	private MainService mainservice;
	
	@GetMapping("api/main/products/pro")
    public JsonResult getProProducts() {
        List<unionVo> proProducts = mainservice.getProProducts();
        return JsonResult.success(proProducts);
    }

    @GetMapping("api/main/products/regular")
    public JsonResult getRegularProducts() {
        List<unionVo> regularProducts = mainservice.getRegularProducts();
        return JsonResult.success(regularProducts);
    }

    @GetMapping("api/main/products/se")
    public JsonResult getSEModels() {
        List<unionVo> seModels = mainservice.getSEModels();
        return JsonResult.success(seModels);
    }
	
	@GetMapping("api/search/products/{keyword}")
	public JsonResult searchProducts(@PathVariable String keyword) {
	    System.out.println("제품 검색어: " + keyword);
	    try {
	        List<unionVo> searchResults = mainservice.searchProducts(keyword);
	        System.out.println("검색된 제품 수: " + searchResults.size());
	        return JsonResult.success(searchResults);
	    } catch (Exception e) {
	        return JsonResult.fail("제품 검색 중 오류가 발생했습니다.");
	    }
	}
	
	@GetMapping("api/search/stores/{keyword}")
	public JsonResult searchStores(@PathVariable String keyword) {
	    System.out.println("매장 검색어: " + keyword);
	    try {
	        List<unionVo> searchResults = mainservice.searchStores(keyword);
	        System.out.println("검색된 매장 수: " + searchResults.size());
	        return JsonResult.success(searchResults);
	    } catch (Exception e) {
	        return JsonResult.fail("매장 검색 중 오류가 발생했습니다.");
	    }
	}

	@GetMapping("api/search/communities/{keyword}")
	public JsonResult searchCommunities(@PathVariable String keyword) {
	    System.out.println("커뮤니티 검색어: " + keyword);
	    try {
	        List<unionVo> searchResults = mainservice.searchCommunities(keyword);
	        System.out.println("검색된 커뮤니티 수: " + searchResults.size());
	        return JsonResult.success(searchResults);
	    } catch (Exception e) {
	        return JsonResult.fail("커뮤니티 검색 중 오류가 발생했습니다.");
	    }
	}

	
	
	
	
	
}
