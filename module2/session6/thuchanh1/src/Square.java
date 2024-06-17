import javax.swing.tree.FixedHeightLayoutCache;

public class Square extends Rectangle {
    public Square(){

    }
    //các bản thiết kế
    public Square (double side,double a) {
//        setHeight(side);
//        setWidth(side);
        super(side,side);



    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide(){
        return getHeight();
    }
    public void setSide(double side){
        this.setWidth(side);
        this.setHeight(side);
    }
    public void setWidth(double Width){
        setSide(Width);
    }
    public void setHeight(double Height) {
        setSide(Height);
    }
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}

