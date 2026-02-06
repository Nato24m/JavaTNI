
public class CupCake extends Bakery {
    private int piece;

    public CupCake ( int piece,String flavor, double unitPrice) {
        super(flavor,unitPrice);
        this.piece = piece;
    }
    boolean isPackingBox() {
        return piece >= 6;
    }
    int getBoxNumber() {
        if (isPackingBox()) {
            return this.piece / 6;
        }
        return 0;
    }
    int getBagNumber() {
        return this.piece % 6;
    }
    //เพิ่ม
    @Override
    int getPackingCost() {
        if (isPackingBox())
            return getBoxNumber() * super.getPackingCost();
        return 0;
    }
    double calculateTotalPrice() {
        return this.piece * getUnitPrice() + getPackingCost() + (getBagNumber() * 0.5);
    }
    public String toString() {
        return super.toString() +
                "\nCup Cake (" + super.getFlavor() + ") with " +
                (isPackingBox() ? getBoxNumber() + " Box " : " ") + getBagNumber() + " Bag " +
                "\nTotal price of Cup Cake = " + calculateTotalPrice();
    }
}

