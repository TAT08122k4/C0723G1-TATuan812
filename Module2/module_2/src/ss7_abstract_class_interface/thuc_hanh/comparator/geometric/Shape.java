package ss7_abstract_class_interface.thuc_hanh.comparator.geometric;

public class Shape {
private String color = "green";
private Boolean filled = true;

public Shape(){

}
    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public Boolean isFilled(){
    if (!this.filled){
        return false;
    }
    return true;
    }

    @Override
    public String toString() {
        return "A Shape With " +
                "color of '" + color + '\'' +
                " and" + (isFilled() ? "Filled" : "not filled");
    }
}
