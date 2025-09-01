
///  Getters and Setters Concept
class MyEmployee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getId() {
        return id;
    }
}

// Constructers in java
class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee() {
        id = 45;
        name = "Jonathan";
    }

    // Constructer Overloading
    public MyMainEmployee(String myname) {
        id = 16;
        name = myname;

    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getId() {
        return id;
    }
}

public class Acc_modifier {
    public static void main(String[] args) {

        MyEmployee rites = new MyEmployee();
        // rites.id = 45 ;
        // rites.name = "Ritesh";// Throw an error due to private acces modifier

        rites.setId(12);
        rites.setName("Ritesh ");
        System.out.println(rites.getName());
        System.out.println(rites.getId());

        MyMainEmployee ritesh = new MyMainEmployee();
        ritesh.setName("Ritesh");
        ritesh.getName() ;
        System.out.println(ritesh.getId());
        System.out.println(ritesh.getName());

    }
}
