public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);

        if (breed == null || breed.trim().length() == 0) {
            this.breed = "Unknown";
        } else {
            this.breed = breed.trim();
        }
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String makeSound() {
        return "Woof";
    }

    public String fetch() {
        return getName() + " fetches the ball";
    }
}
