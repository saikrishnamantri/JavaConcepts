public class TernaryOperator {

    public static void main(String[] args) {

        int marks = 72;

        String result = (marks >= 40) ? "Pass" : "Fail";
        System.out.println(result);

        int a = 15, b = 20;
        int max = (a > b) ?  a : b;
        System.out.println("Max : " + max);

        //nested ternary
        String grade = (marks >= 90) ? "A" :
                        (marks >= 80) ? "B" :
                        (marks >= 40) ? "C" : "F";
        System.out.println("Grade: " + grade);
    }
}
