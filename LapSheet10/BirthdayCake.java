
public class BirthdayCake extends Bakery {
    private String message;
    private double pound;

    BirthdayCake(String message, double pound ,String flavor,double unitPrice) {
        super(flavor,unitPrice);
        this.message = message;
        this.pound = pound;
    }
    public String getMessage() {
        return  this.message;
    }
    public void changeMessage(String new_message) {
        this.message = new_message;
    }
    //เพิ่ม
    @Override
    int getPackingCost() {
        if (this.pound >= 3)
            return 10;
        return super.getPackingCost();
    }
    @Override
    double calculateTotalPrice() {
        return  getUnitPrice() * this.pound + getPackingCost();
    }
    public String toString() {
        return super.toString() +
                "\n" + super.getFlavor() + " birthday cake (message=" + this.message + ")" +
                "\nTotal price of Birthday Cake = " + calculateTotalPrice();
    }
}