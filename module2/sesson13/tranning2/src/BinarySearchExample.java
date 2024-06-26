public class BinarySearchExample {
    public static void main(String[] args) {
        int[] list = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 79};

        System.out.println(binarySearch(list, 2));  // 0
        System.out.println(binarySearch(list, 11)); // 4
        System.out.println(binarySearch(list, 79)); // 12
        System.out.println(binarySearch(list, 1));  // -1
        System.out.println(binarySearch(list, 5));  // 2
        System.out.println(binarySearch(list, 80)); // -1
    }

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1; // Now high < low, key not found
    }
}
