package Lesson4Tasks.Taks1;

public class Product {
    private static int idCounter = 1000;
    private int productID;
    private String productName;
    private static String companyName;

    static {
        companyName = "MyCompany";
    }

    {
        productID = idCounter++;
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public static String getCompanyName() {
        return companyName;
    }
}
