public class Recursion {

    // Problem 3: Method to print the table of number

    static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d \n", n, i, n * i);
        }
    }

    // Problem 4: Method to print the pattern
    static void pattern(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print("\n");
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + "*");
            }
        }
    }

    // Problem 10 : Method to print the above pattern using recursion
    static void patter1Rec(int n) {
        if (n > 0) {
            patter1Rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Problem 6 : Method to print the pattern
    static void patter(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print("\n");
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + "*");
            }
        }
    }

    // Problem 9 : Using Recursion
    static void patter_rec(int n) {
        if (n > 0) {

            for (int i = n; i > 0; i--) {
                System.out.print(" " + "*");
                // System.out.println();
            }
            System.out.println();
            patter_rec(n - 1);

        }
    }

    // Problem 5: Method to print the sum of n Natural numaber using recursion
    static int sum(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    // Problem 12 : Method to print the sum of n Natural number usinf iteration
    // approach
    static int sum_iter(int n) {
        int sum = 0;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
        }
        return sum;
    }

    // Problem 11 : Method to Convert the Celcius into Fahrenheit
    static void convert(int celcius) {
        int f = (celcius * 9 / 5) + 32;
        System.out.println(celcius + " celsius = " + f + " Fahrenheit");
    }

    // Problem 1 : Method to calculate the Factorialof number n
    static int factorial(int n) {
        if (n == 1 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    // Problem 7 : Method to print the nth term of fibbonacci series
    static int fibbo(int n) {
        // int arr [] = new int[n];
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return (fibbo(n - 1) + fibbo(n - 2));
        }
    }

    // Problem 8 : Method to print the average of given arguments
    static int average(int... arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result / arr.length;
    }

    // Problem 2 : Method to print the factorial of number n using iterative
    // approach
    static int fact_iterative(int n) {
        if (n == 0 && n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        // Problem 1
        int x = 5;
        System.out.println("The Value of factorial x : " + factorial(x));
        // Problem 2
        int a = 6;
        System.out.println("The factorial of a : " + fact_iterative(a));

        // Problem 3
        table(10);

        // Problem 4
        pattern(5);

        // Problem 5
        int sum = sum(10);
        System.out.println("Sum = " + sum);

        // Problem 6
        patter(5);

        // Problem 7
        int result = fibbo(7);
        System.out.println(result);

        // Problem 8
        int average = average(7, 5, 34, 34);
        System.out.println("Average of the give numbers : " + average);

        // Problem 9
        patter_rec(5);

        // Problem 10
        patter1Rec(6);

        //Problem 11
        convert(37);

        //Problem 12  
        int sum1 = sum_iter(10);
        System.out.println("Sum = " + sum1);
         

    }
}
