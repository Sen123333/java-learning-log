class Book{
    String title;
    String author;
    int pages;
    void isLongBook(){
        if(pages<200){
            System.out.println(title+" by "+author+" has "+pages+" pages."+"It's not a long book.");
        }
        else{
             System.out.println(title+" by "+author+" has "+pages+" pages."+"It's a long book.");
        }
    }
}
