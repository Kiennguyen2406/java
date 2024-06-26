public class InsertionSort {
    public static void main(String[] args) {
        int[]list={5,4,6,5,4,1,5,6,6,5,4,8,41,1};
        insertionSort(list);
       for (int i=0;i<list.length;i++) {
           System.out.println(list[i]);
       }
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currElement = list[i];
            int k;
            for (k = i - 1; k>=0 && list[k]>currElement; k--) {
                    list[k+1]=list[k];
            }
            list[k+1]=currElement;
        }
    }
}
