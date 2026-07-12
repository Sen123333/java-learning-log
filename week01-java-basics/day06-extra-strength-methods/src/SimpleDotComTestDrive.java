public class SimpleDotComTestDrive {
    public static void assertEquals(String name, String expected, String actual) {
        if (expected.equals(actual)) {
            System.out.println("PASS: " + name);
        } else {
            System.out.println("FAIL: " + name
                    + " expected=" + expected
                    + " actual=" + actual);
        }
    }

    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);

        assertEquals("miss test", "miss", dot.checkYourself("1"));
        assertEquals("first hit test", "hit", dot.checkYourself("2"));
        assertEquals("second hit test", "hit", dot.checkYourself("3"));
        assertEquals("kill test", "kill", dot.checkYourself("4"));

        SimpleDotCom repeatDot = new SimpleDotCom();
        repeatDot.setLocationCells(new int[] {2, 3, 4});
        repeatDot.checkYourself("2");
        assertEquals("repeated guess test", "repeat", repeatDot.checkYourself("2"));

        SimpleDotCom invalidDot = new SimpleDotCom();
        invalidDot.setLocationCells(new int[] {2, 3, 4});
        assertEquals("out of range -1 test", "invalid", invalidDot.checkYourself("-1"));
        assertEquals("out of range 9 test", "invalid", invalidDot.checkYourself("9"));
        assertEquals("non-number test", "invalid", invalidDot.checkYourself("abc"));
    }
}
