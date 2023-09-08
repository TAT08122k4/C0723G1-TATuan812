package ss4_class_object.bai_tap.fan;

public class TestFan {
    public static void main(String[] args) {
    Fan fan1 = new Fan(3,10,"yellow",true);
    Fan fan2 = new Fan(2,5,"blue",false);
        System.out.println(fan2.getSpeed());
        System.out.println(fan2);
    }
}
