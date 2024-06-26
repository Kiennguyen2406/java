public static void main(String[] args) {
        double[]list={1,5,8,9,4,5,7,8,4};

            selectionSort(list);
            for (int i = 0; i < list.length; i++)
                System.out.print(list[i] + " ");
        }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length ; i++) {
                double min=list[i];

                int indexMin=i;
                for (int j=i+1;j<list.length;j++) {
                    if(min>list[j]) {
                        min=list[j];
                        indexMin=j;
                    }
                }
                if (indexMin!=i) {
                    list[indexMin]=list[i];
                    list[i]=min;//list[j]
            }
        }
    }

public void main() {
}





