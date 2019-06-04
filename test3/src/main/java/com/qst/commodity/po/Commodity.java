package com.qst.commodity.po;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Past;
import java.util.Date;

public class Commodity {

    private int id;


    private String name;
    private int price;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Past(message = "日期不能设置成以后")
    private Date data;
    private String describe;


    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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



    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
