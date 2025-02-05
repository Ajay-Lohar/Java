package classComponents.methods;

public class Product {
    int productId;
    String productName;
    int productPrice;
    String productDealer;

    //zero param - No Argument Constructor --> NoArgs Constructors
    public Product() {
    }

    //parameterized --> all argument constructor --> all args constructor
    public Product(int productId, String productName, int productPrice, String productDealer) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDealer = productDealer;
    }
}
