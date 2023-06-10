package class28;

import java.util.Scanner;
/*
    Create a method checkUserName that will
    throw a runtime exception.
    Method should throw an exception
    when entered username is less than 5 characters.
  */
public class Task2 {
    public static void checkUserName() { //method
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter username");
            String name = scanner.nextLine();
            if (name.length()<5) {
                throw new RuntimeException();
            } else {
                System.out.println("Username is valid");
            }
        }
        catch (RuntimeException e) {
            System.out.println("Username is less than 5 characters");
        }
    }
    public static void main(String[] args) {
        // to print data of checkUserName method
        checkUserName();
    }
}
