package class25;

import java.util.HashSet;

public class StudentType {
    /*
    Create a Set that will hold Objects of Student Type.
    In this set we do not care about the insertion order.
    Each student object should have name and studentID.
    Display name of each student.
     */
    String name;
    String ID;

    public StudentType(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "StudentType{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }

    public static void main(String[] args) {
        HashSet<StudentType> students=new HashSet<>();
        students.add(new StudentType("John","487TR"));
        students.add(new StudentType("Mary","YE5432"));
        students.add(new StudentType("Tom","78Yt89"));
        System.out.println(students);
        for (StudentType student : students) {
            System.out.print(student.name+" ");
        }


    }
}
