package ramsbrew;
// The main class that will be used to test the coffee shop
public class OrderDriver {
    public static void main(String[] args) {

        // create factory object
        BeverageFactory factory = new BeverageFactory();

        Beverage drink1 = factory.createBeverage("Latte");

        drink1 = new CustomBeverageBuilder(drink1)
                .setTemperature("Iced")
                .setSize("Large")
                .setMilk("oat")
                .setShots(2)
                .setSweetener("Stevia")
                .build();

        // Create second drink using the factory
        Beverage drink2 = factory.createBeverage("Tea");

        // Customize the second drink
        drink2 = new CustomBeverageBuilder(drink2)
                .setTemperature("Hot")
                .setSize("Small")
                .setMilk("None")
                .setShots(0)
                .setSweetener("Honey")
                .build();

        // Create third drink using the factory
        Beverage drink3 = factory.createBeverage("Coffee");

        // Customize the third drink using the builder
        drink3 = new CustomBeverageBuilder(drink3)
                .setTemperature("Hot")
                .setSize("Medium")
                .setMilk("Whole")
                .setShots(0)
                .setSweetener("Sugar")
                .build();

        // Create an order with takeout strategy
        Order order = new Order(new TakeoutStrategy());

        // Add drinks to the order
        order.addBeverage(drink1);
        order.addBeverage(drink2);
        order.addBeverage(drink3);

        // Display the order
        order.showOrder();
    }
}
