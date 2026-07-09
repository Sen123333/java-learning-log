public class Dog {
    String name;
    int size;
    String breed;

    public void bark() {
        if (size < 20) {
            System.out.println(name + " says: Woof!");
        } else if (size < 50) {
            System.out.println(name + " says: Ruff!");
        } else {
            System.out.println(name + " says: Bark!");
        }
    }
}
