public class CopySangMangMoi {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};

        //Các bưocws copy từ mảng này sang mảng khác
//        B1:copy chiều dài mảng cũ
        int [] newArr = new int[arr.length];
//        B2:copy các phần tử trong mảng
        for (int i=0;i<arr.length;i++) {
            newArr[i] = arr[i];
        }for (int i=0;i<newArr.length;i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}
