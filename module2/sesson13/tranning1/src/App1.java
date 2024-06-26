import static java.util.Arrays.binarySearch;

public static void main(String[] args) {
    // Ví dụ sử dụng
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int target = 7;
    int result = binarySearch(array, target);

    if (result != -1) {
        System.out.println("Chỉ số của giá trị " + target + " là: " + result);
    } else {
        System.out.println("Giá trị " + target + " không có trong mảng.");
    }
}
