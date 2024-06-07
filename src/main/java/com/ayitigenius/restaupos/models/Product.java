package com.ayitigenius.restaupos.models;

import java.util.Date;

public class Product {
    private String code;
    private String name;
    private double price;
    private int quantity;
    private Date stockageDate;
    private Date expirationDate;
    private Category category;
    private String description;
    private String image;
    private double buyPrice;
    private double appliedTaxes;
    private double taxRate; // applied on selling process
    private boolean isResellable;

    Product (String code, String name, String description, Category category, String image, double buyPrice, double appliedTaxes, double taxRate, boolean isResellable) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.category = category;
        this.image = image;
        this.buyPrice = buyPrice;
        this.appliedTaxes = appliedTaxes;
        this.taxRate = taxRate;
        this.isResellable = isResellable;
        this.price = buyPrice;
        this.quantity = 0;
        this.stockageDate = new Date();
        this.expirationDate = new Date();
    }

    public Product(String code, String name, Category category, String description) {
        this.code = code;
        this.name = name;
        this.category = category;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getStockageDate() {
        return stockageDate;
    }

    public void setStockageDate(Date stockageDate) {
        this.stockageDate = stockageDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getAppliedTaxes() {
        return appliedTaxes;
    }

    public void setAppliedTaxes(double appliedTaxes) {
        this.appliedTaxes = appliedTaxes;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public boolean isResellable() {
        return isResellable;
    }

    public void setResellable(boolean resellable) {
        isResellable = resellable;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", stockageDate=" + stockageDate +
                ", expirationDate=" + expirationDate +
                ", category=" + category +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", buyPrice=" + buyPrice +
                ", appliedTaxes=" + appliedTaxes +
                ", taxRate=" + taxRate +
                ", isResellable=" + isResellable +
                '}';
    }
}
