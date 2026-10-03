public class Main {

    static void checkNumber(int num) {
        if (num % 2 != 0) {
            throw new NumberFormatException("Number is odd");
        }

        System.out.println("Number is even");
    }

    public static void main(String[] args) {

        try {
            checkNumber(7);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
