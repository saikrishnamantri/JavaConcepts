public class VariableScopeTwo {

    static int studentCounter = 0;
    static String collegeName = "Default College";

    int rollNo;
    String studentName;

    public VariableScopeTwo(int rollNo, String studentName) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        studentCounter++;
    }

    public void display() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Roll No: " + rollNo);
        System.out.println("College Name: " + collegeName);
        System.out.println("Total Students registered: " + studentCounter);
        System.out.println("-------------------------------\n");
    }

    public static void main(String[] args) {

        VariableScopeTwo vs1 = new VariableScopeTwo(1, "Amit");
        VariableScopeTwo vs2 = new VariableScopeTwo(2, "Neha");

        vs1.display();
        vs2.display();

        VariableScopeTwo.collegeName = "National Institute";

        vs1.display();
        vs2.display();

        System.out.println("Total Students registered: " + VariableScopeTwo.studentCounter);

    }

}
