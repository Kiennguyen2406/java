public class HienThiCacSoNguyenTo {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
            if (kiemTraSoNguyenTo(i)) {
                System.out.println(i);
            }
        }

    }

    //Hàm kểm tra ố nguyen to
    public static boolean kiemTraSoNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }
}
