import java.util.ArrayList;

public class ArrayListDotComTestDrive {
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

    public static void assertThrows(String testName) {
        ArrayListDotCom dot = new ArrayListDotCom();

        try {
            dot.setLocationCells(null);
            System.out.println("FAIL: " + testName + " expected exception");
            failed++;
        } catch (IllegalArgumentException ex) {
            System.out.println("PASS: " + testName);
            passed++;
        }
    }

    public static ArrayList<Integer> makeLocations(int a, int b, int c) {
        ArrayList<Integer> locations = new ArrayList<Integer>();
        locations.add(a);
        locations.add(b);
        locations.add(c);
        return locations;
    }

    public static void main(String[] args) {
        testMissHitKill();
        testRepeatedGuess();
        testInvalidInputs();
        testTrimInput();
        testDefensiveCopy();
        testResetLocations();
        testUninitializedState();
        testNullLocations();
        testAfterKill();

        System.out.println("Summary: " + passed + " passed, " + failed + " failed");

        if (failed > 0) {
            System.exit(1);
        }
    }

    public static void testMissHitKill() {
        ArrayListDotCom dot = new ArrayListDotCom();
        dot.setLocationCells(makeLocations(2, 3, 4));

        assertEquals("miss test", "miss", dot.checkYourself("1"));
        assertEquals("first hit test", "hit", dot.checkYourself("2"));
        assertEquals("second hit test", "hit", dot.checkYourself("3"));
        assertEquals("kill test", "kill", dot.checkYourself("4"));
    }

    public static void testRepeatedGuess() {
        ArrayListDotCom dot = new ArrayListDotCom();
        dot.setLocationCells(makeLocations(2, 3, 4));

        dot.checkYourself("2");
        assertEquals("repeated guess becomes miss", "miss", dot.checkYourself("2"));
    }

    public static void testInvalidInputs() {
        ArrayListDotCom dot = new ArrayListDotCom();
        dot.setLocationCells(makeLocations(2, 3, 4));

        assertEquals("null input test", "invalid", dot.checkYourself(null));
        assertEquals("empty input test", "invalid", dot.checkYourself(""));
        assertEquals("non-number test", "invalid", dot.checkYourself("abc"));
        assertEquals("negative input test", "invalid", dot.checkYourself("-1"));
        assertEquals("out of range test", "invalid", dot.checkYourself("9"));
    }

    public static void testTrimInput() {
        ArrayListDotCom dot = new ArrayListDotCom();
        dot.setLocationCells(makeLocations(2, 3, 4));

        assertEquals("trim input test", "hit", dot.checkYourself(" 2 "));
    }

    public static void testDefensiveCopy() {
        ArrayList<Integer> locations = makeLocations(2, 3, 4);

        ArrayListDotCom dot = new ArrayListDotCom();
        dot.setLocationCells(locations);

        locations.set(0, 6);

        assertEquals("defensive copy test", "hit", dot.checkYourself("2"));
    }

    public static void testResetLocations() {
        ArrayListDotCom dot = new ArrayListDotCom();

        dot.setLocationCells(makeLocations(2, 3, 4));
        dot.checkYourself("2");

        dot.setLocationCells(makeLocations(0, 1, 2));

        assertEquals("reset location test", "hit", dot.checkYourself("0"));
    }

    public static void testUninitializedState() {
        ArrayListDotCom dot = new ArrayListDotCom();

        assertEquals("uninitialized checkYourself test", "miss", dot.checkYourself("2"));
        assertIntEquals("uninitialized remaining count test", 0, dot.getRemainingCellsCount());
    }

    public static void testNullLocations() {
        assertThrows("null locations test");
    }

    public static void testAfterKill() {
        ArrayListDotCom dot = new ArrayListDotCom();
        dot.setLocationCells(makeLocations(2, 3, 4));

        dot.checkYourself("2");
        dot.checkYourself("3");
        assertEquals("kill test before after-kill test", "kill", dot.checkYourself("4"));
        assertEquals("guess after kill test", "miss", dot.checkYourself("4"));
    }
}
