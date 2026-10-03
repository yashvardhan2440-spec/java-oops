import java.util.Scanner;

class Distance {
    private int feet;
    private int inches;

    Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public int getFeet() {
        return this.feet;
    }

    public int getInches() {
        return this.inches;
    }

    public String toString() {
        return feet + " feet " + inches + " inches";
    }
}

public class DF{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter feet: ");
        int feet = sc.nextInt();

        System.out.print("Enter inches: ");
        int inches = sc.nextInt();

        Distance d = new Distance(feet, inches);

        System.out.println("Distance: " + d.toString());

        d.setFeet(10);
        d.setInches(6);

        System.out.println("Updated Distance: " + d.toString());
        System.out.println("Feet: " + d.getFeet());
        System.out.println("Inches: " + d.getInches());

        sc.close();
    }
}