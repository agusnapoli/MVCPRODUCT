package com.agustina.product.view;

import com.agustina.product.model.entities.Categoria;

import java.util.Scanner;

public class CategoryView {

    public static Categoria addCategory ()
    {
        Scanner scann = new Scanner(System.in);
        System.out.println("Ingrese una categoria para agregar ");
        String cat = scann.nextLine();

        Categoria category = new Categoria(cat);
        return category;
    }

    public static void viewACategory (Categoria cat)
    {
        System.out.println("cat.getName() = " + cat.getName());
    }

    public String selectRemove ()
    {
        Scanner scann= new Scanner(System.in);
        System.out.println("Ingrese la categoria que quiere eliminar");
        String cat = scann.nextLine();

        return cat;
    }

    public String modifyCategory ()
    {
        System.out.println("Ingrese el nombre de la categoria a modificar");
        Scanner scann = new Scanner(System.in);
        String cat = scann.nextLine();

        return cat;
    }






}
