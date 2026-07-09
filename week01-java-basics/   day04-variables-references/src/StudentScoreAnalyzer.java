public class StudentScoreAnalyzer {
    public static void main(String[] args) {
        int[] scores = {95, 70, 55, 80, 40};

        int highest = scores[0];
        int lowest = scores[0];
        int total = 0;
        int passingCount = 0;

        System.out.print("Scores: ");

        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");

            if (scores[i] > highest) {
                highest = scores[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
            }

            total = total + scores[i];

            if (scores[i] >= 60) {
                passingCount++;
            }
        }

        double average = total / (double) scores.length;

        System.out.println();
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Average score: " + average);
        System.out.println("Passing students: " + passingCount);
    }
}
