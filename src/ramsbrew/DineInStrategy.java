package ramsbrew;

// Strategy class for dine-in orders
public class DineInStrategy implements OrderTypeStrategy {

    // Shows that the order is dine-in
    public void handleOrderType() {
        System.out.println("Order Type: Dine-In");
    }
}
