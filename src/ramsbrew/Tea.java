package ramsbrew;

// Tea is a specific type of Beverage
public class Tea extends Beverage {

    // Calls the Beverage constructor and sets milk to None by default
    public Tea() {
        super("Tea");
        this.milk = "None";
    }
}

