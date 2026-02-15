
package CoffeeShop;

public class Frappuccino extends Drink {
    private boolean whipped;

    public Frappuccino(String size, boolean whipped) {
        super("Frappuccino", 40, size);
        this.whipped = whipped;
    }

    @Override
    public double calculateFinalPrice() {
        double whipped_Price = whipped ? 15 : 0;
        return getBasePrice() + whipped_Price + getSizExtra();
    }

    @Override
    public String toString() {
        return super.toString() +
                "Total price = " + calculateFinalPrice() + " Baht";
    }
}
