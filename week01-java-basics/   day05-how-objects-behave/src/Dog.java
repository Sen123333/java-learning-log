public class Dog {
    private String name;
    private int size;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setSize(int newSize) {
        if (newSize > 0) {
            size = newSize;
        } else {
            System.out.println("Invalid size. Size was not changed.");
        }
    }

    public int getSize() {
        return size;
    }

    public void bark() {
        if (size < 20) {
            System.out.println(name + " says: yip yip!");
        } else if (size < 50) {
            System.out.println(name + " says: Ruff!");
        } else {
            System.out.println(name + " says: WOOF WOOF!");
        }
    }

    public void printInfo() {
        System.out.println("Dog name: " + name);
        System.out.println("Dog size: " + size);
    }
}
