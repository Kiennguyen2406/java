import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager {

    private List<Product> products;


    public ProductManager() {
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public int searchById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
    public void insert(int id,Product p){
        int indexOfProduct=searchById(id);
        if(indexOfProduct==-1){
            System.out.println("Khong tim thay");
        }else {
            products.set(indexOfProduct, p);
        }
    }
    public void Delete(int id) {
        int indexOfProduct=searchById(id);
        if(indexOfProduct==-1){
            System.out.println("Khong tim thay");
        }else {
            products.remove(indexOfProduct);
        }
    }
    public void display(){
        for (int i=0;i<products.size();i++){
            System.out.println(products.get(i));
        }
    }
    public int searchByName(String name) {
        for (int i=0;i<products.size();i++) {
            if(products.get(i).getProductName()== name){
                return i;
            }
        }
        return -1;
    }
    public void getById(int id) {
        int indexOfProduct = searchById(id);
        if (indexOfProduct == -1) {
            System.out.println("Khong tim thay");

        } else {
           System .out.println(this.products.get(indexOfProduct));
        }
    }
    public void sortUpAscending(){
        Collections.sort(this.products);

    }

    }



