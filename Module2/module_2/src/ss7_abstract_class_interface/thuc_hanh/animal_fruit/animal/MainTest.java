package ss7_abstract_class_interface.thuc_hanh.animal_fruit.animal;

import ss7_abstract_class_interface.thuc_hanh.animal_fruit.fruit.Apple;
import ss7_abstract_class_interface.thuc_hanh.animal_fruit.fruit.Fruit;
import ss7_abstract_class_interface.thuc_hanh.animal_fruit.fruit.Orange;
import ss7_abstract_class_interface.thuc_hanh.animal_fruit.edible.edible;

public class MainTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal: animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                edible edible = (Chicken) animal;
                System.out.println(edible.howtoEat());
            }
        }
        Fruit [] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit: fruits) {
            System.out.println(fruit.howtoEat());
        }
    }
}
