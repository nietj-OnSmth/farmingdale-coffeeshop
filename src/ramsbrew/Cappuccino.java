package ramsbrew;

// Cappuccino is a specific type of Beverage
public class Cappuccino extends Beverage {

    // Calls the Beverage constructor and gives Cappuccino 1 default shot
    public Cappuccino() {
        super("Cappuccino");
        this.shots = 1;
    }
}

