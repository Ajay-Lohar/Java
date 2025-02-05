package _5_classComponents.methods.productApp;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ProductController productController = new ProductController();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the product id");
        int productId = scanner.nextInt();

        System.out.println("Enter the product Name");
        String productName = scanner.next();

        System.out.println("Enter the product price");
        int productPrice = scanner.nextInt();

        System.out.println("Enter the product Description");
        String productDescription = scanner.next();

        System.out.println("Enter the product Quantity");
        int productQuantity = scanner.nextInt();

        productController.addProduct(productId, productName, productPrice, productDescription, productQuantity);
    }
}
