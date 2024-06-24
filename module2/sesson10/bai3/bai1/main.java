import java.util.List;

public static void main(String[] args) {
    String str = "ddaay la toi";
    ReverseString reverseString = new ReverseString();


    System.out.println("Original String:");
    System.out.println(str);
    System.out.println();

    // Reverse the string using ReverseString class
    reverseString.pushIn(str); // Push characters of str into the stack
    String reversedStr = reverseString.popOut(); // Pop characters to get reversed string

    System.out.println("Reversed String:");
    System.out.println(reversedStr);
}

