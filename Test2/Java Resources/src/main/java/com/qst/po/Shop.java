package com.qst.po;

public class Shop {
    private String Name;
    private int id;
    private float Price;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "Name=" + Name +
                ", id=" + id +
                ", Price=" + Price +
                '}';
    }
}
