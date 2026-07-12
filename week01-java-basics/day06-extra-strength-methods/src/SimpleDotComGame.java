public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom dot = new SimpleDotCom();

        int randomStart = (int) (Math.random() * 5);
        int[] locations = {randomStart, randomStart + 1, randomStart + 2};

        dot.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("Enter a number: ");
            String result = dot.checkYourself(guess);

            numOfGuesses++;

            System.out.println(result);

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
