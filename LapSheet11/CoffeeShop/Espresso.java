
package CoffeeShop;

public class Espresso extends Drink {

    private int shot;

    public Espresso (String size) {
        super("Espresso",35,size);
        this.shot=0;

    }
    void addShot(int shot){
        this.shot += shot;
    }

    int getShot() {
        return shot;
    }

    @Override
    public double calculateFinalPrice() {
        return getBasePrice() + (shot * 15) + getSizExtra();
    }

    public String toString() {
        String Result = super.toString();
        return Result + "Total price = " + calculateFinalPrice() + " Baht";
    }

}
