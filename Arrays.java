public class Arrays {
    public static void main(String[] args) {
        /*
         * Classroom of 500 students You have to store marks of these 500 students
         * you have two option :
         * 1. Create 500 variable
         * 2. Use Arrays (Recommended)
         */
        // There are three main ways to create an array in java
        // 1. Declaeration + memory allocation

        // int[] marks = new int[5];
        int[] marks; // 2 Declaraion
        marks = new int[5]; // memory allocation
        marks[0] = 100;
        marks[1] = 70;
        marks[2] = 80;
        marks[3] = 60;
        marks[4] = 50;
        System.out.println(marks[5]);

        // 3. Decalation , memory allocation and Initialization together
        
          int [] marks1 = {65 , 70 ,75 , 80 , 85 ,90};
         
         for( int i = marks1.length - 1 ; i >= 0 ; i--){
         System.out.print(marks1[i] + "\t");
         }
         
         for (int i : marks1) {
         System.out.print(i + "\t");
         }
        
        // Problems on Array
        // Program to calculate the sum of array element
        float[] num = { 3.6f, 4.6f, 6.5f, 23.4f, 6.6f, 7.6f };
        float sumf = 0;
        for (float f : num) {
            sumf = sumf + f;
        }
        System.out.println("Sum array elemens = " + sumf);

        // Program to search an element in the array
        int arr[] = { 2, 4, 5, 6, 7, 8 };
        int key = 3;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(key + " Present at index : " + i);
                found = true;
                break;
            }
        }
        if (found) {
            System.err.println("present");
        } else {
            System.err.println("not Present ");
        }

        // Program to Calculate the avg of physics marks using for-each Loop
        int phy_marks[] = { 78, 34, 56, 87, 65 };
        int sum = 0;
        float avg;
        for (int i : phy_marks) {
            sum = sum + i;
        }
        avg = sum / phy_marks.length;
        System.out.println("Avg of marks of Physics : " + avg);

        // Program to Add to matrices
        int matrix1[][] = new int[2][3];
        matrix1[0][0] = 2;
        matrix1[0][1] = 2;
        matrix1[0][2] = 2;
        matrix1[1][0] = 2;
        matrix1[1][1] = 2;
        matrix1[1][2] = 2;

        int matrix2[][] = new int[2][3];
        matrix2[0][0] = 2;
        matrix2[0][1] = 2;
        matrix2[0][2] = 2;
        matrix2[1][0] = 2;
        matrix2[1][1] = 2;
        matrix2[1][2] = 4;

        int smatrix[][] = new int[2][3];
        int i, j;
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                smatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(smatrix[i][j] + "\t");
            }
            System.out.println("\n");
        }

        // Program to reverse an array
        int oldarr[] = new int[5];
        oldarr[0] = 1;
        oldarr[1] = 2;
        oldarr[2] = 3;
        oldarr[3] = 4;
        oldarr[4] = 5;
        int newarr[] = new int[5];

        for (i = oldarr.length - 1; i >= 0; i--) {
            newarr[newarr.length - 1 - i] = oldarr[i];
        }

        for (int k : newarr) {
            System.out.print(k + "\t");
        }

        // program to find the maximum elment in the array
        int ar[] = { 12, 34, 56, 4, 7, 67 };
        int max = ar[0];
        for (i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }

        // System.out.println("The Maximum element present in the array :" + max);

        // program to find the minimum elment in the array
        int arr1[] = { 12, 34, 56, 4, 7, 67 };
        int min = arr1[0];
        for (i = 0; i < arr1.length; i++) {
            if (arr1[i] < min) {
                min = arr1[i];
            }
        }
        System.out.println("The Minimum element present in the array :" + min);

        // Program to find the array is sorted or not
        int arr2[] = { 1, 2, 6, 4, 5 };
        boolean fond = true;
        for (i = 0; i < arr2.length - 1; i++) {
            if (arr2[i] > arr2[i + 1]) {
                fond = false;
                break;
            }
        }
        if (fond) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }

    }
}
