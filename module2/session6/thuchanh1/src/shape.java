public class shape {
    private String color;
    private boolean filled;


    public shape () {
        this.color="green";
        this.filled=true;
    }

    public shape(String color, boolean filled) {
        this. color=color;
        this.filled=filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "shape{" +
                "color='" + getColor() + '\'' +
                ", filled=" + isFilled() +
                '}';
    }
}
