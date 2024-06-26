public class BubbleSort {
    public static void main(String[] args) {
        int []list={1,3,5,7,8,5,4,1,10,2};
        for (int i = 0; i < list.length-1;i++) {
            for (int j=0;j<list.length-i-1;j++){
                if(list[j]>list[j+1]) {
                    int temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;

                }
            }

        }
        System.out.println(list);
    }
}
