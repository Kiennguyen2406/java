public class Array {
    public static void main(String[] args) {

//        int [] arr={1,2,3,4,5,6,7};
//        int i=0;
//        while(i<arr.length){
//            System.out.println(arr[i]);
//            i++;
//        }

        //Thêm 1 phần tu vao mang
        int [] arr={1,2,3,4,5,6,7};

        int [] arr2 = new int[arr.length+1];

        for(int i=0;i<arr.length;i++){
            arr2[i] = arr[i];
        }arr2[arr.length]=7;
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);

        }
    }
}
