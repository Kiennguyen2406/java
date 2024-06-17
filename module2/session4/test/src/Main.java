//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        test AN=new test (1,2,3);
       double b=AN.getB();
        AN.setB(5);//Thay đổi giá trị cho b
        double newb=AN.getB();
       System.out.println(newb);
        }
    }
