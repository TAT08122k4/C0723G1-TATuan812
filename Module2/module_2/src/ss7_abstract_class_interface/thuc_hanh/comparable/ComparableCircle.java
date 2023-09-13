package ss7_abstract_class_interface.thuc_hanh.comparable;

import ss7_abstract_class_interface.thuc_hanh.comparable.geometric.Circle;

public class ComparableCircle extends Circle implements Comparable <ComparableCircle>  {
    public ComparableCircle (){

    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, Boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) {
            return 1;
        }else if(getRadius() < o.getRadius()){
            return -1;
        }else {
            return 1;
        }
    }
}
