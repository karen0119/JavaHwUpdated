package class25;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Insurance {
    /*
    Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour
    as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health.
    Car class has its own attribute as carModel and Class Pet has petType attribute.
    Create 3 objects of the subclasses and store them in ArrayList.
    Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    String insuranceName;
    abstract void getQuote();
    abstract void cancelInsurance();

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }


}
class Car extends Insurance{
    String carModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    void getQuote() {
        System.out.println("Our offer for your car '"+carModel+"' insurance -"+insuranceName);
    }

    @Override
    void cancelInsurance() {
        System.out.println("Unfortunately, we do not have an offer for your car -"+carModel);

    }
}
class Pet extends Insurance{
    String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    public void getQuote() {
        System.out.println("Our offer for your pet '"+petType+"' insurance -"+insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Unfortunately, we do not have an offer for your car -"+petType);
    }
}
class Health extends Insurance{
    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println("Our offer for your health insurance  -"+insuranceName);
    }

    @Override
    void cancelInsurance() {
        System.out.println("Unfortunately, we do not have an offer for health insurance ");
    }
}
class Test {
    public static void main(String[] args) {
        ArrayList<Insurance> ins=new ArrayList<>();
        Car car1=new Car("Comprehensive Car Insurance","Toyota");
        Pet pet1=new Pet("Dog Doctor","Dog");
        Health h=new Health("Premium Health Insurance");
        ins.add(car1);
        ins.add(pet1);
        ins.add(h);

        for (Insurance c : ins) {
            c.getQuote();
            c.cancelInsurance();
            System.out.println("-------------------------------");
        }
        for (int i = 0; i < ins.size(); i++) {
            ins.get(i).getQuote();
            ins.get(i).cancelInsurance();
            System.out.println("-------------------------------");
        }

        Iterator<Insurance> iterator= ins.iterator();

        for (int i = 0; iterator.hasNext(); i++) {
            Insurance a=iterator.next();
            a.getQuote();
            a.cancelInsurance();
            System.out.println("-------------------------------");
        }




    }
}