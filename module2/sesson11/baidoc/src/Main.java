import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> customers = new HashMap<>();
        customers.put("John",30);
        customers.put("Mike",28);
        customers.put("Bill",32);
        customers.put("Maria",27);

        HashMap<Integer,String> customer1=new HashMap<>();
        Map<String,Integer>  abc = new HashMap<>();
        customer1.put(30,"John");


        System.out.println(customer1.get(30));
        System.out.println(customers.get("John"));
    }
}