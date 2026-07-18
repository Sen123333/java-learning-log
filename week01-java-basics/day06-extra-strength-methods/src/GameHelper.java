import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
    private BufferedReader reader;

    public GameHelper() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getUserInput(String prompt) {
        System.out.print(prompt);

        try {
            String inputLine = reader.readLine();

            if (inputLine == null) {
                return "quit";
            }

            inputLine = inputLine.trim();

            if (inputLine.equalsIgnoreCase("q") || inputLine.equalsIgnoreCase("quit")) {
                return "quit";
            }

            if (inputLine.length() == 0) {
                return "invalid";
            }

            return inputLine;
        } catch (IOException ex) {
            return "invalid";
        }
    }
}
