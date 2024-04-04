package com.agustina.product.controller;

import com.agustina.product.model.entities.Categoria;
import com.agustina.product.model.repository.CategoryRepository;
import com.agustina.product.view.CategoryView;
import jdk.jfr.Category;

public class CategoryController {

    private CategoryRepository categoryRepository;
    private CategoryView categoryView;

    public CategoryController ()
    {

    }
    public CategoryController (CategoryView categoryView, CategoryRepository categoryRepository)
    {
        this.categoryView= categoryView;
        this.categoryRepository=categoryRepository;
    }

    public void addToList ()
    {
        this.categoryRepository.addCategoriesToList();
        this.categoryRepository.viewList();
    }

    public void removeToList ()
    {
        String c = this.categoryView.selectRemove();
        Categoria cat = this.categoryRepository.buscarEnLista(c);
        this.categoryRepository.remove(cat);
        this.categoryRepository.viewList();
    }

    public void modifyList ()
    {
        String c = this.categoryView.modifyCategory();
        Categoria cat = this.categoryRepository.buscarEnLista(c);
        this.categoryRepository.modify(cat);
        this.categoryRepository.viewList();
    }

}
