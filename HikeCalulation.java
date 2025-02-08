import java.util.*;
public class HikeCalulation{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter your salary Amount for \"Hike Calculation\":");
    Double sal=s.nextDouble();
    if(sal<=10000){
      sal=sal+(sal*0.2)+(sal*0.8);
      System.out.printf("Less than are equal to 10000 : %.2f",sal);
    }
    else if(sal<=20000){
      sal=sal+(sal*0.25)+(sal*0.9);
      System.out.printf("Less than are equal to 20000 : %.2f",sal);
    }
    else if(sal>20000){
      sal=sal+(sal*0.3)+(sal*0.95);
      System.out.printf("Greater than are equal to 20000 : %.2f",sal);
    }
  }
}
