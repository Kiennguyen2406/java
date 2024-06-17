public class Ragged {

    public static void main(String[] args) {
//tạo tam giác
        int [][] TriangleArray = new int[5][0];
        TriangleArray[0]= new int[5];// Hàng đầu tiên có 5 cột
        TriangleArray[1] = new int[4];
        TriangleArray[2] = new int[3];
        TriangleArray[3] = new int[2];
        TriangleArray[4] = new int[1];

        for (int i=0;i<TriangleArray.length;i++) {
            for (int j=0;j<TriangleArray[i].length;j++) {
                System.out.print(TriangleArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
