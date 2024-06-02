import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 1000: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 1000) {
            System.out.println("Error: The number must be between 0 and 1000.");
        } else {
            int sum = 0;
            int temp = number;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            System.out.println("The sum of all digits in " + number + " is " + sum);
        }
        scanner.close();
    }
}
