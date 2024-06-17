public class test {
    public double a,b,c;
    public test (double a,double b,double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;//Thay đổi giá trị
    }

    public void setC(double c) {
        this.c = c;
    }
}
