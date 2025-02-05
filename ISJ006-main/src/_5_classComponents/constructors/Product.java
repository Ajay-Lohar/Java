package _5_classComponents.constructors;

public class Product {
    int productId;
    String productName;
    int productPrice;

    //zero parameterized constructor
    public Product() {
        productId = 1;
        productName = "dummy product name";
        productPrice = 100;
    }

    public Product(int pId, String pName, int pPrice) {
        productId = pId;
        productName = pName;
        productPrice = pPrice;
    }

    public static void main(String[] args) {
        Product product1 = new Product();//call to the zero param constructor
        System.out.println("Product Id: " + product1.productId);
        System.out.println("Product Name: " + product1.productName);
        System.out.println("Product Price: " + product1.productPrice);

        Product product2 = new Product();//call to the zero param constructor
        System.out.println("Product Id: " + product2.productId);
        System.out.println("Product Name: " + product2.productName);
        System.out.println("Product Price: " + product2.productPrice);

        System.out.println("Parameterized constructor");
        Product product3 = new Product(101, "Laptop", 56000);
        System.out.println("Product Id: " + product3.productId);
        System.out.println("Product Name: " + product3.productName);
        System.out.println("Product Price: " + product3.productPrice);
    }
}
