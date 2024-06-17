public class QuadraticEquation {
    public double a,b,c;

    public QuadraticEquation(double a, double b, double c){
        this.a= a;//this là tham chiếu của cả lớp,a là tt biến trên
        this.b=b;
        this.c=c;

    }
    //getter cho A
    public double getA() {
        return a;
    }
    // Getter cho B
    public double getB() {
        return b;
    }
    // Getter cho C
    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return b*b - 4*a*c;
    }
    public double getRoot1(){
        double delta=getDiscriminant();
        if (delta<0){
            return 0;//Trả về 0 nếu delta=0
        }
        return (-b+Math.sqrt(b*b-4*a*c))/2*a;
    }
    public double getRoot2(){
        double delta=getDiscriminant();
        if (delta<0){
            return 0;//Trả về 0 nếu delta=0
        }
        return (-b-Math.sqrt(b*b-4*a*c))/2*a;
    }
}

