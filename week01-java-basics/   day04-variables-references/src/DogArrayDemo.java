public class DogArrayDemo {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];

        dogs[0] = new Dog();
        dogs[0].name = "Max";
        dogs[0].size = 10;
        dogs[0].breed = "Poodle";

        dogs[1] = new Dog();
        dogs[1].name = "Luna";
        dogs[1].size = 35;
        dogs[1].breed = "Husky";

        dogs[2] = new Dog();
        dogs[2].name = "Buddy";
        dogs[2].size = 70;
        dogs[2].breed = "Golden Retriever";

        for (int i = 0; i < dogs.length; i++) {
            dogs[i].bark();
        }
    }
}
