package ramsbrew;
//Concrete builder class that customizes a beverage
public class CustomBeverageBuilder implements BeverageBuilder {
    private Beverage beverage;

    // Constructor receives the beverage to customize it
    public CustomBeverageBuilder(Beverage beverage) {
        this.beverage = beverage;
    }

    // Sets the beverage temperature and returns the builder
    public BeverageBuilder setTemperature(String temperature) {
        beverage.setTemperature(temperature);
        return this;
    }

    // Sets the beverage size and returns the builder
    public BeverageBuilder setSize(String size) {
        beverage.setSize(size);
        return this;
    }

    // Sets the milk type and returns the builder
    public BeverageBuilder setMilk(String milk) {
        beverage.setMilk(milk);
        return this;
    }

    // Sets the number of shots and returns the builder
    public BeverageBuilder setShots(int shots) {
        beverage.setShots(shots);
        return this;
    }

    // Sets the sweetener and returns the builder
    public BeverageBuilder setSweetener(String sweetener) {
        beverage.setSweetener(sweetener);
        return this;
    }

    // Returns the finished customized beverage
    public Beverage build() {
        return beverage;
    }
}
