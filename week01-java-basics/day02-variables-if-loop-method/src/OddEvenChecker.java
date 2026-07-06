import java.util.Scanner;
class Number{
    void userinput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:");
        int usernumber = scanner.nextInt();
        if (usernumber % 2 == 0){
            System.out.println("The number you enter is an even number.");
        }
        else{
             System.out.println("The number you enter is an odd number.");
        }

    }
}
    
public class OddEvenChecker {
    public static void main(String[] args) {
        Number one = new Number();
        one.userinput();
    }
    
}

