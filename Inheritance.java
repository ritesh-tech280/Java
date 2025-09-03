class Base {
   public int x;

   public int getX() {
      return x;
   }

   public void setX(int x) {
      System.out.println("I am in Base and  setting X now ");
      this.x = x;
   }

   public void printMe() {
      System.out.println("I am a constructer");
   }
}

class Derived extends Base {
   int y;

   public int getY() {
      return y;
   }

   public void setY(int y) {
      System.out.println("I am in Derived and Setting Y now ");
      this.y = y;
   }
}

class Base1 {
   Base1() {
      System.out.println("I am a Constructer.");
   }

   Base1(int x) {
      System.out.println("I am an Overload Constructer with the value of x : " + x);
   }
   // public int x ;
   // public void setX(int x){
   // this.x = x ;
   // }
   // public int getX(){
   // return x ;
   // }
}

class Derived1 extends Base1 {
   Derived1() {
      // super(0);
      System.out.println("I am a Derived Class Constructer.");
   }

   Derived1(int x, int y) {
      super(x);
      System.out.println("I am overloaded Derived Costructer with the value of  y : " + y);
   }
}

class ChildDerived extends Derived1 {
   ChildDerived() {
      System.out.println("I am a child of derived Constructer");
   }

   ChildDerived(int x, int y, int z) {
      super(x, y);
      System.out.println("I am an overloaded child of Derived Constructer with the value of z as :  " + z);
   }
}

class Aclass {
   int a;

   public int getA() {
      return a;
   }

   Aclass(int a) {
      this.a = a;
   }

   public int returnone() {
      return 1;
   }
}

class Bclass extends Aclass {
   Bclass(int c) {
      super(c);
      System.out.println("I am a constructer.");
   }
}

public class Inheritance {
   public static void main(String[] args) {
      // Creating an object of Base Class
      Base b = new Base();
      b.setX(4);
      System.out.println(b.getX());

      // Creating an Object of Derived Class
      Derived d = new Derived();
      d.setY(43);
      System.out.println(d.getY());

      Base1 b1 = new Base1();
      Derived1 d1 = new Derived1();
      // Derived1 d1 = new Derived1(3 , 4);
      ChildDerived c1 = new ChildDerived(12 , 13 , 15);

      // this and super keyword in Java
      Aclass e = new Aclass(65);
      // Bclass d = new Bclass(5);
      System.out.println(e.getA());

   }
}
 