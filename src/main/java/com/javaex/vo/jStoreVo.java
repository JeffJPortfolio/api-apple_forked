package com.javaex.vo;

public class jStoreVo {
    private int storeNum;
    private String storeName;
    private String storeAddress;
    private String storeNumber;
    private String storeImage;

    // Constructor
    public jStoreVo() {
    }

    public jStoreVo(int storeNum, String storeName, String storeAddress, String storeNumber, String storeImage) {
        this.storeNum = storeNum;
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.storeNumber = storeNumber;
        this.storeImage = storeImage;
    }

    // Getters and Setters
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

    // Override toString for easy debugging
    @Override
    public String toString() {
        return "jStoreVo{" +
                "storeNum=" + storeNum +
                ", storeName='" + storeName + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", storeNumber='" + storeNumber + '\'' +
                ", storeImage='" + storeImage + '\'' +
                '}';
    }
}

