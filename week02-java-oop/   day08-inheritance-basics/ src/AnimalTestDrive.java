public class AnimalTestDrive {
    private static int passed = 0;
    private static int failed = 0;

    public static void assertEquals(String testName, String expected, String actual) {
        if (expected.equals(actual)) {
            System.out.println("PASS: " + testName);
            passed++;
        } else {
            System.out.println("FAIL: " + testName
                    + " expected=" + expected
                    + " actual=" + actual);
            failed++;
        }
    }

    public static void assertIntEquals(String testName, int expected, int actual) {
        if (expected == actual) {
            System.out.println("PASS: " + testName);
            passed++;
        } else {
            System.out.println("FAIL: " + testName
                    + " expected=" + expected
                    + " actual=" + actual);
            failed++;
        }
    }

    public static void assertBooleanEquals(String testName, boolean expected, boolean actual) {
        if (expected == actual) {
            System.out.println("PASS: " + testName);
            passed++;
        } else {
            System.out.println("FAIL: " + testName
                    + " expected=" + expected
                    + " actual=" + actual);
            failed++;
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Max", 3, "Husky");
        Cat cat = new Cat("Luna", 2);
        Bird bird = new Bird("Sky", 1, true);

        assertEquals("dog name from superclass constructor", "Max", dog.getName());
        assertIntEquals("dog age from superclass constructor", 3, dog.getAge());

        assertEquals("cat name from superclass constructor", "Luna", cat.getName());
        assertEquals("bird name from superclass constructor", "Sky", bird.getName());

        assertEquals("dog inherited move", "Max moves", dog.move());
        assertEquals("cat inherited move", "Luna moves", cat.move());

        assertEquals("dog override makeSound", "Woof", dog.makeSound());
        assertEquals("cat override makeSound", "Meow", cat.makeSound());
        assertEquals("bird override makeSound", "Tweet", bird.makeSound());

        assertEquals("bird override move", "Sky flies through the air", bird.move());

        assertEquals("dog unique fetch", "Max fetches the ball", dog.fetch());
        assertEquals("cat unique scratch", "Luna scratches the sofa", cat.scratch());
        assertEquals("bird unique fly", "Sky is flying", bird.fly());

        assertEquals("dog breed getter", "Husky", dog.getBreed());
        assertBooleanEquals("bird canFly getter", true, bird.canFly());

        System.out.println("Summary: " + passed + " passed, " + failed + " failed");

        if (failed > 0) {
            System.exit(1);
        }
    }
}
