class Distance {
    private int feet;
    private int inches;

    Distance() {
        this(5);
    }

    Distance(int feet) {
        this.feet = feet;
        this.inches = 5;
    }

    Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    Distance(Distance d) {
        this.feet = d.feet;
        this.inches = d.inches;
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
        return this.feet + " feet " + this.inches + " inches";
    }
}

public class Feet{
    public static void main(String[] args) {

        Distance d1 = new Distance();
        Distance d2 = new Distance(10);
        Distance d3 = new Distance(10, 5);
        Distance d4 = new Distance(d3);

        System.out.println("Default Constructor: " + d1);
        System.out.println("One Argument Constructor: " + d2);
        System.out.println("Two Argument Constructor: " + d3);
        System.out.println("Copy Constructor: " + d4);
    }
}
