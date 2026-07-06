public class LoopyModified {
    public static void main(String[] args) {
        int x = 1;
        int sum = 0;
        while (x <= 10){
            System.out.println(x);
            sum = sum + x;
            x = x + 1;
    }
        System.out.println("Sum is:"+ sum);
}
}
