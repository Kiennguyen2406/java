import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    List<Product> productList = new ArrayList<>();

    public void addProduct(Product p) {
        productList.add(p);
    }

    public int searchByID(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void repairByID(int id, Product p) {
        if (searchByID(id) != -1) {
            productList.set(id, p);
        } else {
            System.out.println("ko tim thay cho sua");
        }
    }

    public void deleteByID(int id) {
        int findARemote = searchByID(id);
        if (findARemote == -1) {
            System.out.println("Khoong tim thay cho xoas");
        }else {
            productList.remove(id);
        }
    }
    public void display(){
        for(int i=0;i< productList.size();i++) {
            System.out.println(productList.get(i));
        }
    }
    public void SearchByName(String Name) {
        for(int i=0;i<productList.size();i++) {
            if(productList.get(i).getName().equals(Name)) {
                productList.get(i);
            }else {
                System.out.println("Khong tim thay ten can lay");
            }
        }
    }
}
