package ramsbrew;

public class RamsBrewFactory implements BeverageFactory {

        // Creates and returns the right beverage type
        public Beverage createBeverage(String type) {
            if (type.equalsIgnoreCase("Coffee")) {
                return new Coffee();
            } else if (type.equalsIgnoreCase("Latte")) {
                return new Latte();
            } else if (type.equalsIgnoreCase("Cappuccino")) {
                return new Cappuccino();
            } else if (type.equalsIgnoreCase("Tea")) {
                return new Tea();
            } else {
                return null; // Returns null if the type is invalid
            }
        }
    }
