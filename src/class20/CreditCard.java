package class20;

public class CreditCard {
     /*
Create a class CreditCard and define variable balance and interest.
Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */

    double balance;
    double interest;
    double currentInterest;

    public double calculateInterest(double balance, double interest) {
        currentInterest = balance * (interest);
        return currentInterest;
    }

}

class Visa extends CreditCard {

}

class AX extends CreditCard {
    @Override
    public double calculateInterest(double balance, double interest) {
        currentInterest = balance * (interest);
        return currentInterest;
    }
}
class CreditCardTester {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        System.out.println(creditCard.calculateInterest(300, 0.35)); //105.0

        Visa visa = new Visa();
        System.out.println(visa.calculateInterest(100, 0.5)); //50.0


        AX ax = new AX();
        System.out.println(ax.calculateInterest(2000, 4.5)); //9000.0


    }

}