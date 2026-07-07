class Student{
    String name;
    int age;
    int score;
    void printInfo(){
        System.out.println("Student "+name+" is "+age+" years old. His score is "+score);
    }
    void isPassing(){
        if(score < 60){
            System.out.println("Student did not pass the test.");
        }
        else{
            System.out.println("Student passed the test.");
        }
        }
}
