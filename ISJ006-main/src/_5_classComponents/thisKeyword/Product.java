package _5_classComponents.thisKeyword;

public class Product {
    int productId;
    String productName;

    //zero para.
    public Product() {
       // this(100, "Mobile");
        System.out.println("zero parameterized constructor");
    }

    //all args constructor
    public Product(int productId, String productName) {
        this();
        this.productId = productId;
        this.productName = productName;
    }

    public static void main(String[] args) {
        Product product = new Product(1,"phone");
    }
}
