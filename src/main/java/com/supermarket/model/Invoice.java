package com.supermarket.model;

import java.util.List;

public class Invoice {
    private String transactionDate;
    private String transactiontime;
    private double price;
    private double totalfinalprice;
    private double totalinitialprice;
    private int id_stuff;
    private String id_points_sale;
    private int sold_products;

    public Invoice(String transactionDate, String transactiontime, double price, double totalfinalprice,
            double totalinitialprice, int id_stuff, String id_points_sale, int sold_products,
            List<Product> products, List<Integer> quantities) {
        this.transactionDate = transactionDate;
        this.transactiontime = transactiontime;
        this.price = price;
        this.totalfinalprice = totalfinalprice;
        this.totalinitialprice = totalinitialprice;
        this.id_stuff = id_stuff;
        this.id_points_sale = id_points_sale;
        this.sold_products = sold_products;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactiontime() {
        return transactiontime;
    }

    public void setTransactiontime(String transactiontime) {
        this.transactiontime = transactiontime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalfinalprice() {
        return totalfinalprice;
    }

    public void setTotalfinalprice(double totalfinalprice) {
        this.totalfinalprice = totalfinalprice;
    }

    public double getTotalinitialprice() {
        return totalinitialprice;
    }

    public void setTotalinitialprice(double totalinitialprice) {
        this.totalinitialprice = totalinitialprice;
    }

    public int getId_stuff() {
        return id_stuff;
    }

    public void setId_stuff(int id_stuff) {
        this.id_stuff = id_stuff;
    }

    public String getId_points_sale() {
        return id_points_sale;
    }

    public void setId_points_sale(String id_points_sale) {
        this.id_points_sale = id_points_sale;
    }

    public int getSold_products() {
        return sold_products;
    }

    public void setSold_products(int sold_products) {
        this.sold_products = sold_products;
    }

}
