public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    ReverseArrayUsingStack reverseArray = new ReverseArrayUsingStack();

    System.out.println("Original Array:");
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
    System.out.println();

    // Reverse the array using ReverseArrayUsingStack class
    reverseArray.pushIn(arr); // Đẩy các phần tử của mảng vào ngăn xếp
    reverseArray.popOut(arr); // Đưa các phần tử trở lại mảng để đảo ngược nó

    System.out.println("Reversed Array:");
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}
