public class Methods {
    static void foo(){
        System.out.println("Good morning dude !");
    }
    static void foo(int a ){
            System.out.println("Good morning " + a + " Dude");
    }
    static void foo(int a , int b){
        System.out.println("Good Evening " + a + " Dear");
        System.out.println("Good morning " + b + " Chotu");
    }
    static void  foo(int a , int b , int c ){
        System.out.println("Good Evening " + a + " Dear");
        System.out.println("Good morning " + b + " Chotu");
   
    }
    static void change(int a){
        a = 68;
    }
    static void change2(int [] arr){
        arr[0] = 68 ;
    }
    static void telljokes(){
        System.out.println("What does a cloud wear under his raincoat? Thunderwear.");
    }
   static int logic(int x , int y){
        int z ;
        if(x > y){
            z = x + y ;
        } else {
            z = (x + y) * 5 ;
        }
        x = 566 ;
        return z;
    }
    static int sum(int a , int b){
        return a + b ;
    }
    static int sum(int a , int b , int c){
        return a + b + c;
    }
    static int sum(int a , int b , int c , int d){
        return a + b + c + d;
    }
static int sum (int x ,int ...arr){
    // Available as int int [] arr ;
    int result = x ;
    for (int a : arr) {
        result += a;

    }  return result ;
}
     public static void main(String[] args) {
        int a = 7;
        int b = 6;
        // Method invocation using object creation 
        Methods obj = new Methods();
       int  c = obj.logic(a ,b);
    //   int c = logic(a , b);
      System.out.println(a + " " + b);
    int a1 = 2 ;
    int b1 = 3 ;
    int c1 = logic(a1, b1);
    System.out.println(c);
    System.out.println(c1);
    // Case:1 changing the integer 
       int x = 56 ;
       change(x);
       System.out.println(" The value of x  after running  change is :" + x);
     telljokes();
    // Case:2 changing the array 
        
    int [] marks = {52 , 73 , 77 , 89 , 98 , 94};  
   change2(marks);
   System.out.println(" The value of marks[0]  after running  change is :" + marks[0]);
     telljokes();

    // Method Overloading 
          foo();
          foo(3900);
          foo(70 , 23); // arguments are actual !

        //   Variable 
          System.out.println("welcome to Varargs Tutorial .");
          System.out.println("The sum of Nothing : " + sum(1));
          System.out.println("The sum of  4 and 5 : " + sum(4 , 5));
          System.out.println("The sum of  4 and 5 : " + sum(4 , 5 , 6));
          System.out.println("The sum of  4 and 5 : " + sum(4 , 5 , 6 , 5, 10));
        
     }
}
