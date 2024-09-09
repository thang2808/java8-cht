package com.ttdk6.cht.product;

import java.util.Date;

public class Product {
    int id;
    String name;
    int categoryId;
    Date saleDate;
    int quility;

    Boolean isDelete;

    public Product() {
    }

    public Product(int id, String name, int categoryId, Date saleDate, int quility, Boolean isDelete) {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
        this.saleDate = saleDate;
        this.quility = quility;
        this.isDelete = isDelete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public int getQuility() {
        return quility;
    }

    public void setQuility(int quility) {
        this.quility = quility;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", categoryld=" + categoryId +
                ", saleDate=" + saleDate +
                ", quility=" + quility +
                ", isDelete=" + isDelete +
                '}';
    }
}
