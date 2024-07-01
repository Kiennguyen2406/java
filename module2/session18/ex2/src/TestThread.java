public class TestThread {
    public static void main(String[] args) {
        Runnable printf1=new OddThread();
        Thread odd =new Thread(printf1);
        odd.start();
        Runnable printf2=new EvenThread();
        Thread even =new Thread(printf2);
        even.start();
    }
}
