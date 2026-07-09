public class Book {
    String title;
    String author;
    int pages;

    public boolean isLongBook() {
        return pages >= 300;
    }

    public void printInfo() {
        if (isLongBook()) {
            System.out.println(title + " has " + pages + " pages. It is a long book.");
        } else {
            System.out.println(title + " has " + pages + " pages. It is not a long book.");
        }
    }
}
