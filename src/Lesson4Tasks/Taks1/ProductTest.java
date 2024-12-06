package Lesson4Tasks.Taks1;

public class ProductTest {
    public static void main(String[] args) {
        Product product1 = new Product("butter");
        Product product2 = new Product("oil");

        System.out.println("Product id: " + product1.getProductId());
        System.out.println("Product name: " + product1.getProductName());
        System.out.println("Company name: " + Product.getCompanyName());

        System.out.println();

        System.out.println("Product id: " + product2.getProductId());
        System.out.println("Product name: " + product2.getProductName());
        System.out.println("Company name: " + Product.getCompanyName());
    }
}
