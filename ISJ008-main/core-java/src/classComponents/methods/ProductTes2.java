package classComponents.methods;

public class ProductTes2 {
    public static void main(String[] args) {
        Product product = new Product();
        product.productId = 101;
        product.productName = "Laptop";
        product.productPrice = 99900;
        product.productDealer = "Pune electronics";
        printProductDetails(product);
    }

    public static void printProductDetails(Product product) {
        System.out.println("Product ID : " + product.productId);
        System.out.println("Product Name : " + product.productName);
        System.out.println("Product Price : " + product.productPrice);
        System.out.println("Product Dealer : " + product.productDealer);

    }
}
