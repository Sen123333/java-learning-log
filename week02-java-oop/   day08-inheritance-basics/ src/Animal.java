public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        if (name == null || name.trim().length() == 0) {
            this.name = "Unknown";
        } else {
            this.name = name.trim();
        }

        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String move() {
        return name + " moves";
    }

    public String makeSound() {
        return "Some animal sound";
    }
}
