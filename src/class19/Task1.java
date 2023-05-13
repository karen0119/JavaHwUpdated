package class19;

public class Task1 {
     /*
     Create 1 class in which create a methods that will calculate
     the area of Method name must be called calculateArea
            1) Rectangle
            2) Square
     Use separate class to test your code
     */
     static void calculateAreaRectangle (int a, int b) {
         System.out.println(a*b);
     }
    static void calculateAreaSquare (int a) {
        System.out.println(a*a);
    }
}

class TesterTask1 extends Task1 {
    public static void main(String[] args) {
        Task1.calculateAreaRectangle(5,4);  //20
        Task1.calculateAreaSquare(6);   //36
    }

}
