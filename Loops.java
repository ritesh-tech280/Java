import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
         int n ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print odd numbers up to that number:");
         n = sc.nextInt();
        //while loop
        while(n <= 200) {
            System.out.println("This loop number is :" + n);
            n++;
        }

        // do-while loop
             int i = 1;
        do {
            System.out.println("This loop number is :" + i);
            i = i + 2;
        } while (i <= n);

        // for loop
        int oddNumber = 1;
        for(i = 1 ; i <= 5; i++) {
            System.out.println("Odd number " + i + " is: " + oddNumber);
             oddNumber = 2 * i + 1;
        }

        //break statement
        for (i = 1 ; i <= 10; i++){
            if(i == 5){
                break;
            }
            System.out.println("This loop number is :" + i);
    }
        // continue statement
        for (i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // Skip the rest of the loop when i is 5
            }
            System.out.println("This loop number is :" + i);
        }
        

         //Problems using loops
         for(  i = 4; i >= 1; i--) {
            for(int j = 0 ; j < i; j++){
            System.out.print("*");
         } System.out.print("\n");
        }
           
        // sum of even numbers from 1 to n 
          n =  10 ;
          i = 1;
        int sum = 0;
        for( i = 1 ; i <= n ; i++) {
            if(i % 2 == 0) {
                sum = sum + i ;
            }
        }  System.out.println("The sum of even numbers from 1 to " + n + " is: " + sum);
 
          // Program to print the tablke of to 
         int table;
         int num = 2 ;
         for(  i = 1 ; i <= 10 ; i++){
            table = num * i ;
                System.out.println(table);
         }

        // Program to print the table of 10 in Reverse 
        int num10 = 10 ;
        for( i = 10 ; i >= 1 ; i--){
            table = num10 * i ;
            System.out.println(table);
        }
        
      // Program to find the fact of number n
        int fact = 1 ;
        System.out.print("Enter the number :");
          n = sc.nextInt();
        for(  i = 1 ; i <= n ; i++){
            fact = fact * i ;
        }  System.out.println(("Final factorial of " + n + " is = " + fact));

           // repeat 5 & 1 using while loop
         i = 1 ;
        while(i <= 10 ){
            System.out.println("5".repeat(i));
            i++ ;
        }
         int j = 1 ;
        while(j <= 10 ){
            System.out.println("1".repeat(i));
            j++ ;
        }

        // sum of 8 multiplication number 
         
        for(  i = 0 ; i <= 80 ; i++){
            if(i % 8 == 0){
             sum = sum + i ;
            }
        }
        System.out.println("Sum of number occuring in 8th multiplication table = " + sum);
                
        //  repeat 2 using for loop
        for(  i = 1 ; i <= 5 ; i++){
            System.out.print("2");
        }

        //repeat 1 using while 
         i = 1 ; 
        while (i <= 5) {
            System.out.print("1");
            i++ ;
        }

        sc.close();
    }
}
