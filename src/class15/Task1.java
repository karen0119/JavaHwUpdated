package class15;

public class Task1 {
     /*
Create three variables Name , ID and numberOfStudents
Create three objects of the Students Class
Set the value for studentName , studentID
and increment the numberOfStudents for each object
Print out total number of students
 */

    // 3 variables created
    String name;
    String ID;
    static int numberOfStudents;

    public static void main(String[] args) {


        Task1 student1 = new Task1(); //object 1
        student1.name="Janny";
        student1.ID="58-35";
        numberOfStudents++; //increment

        Task1 student2 = new Task1(); //object 2
        student1.name="Ben";
        student1.ID="58-36";
        numberOfStudents++; //increment

        Task1 student3 = new Task1(); //object 3
        student1.name="Mary";
        student1.ID="58-37";
        numberOfStudents++; //increment


        System.out.println(numberOfStudents);
        // prints: 3
    }
}
