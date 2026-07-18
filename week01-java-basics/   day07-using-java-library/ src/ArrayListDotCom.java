import java.util.ArrayList;

public class ArrayListDotCom {
    private ArrayList<Integer> locationCells = new ArrayList<Integer>();

    public void setLocationCells(ArrayList<Integer> locations) {
        if (locations == null) {
            throw new IllegalArgumentException("locations cannot be null");
        }

        locationCells = new ArrayList<Integer>(locations);
    }

    public String checkYourself(String stringGuess) {
        if (stringGuess == null) {
            return "invalid";
        }

        String cleanGuess = stringGuess.trim();

        if (cleanGuess.length() == 0) {
            return "invalid";
        }

        int guess;

        try {
            guess = Integer.parseInt(cleanGuess);
        } catch (NumberFormatException ex) {
            return "invalid";
        }

        if (guess < 0 || guess > 6) {
            return "invalid";
        }

        if (locationCells.contains(guess)) {
            locationCells.remove(Integer.valueOf(guess));

            if (locationCells.isEmpty()) {
                return "kill";
            } else {
                return "hit";
            }
        }

        return "miss";
    }

    public int getRemainingCellsCount() {
        return locationCells.size();
    }
}
