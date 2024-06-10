public class GoiPhuongThuc {
    public static void main(String[] args) {
    int x= 1;
    int y= 12;
    int z= max(x,y);
    System.out.println(z);
    }

    public static int max(int a, int b) {
        int result = a;
        if (a < b) {
            result = b;
        }else {
            result = a;
        }
        return result;//Cần giá trị trả về
    }
}
