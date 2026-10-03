public class Main {

    public static void main(String[] args) {

        // Math class

        System.out.println("Math Methods:");

        System.out.println("sqrt(25) = " + Math.sqrt(25));
        System.out.println("abs(-10) = " + Math.abs(-10));
        System.out.println("min(10, 20) = " + Math.min(10, 20));
        System.out.println("max(10, 20) = " + Math.max(10, 20));
        System.out.println("round(5.7) = " + Math.round(5.7));


        // String class

        String str = "Hello Java";

        System.out.println("\nString Methods:");

        System.out.println("length() = " + str.length());
        System.out.println("charAt(1) = " + str.charAt(1));
        System.out.println("substring(6) = " + str.substring(6));
        System.out.println("substring(0, 5) = " + str.substring(0, 5));
        System.out.println("equals() = " + str.equals("Hello Java"));
        System.out.println("equalsIgnoreCase() = " + str.equalsIgnoreCase("hello java"));
        System.out.println("compareTo() = " + str.compareTo("Hello Java"));
        System.out.println("contains() = " + str.contains("Java"));
        System.out.println("indexOf() = " + str.indexOf("Java"));
    }
}