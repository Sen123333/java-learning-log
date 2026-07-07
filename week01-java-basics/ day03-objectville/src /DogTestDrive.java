public class DogTestDrive {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.name = "Max";
        one.size = "100cm.";
        one.breed = "German Shepherd";
        one.bark();
        Dog two = new Dog();
        two.name = "Luna";
        two.size = "103cm";
        two.breed = "Golden Retriever";
        two.bark();
        Dog three = new Dog();
        three.name = "Milo";
        three.size = "90cm";
        three.breed = "Bulldog";
        three.bark();
    }
}
