import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        List<SinhVien> sinhVien = new ArrayList<>();

        sinhVien.add(new SinhVien("Kieen", "kiennguyen246@gmail.com", Role.ROLE_ADMIN));
        sinhVien.add(new SinhVien("khoi", "khoi@gmail.com", Role.ROLE_ADMIN));
        sinhVien.add(new SinhVien("manh", "manh@gmail.com", Role.ROLE_ADMIN));
        sinhVien.add(new SinhVien("Manh", "manh@gmail.com", Role.ROLE_ADMIN));
        sinhVien.add(new SinhVien("quan", "quan@gmail.com", Role.ROLE_USER));
        sinhVien.add(new SinhVien("dat", "dat@gmail.com", Role.ROLE_USER));


        //timf so luong moi role co trong sinh vien.
//        b1:goi bien dem
//        b2:Duyet mang
//        b3:in ra bien dem

        int roleAdmin = 0;
        int roleUses = 0;
        for (int i = 0; i < sinhVien.size(); i++) {
            if (sinhVien.get(i).getRole() == Role.ROLE_ADMIN) {
                roleAdmin++;
            }
            if (sinhVien.get(i).getRole() == Role.ROLE_USER) {
                roleUses++;
            }
        }
        System.out.println(roleAdmin);
        System.out.println(roleUses);

        //Timf email theo gia trij x
// b1:goi x ra ban phim bat ki can nhap
//        b2:dung vong lap for de duyet mang.
//        b3:neu x=(giong) gia tri cua email thi dua ra sinh vien do
//        b4:neu sai in ra ko tim thay

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dien x");
        String x = scanner.nextLine();

        boolean resluts = false;
        for (int i = 0; i < sinhVien.size(); i++) {
            if (sinhVien.get(i).getEmail().equals(x)) {
                System.out.println(sinhVien.get(i));
                resluts = true;
            }
        }
        if (!resluts) {
            System.out.println("khong co ket qua.");
        }


        //Timf theo ten nhap
    }

}
