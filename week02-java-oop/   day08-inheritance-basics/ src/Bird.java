public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public boolean canFly() {
        return canFly;
    }

    @Override
    public String makeSound() {
        return "Tweet";
    }

    @Override
    public String move() {
        if (canFly) {
            return getName() + " flies through the air";
        } else {
            return getName() + " walks on the ground";
        }
    }

    public String fly() {
        if (canFly) {
            return getName() + " is flying";
        } else {
            return getName() + " cannot fly";
        }
    }
}
