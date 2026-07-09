public class ReferenceDemo {
    public static void main(String[] args) {
        Dog a = new Dog();
        a.name = "Max";
        a.size = 30;
        a.breed = "Husky";

        Dog b = a;

        System.out.println("Before changing b.name:");
        System.out.println("a.name = " + a.name);
        System.out.println("b.name = " + b.name);

        b.name = "Luna";

        System.out.println();
        System.out.println("After changing b.name:");
        System.out.println("a.name = " + a.name);
        System.out.println("b.name = " + b.name);
    }
}
