import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        // Problem : 1 Write a Program to convert a string to LowerCase
        String name = "RITESH";
        String lowecaString = name.toLowerCase();
        System.out.println(lowecaString);

        // Problem : 2 Write a program to replaces spaces with underscore
        String name1 = new String("Ritesh is a good boy");
        String replaString = name1.replace(" ", "_");
        System.out.println(replaString);

        // Problem : 3 Write a program to replace name with name
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name :");
        String name2 = sc.next();

        String letter = new String("Dear <|name|> , Thanks a Lot !");
        String newString = letter.replace("<|name|>", name2);
        System.out.println(newString);

        // Problem : 4 write a program to detect to or three space
        String str = "You  are a good boy.";
        System.out.println(str.indexOf("   "));
        System.out.println(str.indexOf("  "));

        // Problem : 5 write a program to format the string
        System.out.println("Dear Ritesh, \"You are Love this course.\"");

        // write a program to calculate the income taxt paid by the user
        float tax = 0 ;
        System.out.print("Enter the income in Lakhs per annum :");
        float income = sc.nextFloat();
        if(income <= 2.5f){
            tax = tax + 0 ;
        }
        if(income > 2.5 && income <= 5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if (income > 5f && income <=  10.0f) {
          tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income > 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10f);
        }
        System.out.println("The total tax paid by the employee is : " + tax);


        // write a program to find out the day of the week
        int day;
        System.out.print("Enter the number :");
        day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("The day is Monday.");
            case 2 -> System.out.println("The day is Tuesday.");
            case 3 -> System.out.println("The day is Wednesday.");
            case 4 -> System.out.println("The day is Thursday.");
            case 5 -> System.out.println("The day is Friday.");
            case 6 -> System.out.println("The day is Saturday.");
            case 7 -> System.out.println("The day is Sunday.");

            default -> System.out.println("Invalid Day Input.");
        }

        // write a program to find whether the year is leap or not entered by the user
        int year;
        System.out.print("Enter the year :");
        year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a Leap year.");
        } else {
            System.out.println(year + " is not a Leap year.");
        }

        // write a program to find out the type of website
        String url;
        System.out.print("Enter the url :");
        url = sc.next();
        if (url.endsWith(".com")) {
            System.out.println("This is Commercial Website.");
        } else if (url.endsWith(".org")) {
            System.out.println("This is organization website.");
        } else if (url.endsWith(".in")) {
            System.out.println("This is Indian Website.");
        }

        sc.close();
    }
}
