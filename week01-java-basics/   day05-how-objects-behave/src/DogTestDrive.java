public class DogTestDrive {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.setName("Max");
        d.setSize(10);

        d.printInfo();
        d.bark();

        System.out.println();

        System.out.println("Change size to 60.");
        d.setSize(60);
        d.printInfo();
        d.bark();

        System.out.println();

        System.out.println("Try to set size to -5.");
        d.setSize(-5);
        d.printInfo();
        d.bark();
    }
}
