import java.util.ArrayList;

public class ArrayListApiPractice {
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

    public static void assertBoolean(String testName, boolean expected, boolean actual) {
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
        ArrayList<String> items = new ArrayList<String>();

        items.add("Apple");
        assertEquals("add first item", "1", String.valueOf(items.size()));

        items.add("Banana");
        assertEquals("add second item", "2", String.valueOf(items.size()));

        assertEquals("get index 0", "Apple", items.get(0));

        items.set(1, "Berry");
        assertEquals("set index 1", "Berry", items.get(1));

        assertBoolean("contains Apple", true, items.contains("Apple"));
        assertBoolean("contains Orange", false, items.contains("Orange"));

        assertEquals("indexOf Apple", "0", String.valueOf(items.indexOf("Apple")));

        boolean removedApple = items.remove("Apple");
        assertBoolean("remove Apple", true, removedApple);

        assertEquals("size after remove", "1", String.valueOf(items.size()));

        boolean removedMissing = items.remove("Orange");
        assertBoolean("remove missing item", false, removedMissing);

        items.remove("Berry");
        assertEquals("clear all items", "0", String.valueOf(items.size()));

        assertBoolean("isEmpty", true, items.isEmpty());

        System.out.println("Summary: " + passed + " passed, " + failed + " failed");

        if (failed > 0) {
            System.exit(1);
        }
    }
}


