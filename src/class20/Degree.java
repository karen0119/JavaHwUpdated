package class20;

public class Degree {
    /*
     Create a class 'Degree' having a method 'getPrerequisite'
     that prints ""To get a degree you need high school diploma"".
     Class 'Degree' has 2 subclasses, namely 'Bachelors' and Masters’.
     In Masters class override method 'getPrerequisite'.
     Call the method by creating an object of each of the three classes.
     */
    void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree {

}

class Masters extends Degree {
    @Override
    void getPrerequisite() {
        System.out.println("To get a Masters degree you need bachelors degree");
    }
}
class DegreeTester {
    public static void main(String[] args) {

        Degree degree = new Degree();
        degree.getPrerequisite(); //To get a degree you need high school diploma

        Bachelors bachelors = new Bachelors();
        bachelors.getPrerequisite(); //To get a degree you need high school diploma

        Masters masters = new Masters();
        masters.getPrerequisite(); // To get a Masters degree you need bachelors degree


    }
}