package class18;

public class TeacherTester {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Marisol Robles", 32, 10, true);
        teacher.teachClass();
        teacher.gradePapers();
        teacher.getYearsExperience();
        teacher.isCertified();
        System.out.println(); // space

        MathTeacher math = new MathTeacher("Nicole Grzes", 29, 7, true);
        math.teachClass();
        math.gradePapers();
        math.getYearsExperience();
        math.isCertified();
        System.out.println(); // space

        ChemistryTeacher chem = new ChemistryTeacher("Karla Chavez", 45, 15, true);
        chem.teachClass();
        chem.gradePapers();
        chem.getYearsExperience();
        chem.isCertified();
        System.out.println(); // space

        PianoTeacher piano = new PianoTeacher("Liz Herrera", 22, 3, false);
        piano.teachClass();
        piano.gradePapers();
        piano.getYearsExperience();
        piano.isCertified();


    }
}

