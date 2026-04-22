package ramsbrew;

// Factory interface used to create beverage objects
public interface BeverageFactory {

    // Method that creates a beverage based on the type
    Beverage createBeverage(String type);
}
