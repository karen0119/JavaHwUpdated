package class21;
//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//Define common behavior within and some fields in parent class and override some methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array. Loop through each object and execute available methods.
public class Computer {
    double screenSize;
    String processor;
    String OS;

    public Computer(double screenSize, String processor, String OS) {
        this.screenSize = screenSize;
        this.processor = processor;
        this.OS = OS;
    }
    void printInfo() {
        System.out.println(screenSize + " inches, " + processor + " processor, " + OS);
    }
    void turnOn() {
        System.out.println("Turning on computer");
    }
}
class Apple extends Computer {

    public Apple(double screenSize, String processor, String OS) {
        super(screenSize, processor, OS);
    }
    @Override
    void turnOn() {
        System.out.println("Turning on Mac");
    }
}
class Lenovo extends Computer {

    public Lenovo(double screenSize, String processor, String OS) {
        super(screenSize, processor, OS);
    }
    void useTrackPoint() {
        System.out.println("Using the Lenovo TrackPoint");
    }
}
class HP extends Computer {

    public HP(double screenSize, String processor, String OS) {
        super(screenSize, processor, OS);
    }
}
class Dell extends Computer {

    public Dell(double screenSize, String processor, String OS) {
        super(screenSize, processor, OS);
    }
}
class ComputerTester {
    public static void main(String[] args) {
        Computer[] computers = {
                new Apple(10, "M1", "MacOS"),
                new Lenovo(11, "AMD", "Windows 11"),
                new HP(12, "ARM", "ChromeOS"),
                new Dell(13, "Intel", "Windows 11")
        };
        for (Computer computer : computers) {
            computer.printInfo();
            computer.turnOn();
            if (computer instanceof Lenovo) {
                ((Lenovo) computer).useTrackPoint();
            }
        }


    }
}
