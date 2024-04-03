package com.agustina.product.controller;

import com.agustina.product.model.entities.Product;
import com.agustina.product.model.repository.ProductRepository;
import com.agustina.product.view.ProductView;

import java.util.ArrayList;

public class ProductController {

    private ProductRepository productRepository;
    private ProductView productView;

    public ProductController()
    {

    }

    public ProductController (ProductRepository productRepository,ProductView productView)
    {
        this.productRepository=productRepository;
        this.productView=productView;
    }

    public void createProduct ()
    {
        this.productRepository.cargarListaDeProductos();
        this.productRepository.verLista();
    }

    public void removeProduct ()
    {
        Integer id = this.productView.removeProduct();
        Product producto = this.productRepository.buscarProducto(id);
        this.productRepository.eliminarProducto(producto);
        this.productRepository.verLista();
    }

    public void modifyIdProduct ()
    {
       Integer id = this.productView.modifyProduct(this.productRepository.getLista());
       Product product = this.productRepository.modificarIdProducto(id);
       this.productRepository.nuevoId(product);
        this.productRepository.verLista();
    }


}
