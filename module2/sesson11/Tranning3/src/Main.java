import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1=new Student("kien",17,"vu tong phan");
        Student student2=new Student("trung",15,"vu tong phan");
        Student student3=new Student("viet",16,"vu tong phan");

        List<Student>list=new ArrayList<>();

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student1);
        Collections.sort(list);
        for(Student st : list){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student st : list){
            System.out.println(st.toString());
        }
    }
    }
