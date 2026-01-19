public class Book {
    // - title:String
    private String title;
    // - totalBook:int
    private int totalBook;
    // - availableBook:int
    private int availableBook;
    // ----------------------------------------------------------------------------

    // + Book(title:String,totalBook:int)
    Book(String title, int totalBook) {
        this.title = title;
        this.totalBook = totalBook;
        this.availableBook = totalBook;
    }
    // + Book(title:String)
    Book(String title) {
        this.title = title;
        this.totalBook = 0;
        this.availableBook = 0;
    }
    // + Book()
    Book() {
        this.title = "";
        this.totalBook = 0;
        this.availableBook = 0;
    }
    // + getTitle():String
    String getTitle() {
        return this.title;
    }
    // + getTotalBook():int
    int getTotalBook() {
        return this.totalBook;
    }
    // + getAvailableBook():int
    int getAvailableBook() {
        return this.availableBook;
    }
    // + borrowBook():void
    void borrowBook() {
        if (this.availableBook > 0) {
            this.availableBook--;
        }
    }
    // + returnBook():void
    void returnBook() {
        if (this.availableBook < this.totalBook) {
            this.availableBook++;
        }
    }
}
