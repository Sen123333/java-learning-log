public class PassByValueDemo {
    public static void changePrimitive(int x) {
        x = 99;
        System.out.println("Inside changePrimitive:");
        System.out.println("x = " + x);
    }

    public static void changeDog(Dog d) {
        d.setName("Changed");
        System.out.println("Inside changeDog:");
        System.out.println("dog name = " + d.getName());
    }

    public static void main(String[] args) {
        int x = 10;

        System.out.println("Before changePrimitive:");
        System.out.println("x = " + x);

        changePrimitive(x);

        System.out.println("After changePrimitive:");
        System.out.println("x = " + x);

        System.out.println();

        Dog dog = new Dog();
        dog.setName("Max");
        dog.setSize(20);

        System.out.println("Before changeDog:");
        System.out.println("dog name = " + dog.getName());

        changeDog(dog);

        System.out.println("After changeDog:");
        System.out.println("dog name = " + dog.getName());
    }
}
