public class IfElsePractice {
    public static void main(String[] args) {
        int score = 80;
        int n = 4;
        if (score >= 90){
            System.out.println("A");
        }
        else if (score >= 80){
            System.out.println("B");
        }
         else if (score >= 70){
            System.out.println("C");
        }
         else if (score >= 60){
            System.out.println("D");
        }
         else{
            System.out.println("F");
        }
    
         if (n % 2 == 0){
            System.out.println("This number is not odd.");
        }
         else{
            System.out.println("This number is odd.");
         }
    }
}
