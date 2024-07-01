public class NumberGenerator implements Runnable {

    public NumberGenerator() {

    }

    @Override
    public void run() {


        try {
            for (int i=0;i<10;i++) {
                System.out.println("Number: " + i + " - HashCode: " + this.hashCode());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("My thread interrupted");
        }
        System.out.println("My thread run is over");
    }
}
