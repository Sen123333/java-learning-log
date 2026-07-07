import java.util.Scanner;

class Number {
    int answer;
    int userInput;

    void inputGuess() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        userInput = in.nextInt();
    }
    
    void checkGuess() {
        if (userInput < answer) {
            System.out.println("Too low");
        } else if (userInput == answer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Too high");
        }
    }
}

public class SimpleGuessingGame {
    public static void main(String[] args) {
        Number game = new Number();
        game.answer = 7;
        game.inputGuess();
        game.checkGuess();
    }
}
