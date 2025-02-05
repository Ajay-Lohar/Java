package _5_classComponents.variables;

public class Product {
    int productId;
    String productName;
    int productPrice;

    public static void main(String[] args) {
        //product1, product2, product3 : local reference variable
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();

        product1.productId = 101;
        product1.productName = "Laptop";
        product1.productPrice = 100000;

        product2.productId = 102;
        product2.productName = "Mobile";
        product2.productPrice = 25000;


        product3.productId = 103;
        product3.productName = "Workstation";
        product3.productPrice = 1000000;

        int productPriceSum = product1.productPrice + product2.productPrice + product3.productPrice;
        int averageProductPrice = productPriceSum / 3;

        System.out.println("Product Price Sum = " + productPriceSum);
        System.out.println("Product Price Average = " + averageProductPrice);

    }
}
