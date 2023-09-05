package ss1_introdution_java.thuc_hanh;

import java.util.Map;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight,height,bmi;
        System.out.print("Input ur Weight:");
        weight = sc.nextDouble();
        System.out.print("Input ur Height:");
        height = sc.nextDouble();
        bmi = weight/ Math.pow(height,2);
    if (bmi < 18){
        System.out.println("Underweight");
    }else if (bmi < 25.0){
        System.out.println("Normal");
    }else if(bmi < 30.0){
        System.out.println("Overweight");
    }else {
        System.out.println("Obese");
    }
    }
}
