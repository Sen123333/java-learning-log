public class RandomRangeDemo {
    public static void main(String[] args) {
        boolean allPass = true;

        for (int i = 0; i < 20; i++) {
            int randomStart = (int) (Math.random() * 5);

            if (randomStart >= 0 && randomStart <= 4) {
                System.out.println("Random start: " + randomStart + " PASS");
            } else {
                System.out.println("Random start: " + randomStart + " FAIL");
                allPass = false;
            }
        }

        if (allPass) {
            System.out.println("Final result: PASS");
        } else {
            System.out.println("Final result: FAIL");
        }
    }
}
