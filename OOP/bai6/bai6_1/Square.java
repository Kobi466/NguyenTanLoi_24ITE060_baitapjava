package bai6.bai6_1;

public class Square extends Rectangle{
    public Square(){}
    public Square(double side){
        super(side, side);
    }
    public Square(String color, boolean filled, double side){
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }
    public void setWidth(double side) {
        super.setWidth(side);
    }
    public void setHeight(double side) {
        super.setHeight(side);
    }
    //    public void setSide(double side) {
//        setWidth(side);
//        setHeight(side);
//    }
    // Override toString()
    @Override
    public String toString() {
        return "Square [" + super.toString() + "]";
    }
}

