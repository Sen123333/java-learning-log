public class MethodPractice {

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public int maxOfThree(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        MethodPractice practice = new MethodPractice();
        
        System.out.println("Is 4 even? " + practice.isEven(4));
        System.out.println("Is 7 even? " + practice.isEven(7));
        
        System.out.println("Max of 5, 8, 3: " + practice.maxOfThree(5, 8, 3));
        
        System.out.println("Factorial of 5: " + practice.factorial(5));
        System.out.println("Factorial of 0: " + practice.factorial(0));
    }
}
