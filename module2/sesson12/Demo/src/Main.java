
import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<User> list=new ArrayList<User>();
        list.add(new User("John","Join@gmail.com",RoleConst.ROlE_ADMIN));
        list.add(new User("John","Join23@gmail.com",RoleConst.ROlE_ADMIN));
        list.add(new User("teo","toq@gmail.com",RoleConst.ROLE_USER));
        list.add(new User("tis","toq@gmail.com",RoleConst.ROLE_USER));


        //in ra so luong ptu User cua tung role :role add min=2;ro:2

//        b1: tao 2 bien dem(taoj so luong user vaf admin)
//        b2: duyet mang taij moi lan duyet,so sanh gia tri role cua tung ptu.
        //  b3:Neu role cua ptu ss== role admin thi tang bien dam admin len 1

        int count1=0;
        int count2 =0;

        for (int i=0;i<list.size();i++){
            if(list.get(i).getRole()== RoleConst.ROlE_ADMIN) {
                count1++;
            }
            if(list.get(i).getRole()== RoleConst.ROLE_USER) {
                count2++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);


        //Tiìm phan tu user co email chua phan tu x.

        // b1:tạo 1
        Scanner scanner=new Scanner(System.in);
        System.out.println("In ra x");
        String x = scanner.nextLine();

        for (int i=0;i<list.size();i++) {
            if(list.get(i).getEmail()==x) {
                System.out.println(list.get(i));
            }else {
                System.out.println("Không có");
            }
        }
    }
}