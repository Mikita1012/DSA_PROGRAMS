import java.util.Scanner;

public class SumOfDigitGiven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of - ");
            int digit = sc.nextInt();
            System.out.println("Sum of given number is: "+sumOfDigit(digit));


    }

    static int sumOfDigit(int n) {

        int sum= 0;
        while (n != 0) {
            sum = sum + n%10; //N%10 GIVING REMAINDER 1 + 2
            n = n/10; // N/10 GIVEN QUOTIENT  n = 121/10 - 10
        }
        return sum;
    }
}
