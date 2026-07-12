public class SimpleDotCom {
    private int[] locationCells;
    private boolean[] hitCells;
    private int numOfHits;

    public void setLocationCells(int[] locations) {
        locationCells = locations;
        hitCells = new boolean[locations.length];
        numOfHits = 0;
    }

    public String checkYourself(String stringGuess) {
        int guess;

        try {
            guess = Integer.parseInt(stringGuess);
        } catch (NumberFormatException ex) {
            return "invalid";
        }

        if (guess < 0 || guess > 6) {
            return "invalid";
        }

        for (int i = 0; i < locationCells.length; i++) {
            if (guess == locationCells[i]) {
                if (hitCells[i]) {
                    return "repeat";
                }

                hitCells[i] = true;
                numOfHits++;

                if (numOfHits == locationCells.length) {
                    return "kill";
                } else {
                    return "hit";
                }
            }
        }

        return "miss";
    }
}
