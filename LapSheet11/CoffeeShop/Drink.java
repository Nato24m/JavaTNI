
package CoffeeShop;

public abstract class Drink {
    private String drinkName;
    private double basePrice;
    private String size;

    public Drink (String drinkName,double basePrice,String size) {
        this.drinkName = drinkName;
        this.basePrice = basePrice;
        this.size = size;
    }

    public String getDrinkName() {
        return this.drinkName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getSizExtra() {
        if (this.size.equalsIgnoreCase("s"))
            return 0;
        if (this.size.equalsIgnoreCase("m"))
            return 10;
        if (this.size.equalsIgnoreCase("l"))
            return 15;
        return -1;
    }

    public abstract double calculateFinalPrice();

    public String toString() {
        return "Your order: " + this.drinkName +
                " (Size: " + this.size + ")\n";
    }
}
