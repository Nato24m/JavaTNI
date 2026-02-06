public class CreamHorn extends Bakery {
    // Attribute
    private int pastry;

    CreamHorn(int pastry,String flavor,double unitPrice) {
        super(flavor,unitPrice);
        this.pastry = pastry;
    }
    //method
    public int getFreeOne_CreamHorn() {
        return pastry / 5;
    }
    @Override
    double calculateTotalPrice() {
        return (pastry - getFreeOne_CreamHorn()) * getUnitPrice();
    }
    public String toString() {
        return  super.toString() +
                "\n" + super.getFlavor()+ "_CreamHorn" +
                "\nPastry CreamHorn = " + pastry +
                " (get free) = " + getFreeOne_CreamHorn() + "!!!" +
                "\nTotal price CreamHorn = " + calculateTotalPrice();
    }
}
