public class BookArrayDemo {
    public static void main(String[] args) {
        Book[] books = new Book[3];

        books[0] = new Book();
        books[0].title = "Java Basics";
        books[0].author = "Unknown";
        books[0].pages = 100;

        books[1] = new Book();
        books[1].title = "Head First Java";
        books[1].author = "Kathy Sierra and Bert Bates";
        books[1].pages = 350;

        books[2] = new Book();
        books[2].title = "Big History Book";
        books[2].author = "Unknown";
        books[2].pages = 600;

        for (int i = 0; i < books.length; i++) {
            books[i].printInfo();
        }
    }
}
