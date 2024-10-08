package com.javaex.vo;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public class unionVo {
    
    // Series
    private int seriesNum;
    private String seriesName;
    
    // User
    private int userNum;
    private String userId;
    private String userPw;
    private String userName;
    private String userAddress;
    private String userHp;
    private String userStatus;
    
    // Store
    private int storeNum;
    private String storeName;
    private String storeAddress;
    private String storeNumber;
    private String storeImage;
    private String storageMapImage;
    private String storeStatus;

    // Product
    private int productNum;
    private String productName;

    // Color
    private int colorNum;
    private String colorName;
    private String colorCode;

    // Display
    private int displayNum;
    private String displaySize;

    // Storage
    private int storageNum;
    private String storageSize;

    // Product Detail
    private int productDetailNum;
    private int productPrice;

    // Shopping Cart
    private int cartNum;

    // Community
    private int boardNum;
    private String boardContent;
    private String boardTitle;
    private int boardViews;
    private Date boardDate;

    // Comment
    private int commentNum;
    private String comment;
    private Date commentDateTime;

    // Receipt
    private int receiptNum;
    private Date purchasedDate;
    private String shippingAddress;
    private String shippingStatus;
    private int totalPrice;

    // History
    private int historyNum;
    private int productCount;

    // Product Image
    private int imageNum;
    private String imageSavedName;
    private String imageName;

    // Liked Product
    private int likedProductNum;

    // Info Image
    private int infoImageNum;
    private String infoImageSavedName;
    private int infoImagePrimary;

    // Getters and Setters
    // (for all fields)

    // toString() Method
    @Override
    public String toString() {
        return "UnionVo{" +
                "seriesNum=" + seriesNum +
                ", seriesName='" + seriesName + '\'' +
                ", userNum=" + userNum +
                ", userId='" + userId + '\'' +
                ", userPw='" + userPw + '\'' +
                ", userName='" + userName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userHp='" + userHp + '\'' +
                ", userStatus='" + userStatus + '\'' +
                ", storeNum=" + storeNum +
                ", storeName='" + storeName + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", storeNumber='" + storeNumber + '\'' +
                ", storeImage='" + storeImage + '\'' +
                ", storageMapImage='" + storageMapImage + '\'' +
                ", storeStatus='" + storeStatus + '\'' +
                ", productNum=" + productNum +
                ", productName='" + productName + '\'' +
                ", colorNum=" + colorNum +
                ", colorName='" + colorName + '\'' +
                ", colorCode='" + colorCode + '\'' +
                ", displayNum=" + displayNum +
                ", displaySize='" + displaySize + '\'' +
                ", storageNum=" + storageNum +
                ", storageSize='" + storageSize + '\'' +
                ", productDetailNum=" + productDetailNum +
                ", productPrice=" + productPrice +
                ", cartNum=" + cartNum +
                ", boardNum=" + boardNum +
                ", boardContent='" + boardContent + '\'' +
                ", boardTitle='" + boardTitle + '\'' +
                ", boardViews=" + boardViews +
                ", boardDate=" + boardDate +
                ", commentNum=" + commentNum +
                ", comment='" + comment + '\'' +
                ", commentDateTime=" + commentDateTime +
                ", receiptNum=" + receiptNum +
                ", purchasedDate=" + purchasedDate +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", shippingStatus='" + shippingStatus + '\'' +
                ", totalPrice=" + totalPrice +
                ", historyNum=" + historyNum +
                ", productCount=" + productCount +
                ", imageNum=" + imageNum +
                ", imageSavedName='" + imageSavedName + '\'' +
                ", imageName='" + imageName + '\'' +
                ", likedProductNum=" + likedProductNum +
                ", infoImageNum=" + infoImageNum +
                ", infoImageSavedName='" + infoImageSavedName + '\'' +
                ", infoImagePrimary=" + infoImagePrimary +
                '}';
    }

}