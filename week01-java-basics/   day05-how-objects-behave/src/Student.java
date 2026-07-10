public class Student {
    private String name;
    private int score;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setScore(int newScore) {
        if (newScore >= 0 && newScore <= 100) {
            score = newScore;
        } else {
            System.out.println("Invalid score. Score was not changed.");
        }
    }

    public int getScore() {
        return score;
    }

    public boolean isPassing() {
        return score >= 60;
    }

    public String getLetterGrade() {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public void printInfo() {
        System.out.println("Student: " + name);
        System.out.println("Score: " + score);
        System.out.println("Passing: " + isPassing());
        System.out.println("Letter grade: " + getLetterGrade());
    }
}
