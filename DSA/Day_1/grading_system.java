import java.util.*;

public class grading_system {

  public static void main(String[] args) {
    //for input
    Scanner scn = new Scanner(System.in);
    int marks = scn.nextInt();
    //logics how to impelement using if_else and logical operator
    if(marks >90 ){
      System.out.println("excellent");
    }else if(marks>80 && marks <= 90){
      System.out.println("good");
    }else if(marks>70 && marks <= 80){
      System.out.println("fair");
    }else if (marks >60 && marks <= 70){
      System.out.println("meets expectations");
    }else{
      System.out.println("below par");
    }
  }
}