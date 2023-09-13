package ss7_abstract_class_interface.thuc_hanh.animal_fruit.animal;

import ss7_abstract_class_interface.thuc_hanh.animal_fruit.edible.edible;

public class Chicken extends Animal implements edible {
    @Override
    public String howtoEat() {
        return "could be fried";
    }

    @Override
    public String makeSound() {
        return "chicken: cluck-cluck";
    }
}
