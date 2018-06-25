import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        System.out.println("Enter the array lenght: ");
        Scanner scan = new Scanner(System.in);

        int[] arrayMinMax = new int[scan.nextInt()];
        System.out.println("Enter the data: ");
        for (int i = 0; i < arrayMinMax.length; i++) {
            arrayMinMax[i] = scan.nextInt();
        }

        double amount = 0;
        double average;

        for (int i = 0; i < arrayMinMax.length; i++) {
            amount += arrayMinMax[i];
        }

        System.out.println("The sum of the numbers is equals to: " + amount);

        average = amount / arrayMinMax.length;

        System.out.println("The number average is equal to: " + average);

        int max = arrayMinMax[0], min = arrayMinMax[0];

        for (int i = 0; i < arrayMinMax.length; i++) {
            if (arrayMinMax[i] > max) {
                max = arrayMinMax[i];
            }
            if (arrayMinMax[i] < min) {
                min = arrayMinMax[i];
            }
        }

        String minimum = "", maximum = "";

        for (int j = 0; j < arrayMinMax.length; j++) {
            if (arrayMinMax[j] < average) {
                minimum += " " + arrayMinMax[j];
            } else {
                maximum += " " + arrayMinMax[j];
            }
        }

        System.out.println("The minimum number is: " + min);
        System.out.println("The maximum number is: " + max);
        System.out.println("The smaller numbers as the average are:  " + minimum);
        System.out.println("The higher the average numbers are: " + maximum);
    }
}