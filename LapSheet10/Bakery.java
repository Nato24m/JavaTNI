public class Bakery {
    private String flavor;
    private double unitPrice;

    // เพิ่ม
    private int packingCost = 5;

    public Bakery(String flavor,double unitPrice) {
        this.flavor= flavor;
        this.unitPrice = unitPrice;
    }
    Bakery() {
        this("",0.0);
    }
    String getFlavor() {
        return this.flavor;
    }
    double getUnitPrice() {
        return this.unitPrice;
    }
    //เพิ่ม
    int getPackingCost() {
        return this.packingCost;
    }
    int getCookie() {
        return this.packingCost;
    }
    double calculateTotalPrice() {
        return  this.unitPrice + this.packingCost;
    }
    public String toString() {
        return "Thank you for your order!";
    }
}