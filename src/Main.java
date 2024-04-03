import com.agustina.product.controller.ProductController;
import com.agustina.product.model.repository.ProductRepository;
import com.agustina.product.view.ProductView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ProductRepository productRepository= new ProductRepository();
        ProductView productView= new ProductView();
        ProductController productController = new ProductController(productRepository,productView);
        productController.createProduct();
        productController.modifyIdProduct();
        productController.removeProduct();
    }
}