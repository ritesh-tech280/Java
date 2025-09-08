class Circle {
    public int radius ;

    Circle(int r){
        System.out.println("I am circle Parametrised Constructer."); 
        this.radius = r ;
     }
    public double area(){
        double area = Math.PI * this.radius * this.radius ;
        return area ;
    }
}

class Cylinder extends Circle {
    public int height ;
     Cylinder(int r , int h){
         super(r);
         System.out.println("I am cylinderized constructer.");
         this.height = h ;
     }
public double  area(){
    
    double area = 2 * Math.PI * this.radius * (this.height + this.radius);
    return area ;
}
public double volum(){
double volum = Math.PI * this.radius * this.radius * this.height ;
    return volum ;
}
}

class Rectangle {
      int length;
      int width ;
      
     public void setL(int l){
        this.length = l ;
     }
     public int getL(){
        return this.length ;
        
     }
     public void setW(int w){
        this.width = w;
     }
     public int getW(){
        return this.width ; 
     }
     public Rectangle(){
       System.out.println("I am default constructer.");
     }
     
    
     public int area(){
        int area = length * width ;
       return area ;
     }
     
}

class Cuboid extends Rectangle {
   int height ;
    Cuboid(int l , int w , int h){
         super();
         this.setL(l);
         this.setW(w);
        System.out.println("I am constructor of Cuboid classs");
        this.height = h ;
    }
    public int area(){
        int A = 2 * ( (this.length * this.width) + (this.width * this.height) + (this.height * this.length));
        return A;
    }
    public int volume(){
        int V = this.length * this.width * this.height ;
        return V ;
    }
}


public class Prac_Inheritance {
    public static void main(String[] args) {
        // Problem 1
        // Circle cy = new Circle(12);
        // double area  = cy.area();
        // System.out.printf("Area of Cicle is  : %.2f \n" ,area);

        // Cylinder ci = new Cylinder(12 ,12);
        // double area1 = ci.area();
        // System.out.printf("Area of cylinder - %.2f\n" , area1);
        // double volume = ci.volum();
        // System.out.printf("Volume of Cylinder : %.2f\n" , volume);
             
        Rectangle rec = new Rectangle();
        rec.setL(10);
        rec.setW(10);
        int area1 = rec.area();
        System.out.println("Area of Rectangle = " + area1);

        Cuboid cube = new Cuboid(10 , 10 ,12);
         System.out.println("Area of Cuboid : " + cube.area());
         System.out.println("Volume of Cuboide : " + cube.volume());


       
        
    }
}
