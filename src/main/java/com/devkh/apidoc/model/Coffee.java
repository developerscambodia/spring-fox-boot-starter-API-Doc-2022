package com.devkh.apidoc.model;

import java.math.BigDecimal;

public class Coffee {

    private Integer id;
    private String code;
    private String name;
    private String size;
    private BigDecimal price;

    public Coffee(Integer id, String code, String name, String size, BigDecimal price) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coffee [code=" + code + ", id=" + id + ", name=" + name + ", price=" + price + ", size=" + size + "]";
    }

}
