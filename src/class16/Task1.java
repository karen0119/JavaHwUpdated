package class16;

public class Task1 {
    /*  Create a method that will take a String as a parameter
       and returns reversed String.
       Method should be available to all classes within your project
       and accessible by class name.
  */
    public String revStr(String str) {
        StringBuilder rev = new StringBuilder(str).reverse();
        return rev.toString();
    }


    public static void main(String[] args) {
        Task1 rev = new Task1();
        System.out.println(rev.revStr("This is hard"));
        // drah si sihT
    }
}
