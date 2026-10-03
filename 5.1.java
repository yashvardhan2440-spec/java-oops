import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter i: ");
        int i = sc.nextInt();

        System.out.print("Enter j: ");
        int j = sc.nextInt();

        try {
            int result = arr[i] / arr[j];
            System.out.println("Result = " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid array index.");
        }
    }
}