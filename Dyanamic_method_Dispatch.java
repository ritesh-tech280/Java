class Phone {
     public void greet(){
        System.out.println("Good Morning.");
    }
    public void on(){
        System.out.println("Turning on Phone.........");
    }
   

}
class SmartPhone extends Phone {
     public void music(){
        System.out.println("Paying music...");
    }

    public void on(){
        System.out.println("Turning on SmartPhone............");
    }
   
}


public class Dyanamic_method_Dispatch {
    public static void main(String[] args) {
        Phone pobj = new Phone();//Allowed 
        SmartPhone smobj = new SmartPhone(); // Allowed
        // obj.on();
        Phone obj = new SmartPhone(); // Yes it is  Allowed\
        obj.greet();
        obj.on();

        // SmartPhone smobj = new Phone(); // Not Allowed
    }
}
