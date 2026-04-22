package ramsbrew;

    public interface BeverageBuilder {

        // Sets the temperature of the beverage
        BeverageBuilder setTemperature(String temperature);

        // Sets the size of the beverage
        BeverageBuilder setSize(String size);

        // Sets the milk type of the beverage
        BeverageBuilder setMilk(String milk);

        // Sets the number of shots
        BeverageBuilder setShots(int shots);

        // Sets the sweetener type
        BeverageBuilder setSweetener(String sweetener);

        // Returns the finished beverage object
        Beverage build();
    }