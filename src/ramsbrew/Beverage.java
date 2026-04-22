package ramsbrew;

// Base class for all beverages
public class Beverage {
    protected String name;
    protected String temperature;
    protected String size;
    protected String milk;
    protected int shots;
    protected String sweetener;

    // Constructor sets default values for every drink
    public Beverage(String name) {
        this.name = name;
        this.temperature = "Hot";
        this.size = "Medium";
        this.milk = "Whole";
        this.shots = 0;
        this.sweetener = "None";
    }

    // Returns the beverage name
    public String getName() {
        return name;
    }

    // Sets drink temperature
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    // Sets drink size
    public void setSize(String size) {
        this.size = size;
    }

    // Sets milk type
    public void setMilk(String milk) {
        this.milk = milk;
    }

    // Sets number of espresso shots
    public void setShots(int shots) {
        this.shots = shots;
    }

    // Sets sweetener type
    public void setSweetener(String sweetener) {
        this.sweetener = sweetener;
    }

    // Calculates the final price of the beverage
    public double getPrice() {
        double price = 0;

        // Base price depends on the drink type
        if (name.equals("Coffee")) {
            price = 2.50;
        } else if (name.equals("Latte")) {
            price = 4.50;
        } else if (name.equals("Cappuccino")) {
            price = 4.75;
        } else if (name.equals("Tea")) {
            price = 2.25;
        }

        // Add extra cost based on size
        if (size.equals("Medium")) {
            price += 0.50;
        } else if (size.equals("Large")) {
            price += 1.00;
        }

        // Add extra cost for non dairy milk
        if (milk.equals("Almond") || milk.equals("Oat") || milk.equals("Soy")) {
            price += 0.75;
        }

        // Add cost for espresso shots
        price += shots * 0.50;

        return price;
    }

    // Displays all drink information
    public void showInfo() {
        System.out.println("Drink: " + name);
        System.out.println("Temperature: " + temperature);
        System.out.println("Size: " + size);
        System.out.println("Milk: " + milk);
        System.out.println("Shots: " + shots);
        System.out.println("Sweetener: " + sweetener);
        System.out.println("Price: $" + getPrice());
    }
}
