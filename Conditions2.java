import java.util.Scanner;
public class Conditions2 {
  public static void main(String[] args){
    System.out.println("please enter score:");
    Scanner s = new Scanner(System.in);
    int i = s.nextInt();
    if(i>=90){
      System.out.println("score is AA");
    }
    else if(i>=80){
      System.out.println("score is BB:");
    }
    else if (i>=70){
      System.out.println("score is CC:");
    }else{
      System.out.println("score is FF:");
    }
  
  }
  
  
  
}
