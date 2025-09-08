abstract class Parent2 {
    public Parent2(){
        System.out.println("I am constructer of class Base2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();

    
}
class Child2 extends Parent2 {
    @Override
    public void greet(){
        System.out.println("Good morning.");
    }
    public void greet2(){
        System.out.println("Good morning.");
    }
}
 abstract class Child3 extends Parent2 {
  public void th(){
    System.out.println("I am good.");
  }
    //   @Override
    // public void greet(){
    //     System.out.println("Good morning.");
    // }
    // public void greet2(){
    //     System.out.println("Good morning.");
    // }

    
}
public class Abstract_class {
    public static void main(String[] args) {
        // Parent2 b2 = new Parent2(); // Throw error 
        Child2 c = new Child2();
        // Child3 c1 = new Child3();//Throw Error

        
    }
}
