package ramsbrew;

// Latte is a specific type of Beverage
public class Latte extends Beverage {

    // Calls the Beverage constructor and gives Latte 1 default shot
    public Latte() {
        super("Latte");
        this.shots = 1;
    }
}
