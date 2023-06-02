package class25;

import java.util.Iterator;
import java.util.LinkedList;

public class Card {
    /*
   Create a Card class that will have interest rate field and card type
 and a constructor that will initialize the fields.
 Create 3 objects of different card and store them into LinkedList.
 Using for loop/advanced for loop/ iterator access all methods of the class.
    */
    int interestRate;
    String cardType;

    public Card(int interestRate, String cardType) {
        this.interestRate = interestRate;
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "interestRate=" + interestRate + ", cardType='" + cardType + "'";
    }

    public static void main(String[] args) {
        LinkedList<Card> card=new LinkedList<>();
        card.add(new Card(2,"Mastercard"));
        card.add(new Card(4,"Visa"));
        card.add(new Card(5,"American Express"));
        card.add(new Card(1,"Discover"));

        for (int i = 0; i < card.size(); i++) {
            System.out.println(card.get(i));
        }
        System.out.println("************************************");
        for (Card c : card) {
            System.out.println(c);
        }
        System.out.println("************************************");
        Iterator<Card> iterator=card.iterator();
        for (int i = 0; iterator.hasNext() ; i++) {
            System.out.println(iterator.next());
        }

    }
}
