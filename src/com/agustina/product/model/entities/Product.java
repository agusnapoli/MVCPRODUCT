package com.agustina.product.model.entities;

public class Product {

    private Integer id;
    private Integer price;
    private String name;

    public Product ()
    {

    }

    public Product (Integer id, Integer price, String name)
    {
        this.id=id;
        this.price=price;
        this.name=name;
    }

    public void setId (Integer id)
    {
        this.id=id;
    }

    public Integer getId ()
    {
        return id;
    }


    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setId (String name)
    {
        this.name=name;
    }

    public String getName ()
    {
        return name;
    }

}

