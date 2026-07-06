public class MaxOfThree {
    public int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public static void main(String[] args) {
        MaxOfThree maxFinder = new MaxOfThree();
        
        System.out.println("Max of 5, 8, 3: " + maxFinder.findMax(5, 8, 3));
        System.out.println("Max of 10, 10, 10: " + maxFinder.findMax(10, 10, 10));
        System.out.println("Max of -1, -5, 0: " + maxFinder.findMax(-1, -5, 0));
    }
}
