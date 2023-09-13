package ss7_abstract_class_interface.thuc_hanh.comparable.geometric;

import ss6_inheritance.thuc_hanh.shape.Rectangle;

public class Square extends Rectangle {
    public Square(){

    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side , String color , Boolean filled){
        super(color,filled,side,side);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    @Override
    public void setLength(double length) {
        super.setLength(length);
    }
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return " A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
