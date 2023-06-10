package class28;

import java.util.Scanner;

public class Task1 {
      /*
     Create a method to check age eligibility that
     will throw a runtime exception. Method should
     throw an exception age is less than 16.
     */
    public static void ageEligibility() {  //method
        Scanner scanner = new Scanner(System.in);

        try {
            int age = scanner.nextInt();
            if(age<16) {
                throw new RuntimeException();
            }else {
                System.out.println("You are eligible");
            }
        } catch (RuntimeException e){
            System.out.println("Exception: Age is less than 16");
        }

    }
    public static void main(String[] args) {
            // to print data of ageEligibility method
        ageEligibility();
    }
}
