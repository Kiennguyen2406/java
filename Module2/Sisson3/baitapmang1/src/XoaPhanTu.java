import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        //Nhập các ptu cua mảng
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            System.out.print("element"+(i+1)+": ");
            array[i] = scanner.nextInt();
        }
        // Nhập X là phần tử cần xóa
        System.out.print("Enter the elements delete of the array: ");
        int X=scanner.nextInt();
          int[] newArray= new int[array.length-1];
        // Bước 3:Tìm X xem có xuất hiện trong mảng không.
        // Nếu xuất hiện chỉ ra vị trí của X. Giả sử vị trí này là: index_del
        for(int i=0,j=0; i<size;i++){
            //Nếu X có trong ptu đó thỉ bỏ qua
            if(array[i]==X){
                continue;
            }
            // Nếu phần tử tại vị trí i không phải là X, thêm nó vào newArray tại vị trí j
            newArray[j++]=array[i];
        }
        System.out.print(Arrays.toString(newArray));
    }
}
