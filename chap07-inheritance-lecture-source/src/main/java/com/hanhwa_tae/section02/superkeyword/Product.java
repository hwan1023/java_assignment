package com.hanhwa_tae.section02.superkeyword;

import java.util.Date;
/*super에 ()를 치면 부모의 생성자를 호출하는 것이다!!!!*/
public class Product {
    private String code;
    private String brand;
    private String name;
    private int price;
    private Date menufaturingDate;

    public Product(){

    }
    public Product(String code, String brand, String name, int price, Date menufaturingDate) {
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.menufaturingDate = menufaturingDate;

    }

    public Date getManufacturer(){
        return menufaturingDate;

    }
    public void setManfaturingDate(Date menufaturingDate) {
        this.menufaturingDate = menufaturingDate;

    }
    public String getInformation(){
        return code + " " + brand + " " + name + " " + price + " " + menufaturingDate;
    }
}
