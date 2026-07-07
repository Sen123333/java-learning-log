public class BookTestDrive {
    public static void main(String[] args) {
    
    Book one = new Book();
    one.title = "<All Tomorrows>";
    one.author = "C. M. Kosemen";
    one.pages = 150;
    one.isLongBook();
    Book two = new Book();
    two.title = "<I Have No Mouth, and I Must Scream>";
    two.author = "Harlan Ellison";
    two.pages = 100;
    two.isLongBook();
    Book three = new Book();
    three.title = "<1984>";
    three.author = "George Orwell";
    three.pages = 400;
    three.isLongBook();
    }
}
