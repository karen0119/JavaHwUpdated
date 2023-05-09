package class18;

public class Teacher {
    /*   Task1:
    Write a Java program called Teacher.
    Identify features and 4 behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher.
     Test all 4 classes
     */
        //features
    String name;
    int age;
    int yearsExperience;
    boolean isCertified;


    public Teacher(String name, int age, int yearsExperience, boolean isCertified) {
        this.name = name;
        this.age = age;
        this.yearsExperience = yearsExperience;
        this.isCertified = isCertified;
    }
     // behaviour 1
    public void teachClass() {
        System.out.println(name + " is " + age + " years old.");
    }
     // behaviour 2
    public void gradePapers() {
        System.out.println(name + " is teaching " + yearsExperience + " years out of " + age + " years of life");
    }
    // behaviour 3
    public void getYearsExperience() {
        System.out.println(name + " has an experience of " + yearsExperience + " years");
    }
    // behaviour 4
    public void isCertified() {
        if (isCertified) {
            System.out.println("This teacher is certified.");
        } else {
            System.out.println("This teacher is not yet certified");
        }
    }

}
//  subclass 1
class MathTeacher extends Teacher {

    public MathTeacher(String name, int age, int yearsExperience, boolean isCertified) {
        super(name, age, yearsExperience, isCertified);
    }
}
// subclass 2
class ChemistryTeacher extends Teacher {

    public ChemistryTeacher(String name, int age, int yearsExperience, boolean isCertified) {
        super(name, age, yearsExperience, isCertified);
    }
}
// subclass 3
class PianoTeacher extends Teacher {

    public PianoTeacher(String name, int age, int yearsExperience, boolean isCertified) {
        super(name, age, yearsExperience, isCertified);
    }
}
