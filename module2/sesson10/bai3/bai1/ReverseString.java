import java.util.Stack;

public class ReverseString {
    Stack<Character> stack = new Stack<>();

    public void pushIn(String str) {
        // Push each character of the string into the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
    }

    public String popOut() {
        StringBuilder reversed = new StringBuilder();
        // Pop characters from the stack to reverse the string
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
