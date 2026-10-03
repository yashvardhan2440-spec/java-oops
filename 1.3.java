class Area {

    double findArea(double side) {
        return side * side;
    }

    double findArea(double length, double breadth) {
        return length * breadth;
    }

    double findArea(double base, double height, boolean triangle) {
        return 0.5 * base * height;
    }

    double findArea(double radius, char circle) {
        return Math.PI * radius * radius;
    }
}

public class AD {
    public static void main(String[] args) {

        Area a = new Area();

        System.out.println("Area of Square = " + a.findArea(5));
        System.out.println("Area of Rectangle = " + a.findArea(10, 5));
        System.out.println("Area of Triangle = " + a.findArea(10, 6, true));
        System.out.println("Area of Circle = " + a.findArea(7, 'c'));
    }
}