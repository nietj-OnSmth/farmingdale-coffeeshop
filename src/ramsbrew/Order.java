package ramsbrew;
import java.util.ArrayList;

// Order class that stores the beverages and the order type
public class Order {
    private ArrayList<Beverage> drinks;
    private OrderTypeStrategy orderTypeStrategy;

    // Constructor creates an empty order and sets a strategy
    public Order(OrderTypeStrategy orderTypeStrategy) {
        this.orderTypeStrategy = orderTypeStrategy;
        drinks = new ArrayList<>();
    }
    // Adds a beverage to the order
    public void addBeverage(Beverage beverage) {
        drinks.add(beverage);
    }
    // Displays the full order summary
    public void showOrder() {
        double total = 0;

        System.out.println("The Ram's Brew Order(FSC STUDENTS ONLY");

        // Loop through the drinks in the order
        for (Beverage beverage : drinks) {
            beverage.showInfo();
            System.out.println();
            total += beverage.getPrice();
        }
        // Show the service type
        orderTypeStrategy.handleOrderType();
        // Show the total order price
        System.out.println("The Total Price is : $" + total);
    }
}