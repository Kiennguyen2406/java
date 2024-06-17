public class Main {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();

        stopwatch.start();
        // Giả lập một công việc mất thời gian, ví dụ: sắp xếp một mảng lớn

        for (int i = 0; i < 10000; i++) {
           System.out.println(i);
        }
        stopwatch.stop();

        System.out.println("Start time: " + stopwatch.getStartTime());
        System.out.println("End time: " + stopwatch.getEndTime());
        System.out.println("Elapsed time: " + stopwatch.getElapsedTime() + " milliseconds");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}