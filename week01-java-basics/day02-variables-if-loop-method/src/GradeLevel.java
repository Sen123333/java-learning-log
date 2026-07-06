
class Score{
    int studentscore;
}
class Gradedetector{
    void grade(){
        Score one = new Score();
        one.studentscore = 80;
        if (one.studentscore >= 90){
            System.out.println("A");
        }
        else if (one.studentscore >= 80){
            System.out.println("B");
        }
         else if (one.studentscore >= 70){
            System.out.println("C");
        }
         else if (one.studentscore >= 60){
            System.out.println("D");
        }
         else{
            System.out.println("F");
        }
    
    }

}
public class GradeLevel {
    public static void main(String[] args) {
        Gradedetector two = new Gradedetector();
        two.grade();
    }
    
}
