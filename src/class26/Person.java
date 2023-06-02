package class26;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Person {
    /*
   Create a Person class with following private fields: name, lastName, age, salary.
   Variables should be initialized through constructor.
   Inside the class also create a method to print user details.
   In Test Class create a Map that will store key in ascending order.
   In that map store personId and a Person Object. Print each object details.
    */
    private String name;
    private  String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return name +" " + lastName +" age-" + age + " salary-" + salary;
    }
}
class PersonTest {
    public static void main(String[] args) {
        TreeMap<Integer,Person> person=new TreeMap<>();
        Person p1=new Person("Mike","Wazuski",40,875.0);
        Person p2=new Person("Karen","Vargas",25,987.0);
        Person p3=new Person("Max","Bayless",19,500.0);

        person.put(123,p1);
        person.put(456,p2);
        person.put(789,p3);

        Set<Map.Entry<Integer,Person>> entrySet=person.entrySet();
        for(Map.Entry<Integer,Person> e:entrySet){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
