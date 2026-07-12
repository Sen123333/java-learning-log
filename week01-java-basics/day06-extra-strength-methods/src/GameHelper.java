import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
    public String getUserInput(String prompt) {
        String inputLine = null;

        System.out.print(prompt);

        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in)
            );

            inputLine = reader.readLine();

            if (inputLine.length() == 0) {
                return "invalid";
            }
        } catch (IOException ex) {
            System.out.println("IOException: " + ex);
            return "invalid";
        }

        return inputLine;
    }
}
