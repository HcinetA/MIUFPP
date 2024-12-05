package Assignment4.prob1;

public class Clothing extends Product {
    private String brand;
    private float discountPercentage;

    public Clothing(String productName, double price, String brand, float discountPercentage) {
        super(productName, price);
        this.brand = brand;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getPrice() {
        double originalPrice = super.getPrice();
        double discountAmount = originalPrice * (discountPercentage / 100);
        return originalPrice - discountAmount;
    }

    @Override
    public String toString() {
        return super.toString() + ", Brand: " + brand + ", Discount: " + discountPercentage + "%";
    }
}