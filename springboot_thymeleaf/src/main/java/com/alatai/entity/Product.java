package com.alatai.entity;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/07/13 11:47
 */
public class Product {

    private int id;
    private String name;
    private int price;

    public Product() {

    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
