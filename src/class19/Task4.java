package class19;

public class Task4 {
    //Create 1 class with a private method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
    private void String(String name){
        System.out.println(name);
    }
    private void String(String name,String lastName){
        System.out.println(name+" "+lastName);
    }
    private void String(String name,String lastNName, String career){
        System.out.println(name+" "+lastNName+" is a "+career);
    }

    public static void main(String[] args) {
        Task4 obj=new Task4();
        obj.String("Mia"); //Mia
        obj.String("Mia","Oreno"); //Mia Oreno
        obj.String("Mia","Oreno","teacher"); //Mia Oreno is a teacher
    }
}
