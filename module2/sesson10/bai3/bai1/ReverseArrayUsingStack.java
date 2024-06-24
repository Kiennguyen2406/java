import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // Đưa từng phần tử của mảng vào stack
        for (int item : arr) {
            stack.push(item);
        }

        // Lấy các phần tử từ stack để đưa vào mảng ban đầu
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Mảng ban đầu:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        reverseArray(arr);

        System.out.println("Mảng sau khi đảo ngược:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
