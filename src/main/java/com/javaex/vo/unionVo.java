package com.javaex.vo;

import org.springframework.web.multipart.MultipartFile;

public class unionVo {

	private int userNum;
	private String userId;
	private String password;
	private String name;
	private String phoneNumber;
	private String address;

	private int storeNum;
	private String storeName;
	private String storeaddress;
	private String storeNumber; // 매장전화번호
	private MultipartFile storeImage;

	private int seriesNum;
	private String seriesName;

	private int productNum;
	private String productName;
	private MultipartFile mainImages;

	private int productDetailNum;
	private int productPrice;

	private int colorNum;
	private String colorName;
	private String colorCode;

	private int displayNum;
	private String displaySize;

	private int storageNum;
	private String storageSize;

	private int cartNum;
	private int productCount;

	private int boardNum;
	private String boardContent;
	private String boardTitle;
	private int boardViews;
	private String boardDate;

	private int commentNum;
	private String comment;
	private String commentDateTime;

	private int receiptNum;
	private String purchasedDate;
	private String shippingAddress;
	private String shippingStatus;
	private int totalPrice;

	private int historyNum;
	private int purchasedNum; // 갯수

	private int imageNum;
	private String imageName;
	private MultipartFile imageSavedName;

	// 기본 생성자
	public unionVo() {
	}

	public unionVo(int userNum, String userId, String password, String name, String phoneNumber, String address,
			int storeNum, String storeName, String storeaddress, String storeNumber, MultipartFile storeImage,
			int seriesNum, String seriesName, int productNum, String productName, MultipartFile mainImages,
			int productDetailNum, int productPrice, int colorNum, String colorName, String colorCode, int displayNum,
			String displaySize, int storageNum, String storageSize, int cartNum, int productCount, int boardNum,
			String boardContent, String boardTitle, int boardViews, String boardDate, int commentNum, String comment,
			String commentDateTime, int receiptNum, String purchasedDate, String shippingAddress, String shippingStatus,
			int totalPrice, int historyNum, int purchasedNum, int imageNum, String imageName,
			MultipartFile imageSavedName) {
		this.userNum = userNum;
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.storeNum = storeNum;
		this.storeName = storeName;
		this.storeaddress = storeaddress;
		this.storeNumber = storeNumber;
		this.storeImage = storeImage;
		this.seriesNum = seriesNum;
		this.seriesName = seriesName;
		this.productNum = productNum;
		this.productName = productName;
		this.mainImages = mainImages;
		this.productDetailNum = productDetailNum;
		this.productPrice = productPrice;
		this.colorNum = colorNum;
		this.colorName = colorName;
		this.colorCode = colorCode;
		this.displayNum = displayNum;
		this.displaySize = displaySize;
		this.storageNum = storageNum;
		this.storageSize = storageSize;
		this.cartNum = cartNum;
		this.productCount = productCount;
		this.boardNum = boardNum;
		this.boardContent = boardContent;
		this.boardTitle = boardTitle;
		this.boardViews = boardViews;
		this.boardDate = boardDate;
		this.commentNum = commentNum;
		this.comment = comment;
		this.commentDateTime = commentDateTime;
		this.receiptNum = receiptNum;
		this.purchasedDate = purchasedDate;
		this.shippingAddress = shippingAddress;
		this.shippingStatus = shippingStatus;
		this.totalPrice = totalPrice;
		this.historyNum = historyNum;
		this.purchasedNum = purchasedNum;
		this.imageNum = imageNum;
		this.imageName = imageName;
		this.imageSavedName = imageSavedName;
	}

	public int getUserNum() {
		return userNum;
	}

	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getStoreNum() {
		return storeNum;
	}

	public void setStoreNum(int storeNum) {
		this.storeNum = storeNum;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreaddress() {
		return storeaddress;
	}

	public void setStoreaddress(String storeaddress) {
		this.storeaddress = storeaddress;
	}

	public String getStoreNumber() {
		return storeNumber;
	}

	public void setStoreNumber(String storeNumber) {
		this.storeNumber = storeNumber;
	}

	public MultipartFile getStoreImage() {
		return storeImage;
	}

	public void setStoreImage(MultipartFile storeImage) {
		this.storeImage = storeImage;
	}

	public int getSeriesNum() {
		return seriesNum;
	}

	public void setSeriesNum(int seriesNum) {
		this.seriesNum = seriesNum;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public int getProductNum() {
		return productNum;
	}

	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public MultipartFile getMainImages() {
		return mainImages;
	}

	public void setMainImages(MultipartFile mainImages) {
		this.mainImages = mainImages;
	}

	public int getProductDetailNum() {
		return productDetailNum;
	}

	public void setProductDetailNum(int productDetailNum) {
		this.productDetailNum = productDetailNum;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getColorNum() {
		return colorNum;
	}

	public void setColorNum(int colorNum) {
		this.colorNum = colorNum;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public String getColorCode() {
		return colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

	public int getDisplayNum() {
		return displayNum;
	}

	public void setDisplayNum(int displayNum) {
		this.displayNum = displayNum;
	}

	public String getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(String displaySize) {
		this.displaySize = displaySize;
	}

	public int getStorageNum() {
		return storageNum;
	}

	public void setStorageNum(int storageNum) {
		this.storageNum = storageNum;
	}

	public String getStorageSize() {
		return storageSize;
	}

	public void setStorageSize(String storageSize) {
		this.storageSize = storageSize;
	}

	public int getCartNum() {
		return cartNum;
	}

	public void setCartNum(int cartNum) {
		this.cartNum = cartNum;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public int getBoardViews() {
		return boardViews;
	}

	public void setBoardViews(int boardViews) {
		this.boardViews = boardViews;
	}

	public String getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}

	public int getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCommentDateTime() {
		return commentDateTime;
	}

	public void setCommentDateTime(String commentDateTime) {
		this.commentDateTime = commentDateTime;
	}

	public int getReceiptNum() {
		return receiptNum;
	}

	public void setReceiptNum(int receiptNum) {
		this.receiptNum = receiptNum;
	}

	public String getPurchasedDate() {
		return purchasedDate;
	}

	public void setPurchasedDate(String purchasedDate) {
		this.purchasedDate = purchasedDate;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getShippingStatus() {
		return shippingStatus;
	}

	public void setShippingStatus(String shippingStatus) {
		this.shippingStatus = shippingStatus;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getHistoryNum() {
		return historyNum;
	}

	public void setHistoryNum(int historyNum) {
		this.historyNum = historyNum;
	}

	public int getPurchasedNum() {
		return purchasedNum;
	}

	public void setPurchasedNum(int purchasedNum) {
		this.purchasedNum = purchasedNum;
	}

	public int getImageNum() {
		return imageNum;
	}

	public void setImageNum(int imageNum) {
		this.imageNum = imageNum;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public MultipartFile getImageSavedName() {
		return imageSavedName;
	}

	public void setImageSavedName(MultipartFile imageSavedName) {
		this.imageSavedName = imageSavedName;
	}

}
