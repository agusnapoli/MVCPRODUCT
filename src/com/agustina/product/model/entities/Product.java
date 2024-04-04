package com.agustina.product.model.entities;

public class Product {

    private Integer id;
    private Integer price;
    private String name;
    private Categoria categoria;

    public Product ()
    {

    }

    public Product (Integer id, Integer price, String name, Categoria categoria)
    {
        this.id=id;
        this.price=price;
        this.name=name;
        this.categoria=categoria;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getName ()
    {
        return name;
    }

}

