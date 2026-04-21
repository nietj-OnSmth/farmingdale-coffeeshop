package ramsbrew;
// The strategy class for takeout orders
public class TakeoutStrategy implements OrderTypeStrategy {
    // Displays that the order is takeout
    public void handleOrderType() {
        System.out.println("The order Type: Takeout");
    }
}
