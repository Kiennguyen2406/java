import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductManager productManager=new ProductManager();

        productManager.addProduct(new Product("samsung",1,23000));
        productManager.addProduct(new Product("iphone",2,22000));
        productManager.addProduct(new Product("nokia",3,21000));
        productManager.addProduct(new Product("xeomi",4,20000));
        productManager.sortUpAscending();
        productManager.display();


        productManager.display();
        productManager.insert(1,new Product("samsunggalasy",2,230000));
        productManager.display();
        productManager.insert(8,new Product("samsunggalasy",1,230000));
        productManager.display();

        productManager.Delete(3);
        productManager.display();
        productManager.getById(2);

        productManager.sortUpAscending();
        productManager.display();

    }
}