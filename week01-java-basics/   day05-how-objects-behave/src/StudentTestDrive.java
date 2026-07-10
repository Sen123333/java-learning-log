public class StudentTestDrive {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Tom");
        s1.setScore(95);
        s1.printInfo();

        System.out.println();

        Student s2 = new Student();
        s2.setName("Amy");
        s2.setScore(60);
        s2.printInfo();

        System.out.println();

        Student s3 = new Student();
        s3.setName("Bob");
        s3.setScore(59);
        s3.printInfo();

        System.out.println();

        System.out.println("Try invalid score -1:");
        s3.setScore(-1);
        System.out.println("Score: " + s3.getScore());

        System.out.println();

        System.out.println("Try invalid score 101:");
        s3.setScore(101);
        System.out.println("Score: " + s3.getScore());
    }
}
