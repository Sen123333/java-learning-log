class Dog {
    private String name;

    public void setName(String newName) {
        if (newName != null && newName.length() > 0) {
            name = newName;
        }
    }

    public String getName() {
        return name;
    }
}

public class PassByValueReassignmentDemo {
    public static void changeDogName(Dog d) {
        d.setName("Changed Dog");

        System.out.println("Inside changeDogName:");
        System.out.println("dog name = " + d.getName());
    }

    public static void replaceDog(Dog d) {
        d = new Dog();
        d.setName("New Dog");

        System.out.println("Inside replaceDog:");
        System.out.println("dog name = " + d.getName());
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Original Dog");

        System.out.println("Before changeDogName:");
        System.out.println("dog name = " + dog.getName());

        changeDogName(dog);

        System.out.println("After changeDogName:");
        System.out.println("dog name = " + dog.getName());

        System.out.println();

        System.out.println("Before replaceDog:");
        System.out.println("dog name = " + dog.getName());

        replaceDog(dog);

        System.out.println("After replaceDog:");
        System.out.println("dog name = " + dog.getName());
    }
}
