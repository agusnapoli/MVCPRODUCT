import com.agustina.product.controller.CategoryController;
import com.agustina.product.controller.ProductController;
import com.agustina.product.model.repository.CategoryRepository;
import com.agustina.product.model.repository.ProductRepository;
import com.agustina.product.view.CategoryView;
import com.agustina.product.view.ProductView;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ProductRepository productRepository= new ProductRepository();
        ProductView productView= new ProductView();
        ProductController productController = new ProductController(productRepository,productView);


        CategoryRepository categoryRepository = new CategoryRepository();
        CategoryView categoryView = new CategoryView();
        CategoryController categoryController = new CategoryController(categoryView, categoryRepository);


        Scanner scan = new Scanner(System.in);

            System.out.println("Ingrese la opcion a realizar: 1 Productos / 2 Categorias ");
            int num = scan.nextByte();
            switch (num)

            {
                case 1:
                    productController.createProduct();
                    productController.modifyIdProduct();
                    productController.removeProduct();
                    break;
                case 2:
                    categoryController.addToList();
                    categoryController.removeToList();
                    categoryController.modifyList();
                    break;
                default :
                    System.out.println("XXXXXXX ERROR XXXXXXX");




        }

    }
}