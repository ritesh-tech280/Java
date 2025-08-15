
import java.util.Scanner;

public class conditional {
   public static void main(String[] args) {
      String day = "Sunday";
           // if else Statments 
      if(day != "Sunday"){
      System.out.println("Yes you go to College.");
      }
      else {
      System.out.println("No Boy You don't need to go college.");
      }
      // if else ladder statments
      int age = 56 ;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your age :");
      age = sc.nextInt();
      if(age > 56){
      System.out.println("You are Experieced");
      }
      else if ( age > 46){
      System.out.println("You are semi-experienced");
      }
      else if(age > 36) {
      System.out.println("You are semi-semi-experieced");
      }
      else {
      System.out.println("You are a fresher");
      }  

      // switch case statements

      String choice;
      System.out.print("Enter your choice :");
      choice = sc.next();
      switch (choice) {
         case "Shubham" -> System.out.println("You are going to become adult.");
         case "Harry" -> System.out.println("You are going to become to join a job");
         case "Ritesh" -> System.out.println("You are goig to retire.");
         default -> System.out.println("Enjoy your life");

      }
      System.out.println("You are enjoying the java course.");

      sc.close();
   }
}
