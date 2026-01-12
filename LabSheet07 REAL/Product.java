public class Product {
    //att
    public String name;
    public double price = 0;
    public int quantity = 0;
    //method
    public void  addStock(int amount) {
        if (amount > 0 ) {
            quantity +=amount;
            System.out.print("Added "+ amount+ " items to stock");
        }
    }
    public void  sell(int amount) {
        if (amount <= quantity ) {
            quantity-=amount;
            System.out.print("\nSold " + amount + " items"); }
        else {
            System.out.print("\nNot enough items in stock…");
        }
    }
    public void  changePrice(double newPrice) {
        if (newPrice > 0) {
            price = newPrice;
            System.out.print("Change price to " + newPrice + " baht");
        }
    }
    public double  stockValue() {
        return price * quantity;
    }
    public void   showInfo() {
        System.out.println("Name        : " + name);
        System.out.println("Price       : " + price + " Baht/Item");
        System.out.println("Stock       : " + quantity + " Items");
        System.out.println("Stock Result: " + stockValue() + " Baht");
    }
}
