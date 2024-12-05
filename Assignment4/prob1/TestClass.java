package Assignment4.prob1;

public class TestClass {

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Clothing("Shirt", 20.0, "BrandA", 10.0f);
        products[1] = new Electronics("Laptop", 1000.0, 2, 50.0f);
        products[2] = new Furniture("Table", 150.0, "Wood", 20.0f);
        products[3] = new Clothing("Jeans", 40.0, "BrandB", 15.0f);
        products[4] = new Electronics("Smartphone", 800.0, 1, 30.0f);

        double totalSum = sumProducts(products);
        System.out.println("Total sum of all products: " + totalSum);
    }

    public static double sumProducts(Product[] col) {
        double sum = 0.0;
        for (Product product : col) {
            sum += product.getPrice();
        }
        return sum;
    }
}