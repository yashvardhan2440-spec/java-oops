class Vehicle {
    private int numberOfTyres;
    private String engineNo;
    private String bodyColor;
    private String RTOName;

    static int count = 0;

    Vehicle(int numberOfTyres, String engineNo, String bodyColor) {
        this.numberOfTyres = numberOfTyres;
        this.engineNo = engineNo;
        this.bodyColor = bodyColor;
        count++;
    }

    {
        RTOName = "Ahmedabad";
    }

    public void setRTOName(String RTOName) {
        this.RTOName = RTOName;
    }

    public String getRTOName() {
        return this.RTOName;
    }

    public String toString() {
        return "Number of Tyres: " + this.numberOfTyres +
               "\nEngine No: " + this.engineNo +
               "\nBody Color: " + this.bodyColor +
               "\nRTO Name: " + this.RTOName +
               "\nTotal Objects Created: " + count;
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle(4, "EN101", "Red");
        Vehicle v2 = new Vehicle(4, "EN102", "Blue");
        Vehicle v3 = new Vehicle(2, "EN103", "Black");

        v1.setRTOName("Mumbai");
        v2.setRTOName("Delhi");

        System.out.println("\nObject 1:");
        System.out.println(v1.toString());

        System.out.println("\nObject 2:");
        System.out.println(v2.toString());

        System.out.println("\nObject 3:");
        System.out.println(v3.toString());
    }
}