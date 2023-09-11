package ss5_modifier_static.thuc_hanh.static_property;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lambo" , "Skyactiv 3");
        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
        System.out.println(car2.numberOfCars);
        Car car3 = new Car("Mazda 3","Skyactiv 3");
        System.out.println(Car.numberOfCars);
    }
}
