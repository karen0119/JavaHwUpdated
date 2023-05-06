package class14;

public class Task2 {
    //Create a method createEmail().
    // Based on values of users firstName, lastName and email type, your method should return complete email Address.
    // Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com

    String createEmail(String firstName, String lastName, String emailType){
        String result=firstName+lastName+'@'+emailType+".com";
        return result;
    }

    public static void main(String[] args) {

        Task2 obj=new Task2();
        String result=obj.createEmail("Karen","Vargas","gmail");
        System.out.println(result.toLowerCase());
        // prints: karenvargas@gmail.com
    }
}
