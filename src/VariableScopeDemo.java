public class VariableScopeDemo {

    // ============= STATIC VARIABLE (class variable) ===========
    // Belongs to the CLASS, not to any object
    // Shared by all objects
    // Loaded when the class is Loaded

    static int staticCount = 0;
    static String collegeName = "ABC College";

    // ============== INSTANCE VARIABLE (object variable) ===============
    // Belongs to each OBJECT separately
    // Each object has its own copy
    // Exists as long as the object exists

    int rollNo;
    String studentName;

    //Constructor
    public VariableScopeDemo(int rollNo, String studentName) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        staticCount++; //Shared Counter increases for every object
    }

    public void display() {
        // ======== LOCAL VARIABLE ==============
        // Declared inside a method / block / constructor
        // Exists only while the method is running
        // Must be initialized before use

        String message = "Student Details"; //Local Variable

        System.out.println(message);
        System.out.println("Name: " + studentName); //instance
        System.out.println("Roll No: " + rollNo); // instance
        System.out.println("College Name: " + collegeName); //static
        System.out.println("Total students created: " + staticCount); //static
        System.out.println("-------------------------------------");
    }

    public void localScopeExample() {
        int x = 10; //local to this method

        if (x > 5) {
            int y = 20; // local to this method
            System.out.println("Inside if: x = " + x + ", y = " + y);
        }

        //System.out.println(y); //ERROR: y is not visible here
        System.out.println("Outside if: x = " + x);
    }

    public static void main(String[] args) {

        //local variable of main()
        int localInMain = 100;
        System.out.println("Local variable in main: " +  localInMain);

        VariableScopeDemo s1 = new VariableScopeDemo(101, "Saikrishna");
        VariableScopeDemo s2 = new VariableScopeDemo(102, "Mantri");

        s1.display();
        s2.display();

        //changing static variable affects ALL objects
        VariableScopeDemo.collegeName = "XYZ College";

        System.out.println("After Changing static variable: \n");
        s1.display();
        s2.display();

        s1.localScopeExample();

        System.out.println("Accessed via class name: " + VariableScopeDemo.staticCount);
    }


}
