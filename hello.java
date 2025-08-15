import java.util.Scanner;
 
public class hello {
    public static void main(String args [] ) {
      // String name = "Ritesh";
      // System.out.println(name);

      // int value = name.length();
      // System.out.println("String Value = " + value);

      // System.out.println(name.toUpperCase());
      // System.out.println(name.toLowerCase());
      // System.out.println(name.charAt(4));

      // System.out.println("He said \'he is a good boy.\'");
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter you marks ");
       int math , chem , phy ;
       System.out.print("Enter your mathematics marks :");
       math = sc.nextInt();
       System.out.print("Enter your chem marks :");
       chem = sc.nextInt();
       System.out.print("Enter your physics marks :");
       phy = sc.nextInt();
       int total = math + chem + phy ;
       float ptg =  ( total * 100 )/300 ;
       System.out.println("Your Percentage is : " + ptg + " and");
       if ( ptg >= 33 && ptg <= 50){
          System.out.println("Congratulations, you are Passed the examination. ");
       }
       else if(ptg >= 50 && ptg <= 60){
        System.out.println("Congratulation, You are passed. and your grade is \'C\'. ");
       }
       else if(ptg >= 60 && ptg <= 70){
        System.out.println("Congratulation, You are passed. and your grade is \'B\'. ");
       }
       else if(ptg >= 70 && ptg <= 80){
        System.out.println("Congratulation, You are passed. and your grade is \'B+\'. ");
       }
       else if(ptg >= 80 && ptg <= 90){
        System.out.println("Congratulation, You are passed. and your grade is \'A\'. ");
       }
       else if(ptg >= 90 && ptg <= 100){
        System.out.println("Congratulation, You are passed. and your grade is \'A+\'. ");
       }
       else {
        System.out.println("Oops You are failed.");
       }
     System.out.println("Have a Good day Man.");
     
      

     sc.close();
    }
}
