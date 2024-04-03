package com.agustina.product.model.repository;

import com.agustina.product.model.entities.Product;
import com.agustina.product.view.ProductView;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductRepository {

    public ArrayList<Product> lista = new ArrayList<>();

    public ProductRepository ()
    {
        this.lista=new ArrayList<>();
    }

    public ArrayList<Product> getLista ()
    {
        return lista;
    }

    public void addToList (Product product)
    {
        this.lista.add(product);
    }

    public void cargarListaDeProductos ()
    {
        Scanner scann = new Scanner(System.in);
        String c;
        do {
            Product producto= ProductView.crearProducto();
            addToList(producto);
            System.out.println("S para cargar mas productos");
             c = scann.nextLine();

        }while (c.equalsIgnoreCase("s"));
    }

    public Product buscarProducto (Integer id)
    {
        for (int i = 0 ; i< lista.size() ; i++)
        {
            if (lista.get(i).getId()==id)
            {
                return lista.get(i);
            }
        }
        return null;
    }

    public void eliminarProducto (Product product)
    {
        this.lista.remove(product);
    }

    public Product modificarIdProducto (Integer id )
    {
        for (int i = 0 ; i < this.lista.size() ; i++)
        {
            if (lista.get(i).getId()==id){
                return lista.get(i);
            }
        }
        return null;
    }

    public void nuevoId (Product product)
    {
        Scanner scann = new Scanner(System.in);
        System.out.println("Ingrese el nuevo id ");
        Integer id = scann.nextInt();
        product.setId(id);
    }

    public void verLista ()
    {
        for (int i =0; i<this.lista.size() ; i++)
        {
            ProductView.verProducto(lista.get(i));
        }
    }



}
