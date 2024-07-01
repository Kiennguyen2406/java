public class TaskThreadDemo {
    public static void main(String[] args) {
        //Create tasks:tao cac cong viec thuc thi
        Runnable printA=new PrintChar('a',100);
        Runnable printB=new PrintChar('b',100);
        Runnable printC=new PrintNum(100);
        //Create threads:Tao cac luong cho moi cong viec
        Thread thread1=new Thread(printA);
        Thread thread2=new Thread(printB);
        Thread thread3=new Thread(printC);
        // Start thread:Chay luong
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
