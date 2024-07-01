public class PrintNum implements Runnable{
    private int lastNum;

    public PrintNum(int n) {
       this.lastNum=n;
    }

    @Override
    public void run() {
        for (int i=0;i<=lastNum;i++) {
            System.out.println(""+i);
        }
    }
}
