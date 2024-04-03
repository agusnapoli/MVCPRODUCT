package com.agustina.product.view;

import com.agustina.product.model.entities.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {


    public static Product crearProducto ()
    {

        Scanner scann = new Scanner(System.in);

        System.out.println("Ingrese id, precio y nombre del producto");
        int id = scann.nextInt();
        int price = scann.nextInt();
        scann.nextLine();
        String name=  scann.nextLine();

        Product producto = new Product(id,price,name);
        return producto;
    }

    public static void verProducto (Product producto)
    {
        System.out.println("producto.getId() = " + producto.getId());
        System.out.println("producto.getPrice() = " + producto.getPrice());
        System.out.println("producto.getName() = " + producto.getName());
    }

    public Integer removeProduct ()
    {
        Scanner scann= new Scanner(System.in);
        System.out.println("Ingrese el id del producto a eliminar");
        Integer id = scann.nextInt();

        return id;
    }

    public Integer modifyProduct (ArrayList<Product> lista)
    {
        System.out.println("Ingrese el id del producto que va a modificar");
        Scanner scann = new Scanner(System.in);
        Integer id = scann.nextInt();

        return id;
    }






}
