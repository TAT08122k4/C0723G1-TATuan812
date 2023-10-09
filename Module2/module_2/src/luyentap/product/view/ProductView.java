package luyentap.product.view;

import luyentap.product.controller.IProductController;
import luyentap.product.controller.Impl.ProductController;
import ss11_map_java_collection_framework.bai_tap.mvc_product.model.Product;

import java.util.Scanner;

public class ProductView {
    Scanner sc = new Scanner(System.in);
    IProductController productController = new ProductController();

    public void displayMenu() {
        System.out.println("==Menu==");
        System.out.println("1.Add new Product");
        System.out.println("2.Display Product");
        System.out.println("3.Delete a Product");
        System.out.println("4.Edit Product");
        System.out.println("5.Sort Product");
        System.out.println("6.Exit");
    }

    public void runPrograming() {
        int choose = 0;
        do {
            displayMenu();
            choose = choose(0, 7);
            switch (choose) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    return;
            }
        } while (true);
    }
    public int choose(int low, int high) {
        int choose = 0;
        do {
            try {
                choose = Integer.parseInt(sc.nextLine());
                if (choose < low || choose > high) {
                    System.out.println("Enter ur choose " + "Lower than" + high + "and" + " Bigger than " + low);
                }
                if (choose > 0 && choose < high) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Enter Integer plzz:");
            }
        } while (true);
        return choose;
    }
public Product addNewProduct(){
        return new Product();
}
}
