package ss5_modifier_static.bai_tap.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle(){

    }
     Circle(double radius) {
        this.radius = radius;
    }

     double getRadius() {
        return radius;
    }
     double getArea(){
        return Math.PI * (getRadius() * getRadius());
    }
}
