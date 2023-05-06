package class14;

public class Task1 {
    /*
   Create a method that will say
    Hello in different language based on the country that will passed when method is executed.
    */
    void println( String country){ //Methods

        if (country.equalsIgnoreCase("USA")){
            System.out.println("Hello");
        }else if(country.equalsIgnoreCase("Mexico")){
            System.out.println("Hola");
        }else if (country.equalsIgnoreCase("Hindi")){
            System.out.println("नमस्ते");
        } else if (country.equalsIgnoreCase("Germany")) {
            System.out.println("Halo");
        } else if (country.equalsIgnoreCase("Russian")) {
            System.out.println("привет");
        }
    }

    public static void main(String[] args) { //Object
        Task1 obj=new Task1();
        obj.println("Mexico");
    }
}
