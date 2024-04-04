package com.agustina.product.model.entities;

import java.security.cert.CertificateRevokedException;

public class Categoria {

    private String name;


    public Categoria ()
    {

    }

    public Categoria (String name)
    {
        this.name=name;
    }

    public void setName (String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }


}
