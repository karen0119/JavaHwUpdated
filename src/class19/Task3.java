package class19;

public class Task3 {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */

    static void subtraction(int a, int b) {
        System.out.println(a-b);
    }

    static void subtraction(long a, int b) {
        System.out.println(a-b);
    }

    static void subtraction(int a, double b) {
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        subtraction(9,4);  // 5
        subtraction(50_000,30_000);  // 20_000
        subtraction(3,2.5); //0.5
    }
}
