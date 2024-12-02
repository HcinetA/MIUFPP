package a2Prob5;

public class Pizza {
    private PizzaSize size;
    private PizzaType type;
    private int quantity;
    private double price;

    public Pizza(PizzaSize size, PizzaType type, int quantity) {
        this.size = size;
        this.type = type;
        this.quantity = quantity;
        calculatePrice();
    }

    private void calculatePrice() {
        double sizePrice = switch (size) {
            case SMALL -> 8.0;
            case MEDIUM -> 10.0;
            case LARGE -> 12.0;
        };

        double typePrice = switch (type) {
            case VEGGIE -> 1.0;
            case PEPPERONI -> 2.0;
            case CHEEZE -> 1.5;
            case BBQ_CHICKEN -> 2.0;
        };

        this.price = (sizePrice + typePrice) * quantity;
    }

    public String printOrderSummary() {
        double tax = price * 0.03; // 3% tax
        double totalPrice = price + tax;
        return String.format(
                "Pizza Order:\n" +
                        "Size: %s\n" +
                        "Type: %s\n" +
                        "Qty: %d\n" +
                        "Price: $%.2f\n" +
                        "Tax: $%.2f\n" +
                        "Total Price: $%.2f\n",
                size, type, quantity, price, tax, totalPrice
        );
    }
}

