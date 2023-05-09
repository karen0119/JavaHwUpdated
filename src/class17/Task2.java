package class17;

public class Task2 {
    /*       Task2:
Write a java class that have 4 constructors with 4 different access levels of constructors
(private, public, default, protected)

and create 4 objects of this class:
1 - inside same class;
2 - from outside the class;
3 - from different class inside different package
and observe result.
*/
    String nameStudent, lasNameStudent, schoolName;
    int yearlyIncome, yearGraduated;

    // Constructor 1 with private access
    private Task2(String nameStudent, String lasNameStudent, String schoolName, int yearlyIncome, int yearGraduated) {
        this.nameStudent = nameStudent;
        this.lasNameStudent = lasNameStudent;
        this.schoolName = schoolName;
        this.yearlyIncome = yearlyIncome;
        this.yearGraduated = yearGraduated;
        System.out.println("Private constructors sample object");
    }
    // Constructor 2 with public access
    public Task2(String nameStudent, String lasNameStudent, String schoolName, int yearGraduated) {
        this.nameStudent = nameStudent;
        this.lasNameStudent = lasNameStudent;
        this.schoolName = schoolName;
        this.yearGraduated = yearGraduated;
        System.out.println("Public constructors sample object");
    }
    // Constructor 3 with default access
    Task2(String nameStudent, String schoolName) {
        this.nameStudent = nameStudent;
        this.schoolName = schoolName;
        System.out.println("Default constructors sample object");
    }
    // Constructor 4 with protected access
    protected Task2(String lasNameStudent, String schoolName, int yearlyIncome, int yearGraduated) {
        this.nameStudent = nameStudent;
        this.lasNameStudent = lasNameStudent;
        this.schoolName = schoolName;
        this.yearlyIncome = yearlyIncome;
        this.yearGraduated= yearGraduated;
        System.out.println("Protected constructors sample object");
    }
    // Access within same class
    public static void main(String[] args) {
        //Object 1 -- accessing private
        Task2 constPrivate = new Task2("Tom","Jerry","Syntax",50000000, 1992);

        //Object 2 -- accessing public
        Task2 constPublic = new Task2("Tom","Jerry","Syntax",1992);

        //Object 3 -- accessing default
        Task2 constDefault = new Task2("Tom", "Syntax");

        //Object 4 -- accessing protected
        Task2 constProtected = new Task2("Logan", "Syntax", 50000000, 1992);

    }
}
