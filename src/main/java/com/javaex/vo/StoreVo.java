package com.javaex.vo;

import org.springframework.web.multipart.MultipartFile;

public class StoreVo {

    // Fields
    private int storeNum;
    private String orgName;
    private String saveName;
    private MultipartFile img;
    private String storeName;
    private String storeAddress;
    private String storeNumber;
    private String storeImage;
    private String storageMapImage;
    private String storeStatus;  // New field

    // Constructor
    public StoreVo() {
    }

    public StoreVo(int storeNum, String orgName, String saveName, MultipartFile img, String storeName,
                   String storeAddress, String storeNumber, String storeImage, String storageMapImage, String storeStatus) {
        this.storeNum = storeNum;
        this.orgName = orgName;
        this.saveName = saveName;
        this.img = img;
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.storeNumber = storeNumber;
        this.storeImage = storeImage;
        this.storageMapImage = storageMapImage;
        this.storeStatus = storeStatus;  // New field
    }

    // Getters and Setters
    public int getStoreNum() {
        return storeNum;
    }

    public void setStoreNum(int storeNum) {
        this.storeNum = storeNum;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getSaveName() {
        return saveName;
    }

    public void setSaveName(String saveName) {
        this.saveName = saveName;
    }

    public MultipartFile getImg() {
        return img;
    }

    public void setImg(MultipartFile img) {
        this.img = img;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(String storeNumber) {
        this.storeNumber = storeNumber;
    }

    public String getStoreImage() {
        return storeImage;
    }

    public void setStoreImage(String storeImage) {
        this.storeImage = storeImage;
    }

    public String getStorageMapImage() {
        return storageMapImage;
    }

    public void setStorageMapImage(String storageMapImage) {
        this.storageMapImage = storageMapImage;
    }

    public String getStoreStatus() {
        return storeStatus;
    }

    public void setStoreStatus(String storeStatus) {
        this.storeStatus = storeStatus;
    }

    // toString Method
    @Override
    public String toString() {
        return "StoreVo [storeNum=" + storeNum + ", orgName=" + orgName + ", saveName=" + saveName + ", img=" + img
                + ", storeName=" + storeName + ", storeAddress=" + storeAddress + ", storeNumber=" + storeNumber
                + ", storeImage=" + storeImage + ", storageMapImage=" + storageMapImage + ", storeStatus=" + storeStatus + "]";
    }
}
