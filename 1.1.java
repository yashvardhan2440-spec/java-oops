import java.util.Scanner;

public class Temperature{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] temp = new double[7];
        double sum = 0;
        
        System.out.println("enter the Temperatures: ");
        for (int i = 0; i < 7; i++) {
            temp[i] = sc.nextDouble();
            sum += temp[i];
        }

        double average = sum / 7;
        double highest = temp[0];
        double lowest = temp[0];

        for (int i = 1; i < 7; i++) {
            if (temp[i] > highest)
                highest = temp[i];

            if (temp[i] < lowest)
                lowest = temp[i];
        }

        int count = 0;

        for (int i = 0; i < 7; i++) {
            if (temp[i] > average)
                count++;
        }

        System.out.println("Average Temperature: " + average);
        System.out.println("Highest Temperature: " + highest);
        System.out.println("Lowest Temperature: " + lowest);
        System.out.println("Days above Average: " + count);

        sc.close();
    }
}