public class FAN {
   public int speed=1;
   private double radius=5;

   private boolean on=false;
   private String color="blue";
   public FAN (boolean on,int speed,String color,double radius) {
       this.color=color;
       this.radius=radius;
       this.speed=speed;
       this.on=on;
   }
   public FAN(){

   }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    @Override
    public String toString() {
       if(isOn()== true) {
           return "FAN{" +
                   "speed=" + speed +
                   ", radius=" + radius +
                   ", color='" + color + '\'' +
                   ",Fan is on"+
                   '}';
       }else {
           return "FAN{" +
                   ", radius=" + radius +
                   ", color='" + color + '\'' +
                   ",Fan is off"+
                   '}';
       }
    }
}
