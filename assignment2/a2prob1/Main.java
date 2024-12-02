package a2prob1;

public class Main {
    public static void main(String[] args) {
        Address chicagoAddress = new Address("123 Main St", "Chicago", "IL", "60601");
        Address newYorkAddress = new Address("456 Elm St", "New York", "NY", "10001");
        Address laAddress = new Address("789 Oak St", "Los Angeles", "CA", "90001");

        Customer customer1 = new Customer("Joe", "Smith", "332-221-4444");
        customer1.setBillingAddress(chicagoAddress);
        customer1.setShippingAddress(newYorkAddress);

        Customer customer2 = new Customer("Anna", "Johnson", "123-456-7890");
        customer2.setBillingAddress(newYorkAddress);
        customer2.setShippingAddress(laAddress);

        Customer customer3 = new Customer("Tom", "Williams", "987-654-3210");
        customer3.setBillingAddress(chicagoAddress);
        customer3.setShippingAddress(chicagoAddress);

        Customer[] customers = {customer1, customer2, customer3};

        for (Customer customer : customers) {
            if (customer.getBillingAddress().getCity().equalsIgnoreCase("Chicago")) {
                System.out.println(customer);
            }
        }
    }
}

