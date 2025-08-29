
class Employee {
    int id ;
    int salary;
    String name;

    public void getDetails(){
    System.out.println("My id is : " + id);
    System.out.println("My name is : " + name );
    }
    public int getSalary() {
        return salary;
    }

    public void setName(String n) {
        name = n;

    }

    public String getName() {
        return name;
    }

}

class Cellphone {
    public void ring() {
        System.out.println("Your phone is ringing...");
    }

    public void viberate() {
        System.out.println("Your phone is viberating...");
    }

    public void callpiyush() {
        System.out.println("Calling to piyush...");
    }

}

class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

class Recatangle {
    int length;
    int breath;

    public int area() {
        return length * breath;
    }

    public int perimeter() {
        return 2 * (length + breath);
    }
}

class Circle {
    float radius;

    public float area() {
        return 3.14f * (radius * radius);
    }

    public float perimeter() {
        return 2 * 3.14f * radius;
    }
}

class Rockstar {
    public void hitting() {
        System.out.println("Hitting the Enemy.");
    }

    public void runnig() {
        System.out.println("Runnig from the Enemy.");
    }

    public void firing() {
        System.out.println("Firing to the Enemy.");
    }

}

public class Custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class.");

        // Learning the Classes concepts 
        Employee harry = new Employee(); //Instantiating a new Employee object
        Employee john = new Employee(); //Instantiating a new Employee object
        
        // Setting Properties
        harry.id = 12;
        harry.salary = 23000;
        harry.name = "Ritesh";

        john.id = 23;
        john.salary = 12000;
        john.name = "John Khandelwal";
       
        // Printing the Attributes
        harry.getDetails();
        john.getDetails();
        int salary = john.getSalary();
        System.out.println(salary);
           
        // Problems on Classes 
        Employee empy = new Employee();

        empy.setName("Ritesh Kumar");
        empy.salary = 224 ;
        System.out.println(empy.getName());
        System.out.println(empy.getSalary());
        

        // Problem 2

        Cellphone phone = new Cellphone();

        phone.callpiyush();
        phone.ring();
        phone.viberate();

        // Problem 3
        Square sqr = new Square();
        sqr.side = 5 ;
        int area = sqr.area();
        int perimeter = sqr.perimeter();

        System.out.println("Area of Square : " + area);
        System.out.println("Perimeter of square : " + perimeter);

        // Problem 4
        Recatangle rect = new Recatangle();
        rect.length = 4;
        rect.breath = 6 ;
        System.out.println("The Area of Rectangle : " + rect.area());
        System.out.println("The Perimeter of Ractangle : " + rect.perimeter());

        // Problem 5
        Circle cir = new Circle() ;
        cir.radius = 3.4f ;
        System.out.println("The Area of the circle : " + cir.area());
        System.out.println("The Perimeter of the circle : " + cir.perimeter());

        // Problem 6
        Rockstar rock = new Rockstar();
        rock.hitting();
        rock.runnig();
        rock.firing();

    }
}
