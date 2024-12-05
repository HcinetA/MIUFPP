package Assignment4.prob1;

public class Electronics extends Product {
    private int warranty;
    private float warrantyCost;

    public Electronics(String productName, double price, int warranty, float warrantyCost) {
        super(productName, price);
        this.warranty = warranty;
        this.warrantyCost = warrantyCost;
    }

    @Override
    public double getPrice() {
        double originalPrice = super.getPrice();
        return originalPrice + warrantyCost;
    }

    @Override
    public String toString() {
        return super.toString() + ", Warranty: " + warranty + " years, Warranty Cost: " + warrantyCost;
    }
}