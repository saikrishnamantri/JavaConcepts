public class ScopeQuiz {

    static int staticCount = 10;

    int count = 20;

    public void show() {
        int count = 30;

        System.out.println("Local Count: " + count);
        System.out.println("Instance Count: " + this.count);
        System.out.println("Static Count: " + ScopeQuiz.staticCount);
        System.out.println("---------------------------------");
    }

    public static void staticShow(ScopeQuiz obj) {

        System.out.println("Static Count from Static Method: " + ScopeQuiz.staticCount);
        System.out.println("Instance Count via object: " + obj.count);
        System.out.println("=====================================");
    }

    public static void main(String[] args) {

        ScopeQuiz quiz = new ScopeQuiz();

        quiz.show();

        ScopeQuiz.staticShow(quiz);

        ScopeQuiz.staticCount = 100;

        quiz.show();

        ScopeQuiz.staticShow(quiz);
    }
}
