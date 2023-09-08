package ss4_class_object.bai_tap.fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean status = false;
    private String color = "blue";
    private double radius = 5.0;
    public Fan(){

    }
    public Fan(int speed, double radius, String color,boolean status) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.status = status;
    }

    public String toString(){
        if (status){
            if (speed == SLOW){
                return ("speed: slow"  + " color: " + color + " Radius: " + radius + " Fan is On");
            }else if (speed == MEDIUM){
                return ("speed: medium"  + " color: " + color + " Radius: " + radius + " Fan is On");
            }else if (speed == FAST){
                return ("speed: FAST " + " color: " + color + " Radius: " + radius + " Fan is On");
            }else {
                return ("Speed <= 3 && speed > 0");
            }
        }else {
            return ("color: " + color + " radius:" + radius + " Fan is Off");
        }
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
