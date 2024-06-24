import java.util.Stack;

public class ReverseArrayUsingStack {
    private Stack<Integer> stack;

    public ReverseArrayUsingStack() {
        stack = new Stack<>();
    }

    // Phương thức để đẩy các phần tử của mảng vào stack
    public void pushIn(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
    }

    // Phương thức để lấy các phần tử từ stack và đưa vào mảng để đảo ngược
    public void popOut(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }
}