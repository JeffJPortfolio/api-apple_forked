package com.javaex.vo;

public class jProductVo {
    private int productNum;

    private int colorNum;
    private String colorName;
    private String colorCode;

    private int displayNum;
    private String displaySize;

    private int storageNum;
    private String storageSize;

    private int productDetailNum;
    private int productPrice;
    private String productName;

    private int infoImageNum;
    private String infoImageSavedName;
    private int infoImagePrimary; // Changed to int to reflect database schema

    // Default constructor
    public jProductVo() {
    }

    // Parameterized constructor
    public jProductVo(int productNum, int colorNum, String colorName, String colorCode, 
                      int displayNum, String displaySize, int storageNum, String storageSize,
                      int productDetailNum, int productPrice, String productName, 
                      int infoImageNum, String infoImageSavedName, int infoImagePrimary) { // Adjusted infoImagePrimary to int
        this.productNum = productNum;
        this.colorNum = colorNum;
        this.colorName = colorName;
        this.colorCode = colorCode;
        this.displayNum = displayNum;
        this.displaySize = displaySize;
        this.storageNum = storageNum;
        this.storageSize = storageSize;
        this.productDetailNum = productDetailNum;
        this.productPrice = productPrice;
        this.productName = productName;
        this.infoImageNum = infoImageNum;
        this.infoImageSavedName = infoImageSavedName;
        this.infoImagePrimary = infoImagePrimary; // Adjusted infoImagePrimary to int
    }

    // Getters and Setters
    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getInfoImageNum() {
        return infoImageNum;
    }

    public void setInfoImageNum(int infoImageNum) {
        this.infoImageNum = infoImageNum;
    }

    public String getInfoImageSavedName() {
        return infoImageSavedName;
    }

    public void setInfoImageSavedName(String infoImageSavedName) {
        this.infoImageSavedName = infoImageSavedName;
    }

    public int getInfoImagePrimary() { // Adjusted to int
        return infoImagePrimary;
    }

    public void setInfoImagePrimary(int infoImagePrimary) { // Adjusted to int
        this.infoImagePrimary = infoImagePrimary;
    }

    @Override
    public String toString() {
        return "jProductVo{" +
                "productNum=" + productNum +
                ", colorNum=" + colorNum +
                ", colorName='" + colorName + '\'' +
                ", colorCode='" + colorCode + '\'' +
                ", displayNum=" + displayNum +
                ", displaySize='" + displaySize + '\'' +
                ", storageNum=" + storageNum +
                ", storageSize='" + storageSize + '\'' +
                ", productDetailNum=" + productDetailNum +
                ", productPrice=" + productPrice +
                ", productName='" + productName + '\'' +
                ", infoImageNum=" + infoImageNum +
                ", infoImageSavedName='" + infoImageSavedName + '\'' +
                ", infoImagePrimary=" + infoImagePrimary +
                '}';
    }
}
