import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
    Map<String,Integer> hashMap=new HashMap<>();

    //Tạo và lưu danh sách sinh viên
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");

        System.out.println(hashMap);
        System.out.println(hashMap.put("Smith",30));
        System.out.println(hashMap.get("Smith"));
        /** code here */

        //Lưu key theo tthu tu giam dan
        Map<String,Integer> treeMap =new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
//        Tạo LinkedHashMap trong main lưu danh sách sinh viên và hiển thị dữ liệu

        Map<String,Integer> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
        System.out.println();
    }
}

