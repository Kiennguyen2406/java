public class TruyenThamTriThamChieu {
    public static void main(String[] args) {
    int x=11;
    int []y= new int[10];
    m(x,y);
    System.out.println(x);
    System.out.println(y[0]);
    }
    public static void m(int a,int[] b) {
        a=10;//ko đổi
        b[0]=10;//lấy giá trị trong này
    }
}
