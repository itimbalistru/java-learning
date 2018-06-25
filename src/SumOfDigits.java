import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter a number:");
        n = scan.nextInt();
        if (n <= 0) {
            System.out.println("Integer you have entered is not positive.");
        } else {
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            System.out.println("Sum of digits: " + sum);
        }
    }
}