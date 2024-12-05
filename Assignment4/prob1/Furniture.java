package Assignment4.prob1;

public class Furniture extends Product {
    private String material;
    private float shippingCost;

    public Furniture(String productName, double price, String material, float shippingCost) {
        super(productName, price);
        this.material = material;
        this.shippingCost = shippingCost;
    }

    @Override
    public double getPrice() {
        double originalPrice = super.getPrice();
        return originalPrice + shippingCost;
    }

    @Override
    public String toString() {
        return super.toString() + ", Material: " + material + ", Shipping Cost: " + shippingCost;
    }
}