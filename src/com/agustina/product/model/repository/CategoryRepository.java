package com.agustina.product.model.repository;

import com.agustina.product.model.entities.Categoria;
import com.agustina.product.view.CategoryView;
import com.agustina.product.view.ProductView;

import java.util.ArrayList;
import java.util.Scanner;

public class CategoryRepository {

    private ArrayList<Categoria> lista = new ArrayList<>();


    public CategoryRepository ()
    {
        this.lista= new ArrayList<>();
    }

    public void addToList (Categoria category)
    {
        this.lista.add(category);
    }

    public ArrayList<Categoria> getList ()
    {
        return lista;
    }
    public void viewList ()
    {
        for (int i=0; i<this.lista.size(); i++)
        {
            CategoryView.viewACategory(lista.get(i));
        }
    }

    public void addCategoriesToList ()
    {
        String c ;
        Scanner scan= new Scanner(System.in);
        do{

            Categoria cat = CategoryView.addCategory();
            addToList(cat);
            System.out.println("S PARA CARGAR OTRA CATEGORIA");
            c=scan.nextLine();
        }while (c.equalsIgnoreCase("s"));
    }

    public Categoria buscarEnLista ( String name)
    {
        for (int i =0 ; i < this. lista.size() ; i++)
        {
            if (lista.get(i).getName().equals(name))
            {
                return lista.get(i);
            }
        }
        return null;
    }

    public void remove (Categoria cat)
    {
        this.lista.remove(cat);
    }

    public void modify (Categoria cat)
    {
        System.out.println("Ingrese el  nuevo nombre");
        Scanner scan = new Scanner(System.in);
        String c = scan.nextLine();
        cat.setName(c);
    }
}
