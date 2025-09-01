class Cylinder {
    private float radius ;
    private float height ;
      public void setRadius(float r){
        this.radius = r ;
      }
      public  float getRadius(){
        return radius ;
      }
      public void setHeight(float h){
        this.height = h ;
      }
      public float getHeight(){
        return height ;
      }
      public float surfArea(){
        float Area = 2 * 3.14f * radius * (height + radius);
        return Area ;

      }
      public float volume(){
        float Volume = 3.14f * radius * radius * height ;
        return Volume ;
      }

    
}
class Cylinderc {
    private float radius ;
    private float height ;
       
    public Cylinderc(float r , float h){
        radius = r ;
        height = h ;
    }
      
      public float surfArea(){
        float Area = 2 * 3.14f * radius * (height + radius);
        return Area ;

      }
      public float volume(){
        float Volume = 3.14f * radius * radius * height ;
        return Volume ;
      }
     
    
}  
class Sphere {
    private float radius ;
      public Sphere(float r){
        radius = r ;
      }
       public float sVolume(){
        float area = 4/3 * 3.14f * radius * radius * radius ;
        return area ;
      }
      public float sArea(){
        float area = 4 * 3.14f * radius * radius;
        return area ;
      }
       
}

public class Prac_acc {
    public static void main(String[] args) {
        Cylinderc prac1 = new Cylinderc(10.0f , 10.0f);
        // prac1.setRadius(10.0f);
        // prac1.setHeight(10.0f);
        // System.out.println();
        // System.out.println(prac1.getRadius());
        // System.out.println(prac1.getHeight());

        System.out.println("The Surface Area of Cylinder : " + prac1.surfArea());
        System.out.println("The Volume of Cylinder : " + prac1.volume());


        Sphere sphere = new Sphere(4.2f);
        System.out.println("The Surface Area of Sphere : " + sphere.sArea());
        System.out.println("The Volume of Sphere : " + sphere.sVolume());

    }
}
