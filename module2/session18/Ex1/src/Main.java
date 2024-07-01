//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Runnable printf1=new NumberGenerator();
    Thread numberGenerator1=new Thread(printf1);


    Runnable printf2=new NumberGenerator();
    Thread numberGenerator2=new Thread(printf2);

    //Thay đổi do uu tien
        numberGenerator1.setPriority(Thread.MAX_PRIORITY);
        numberGenerator2.setPriority(Thread.MIN_PRIORITY);
        numberGenerator1.start();
        numberGenerator2.start();
    }
}