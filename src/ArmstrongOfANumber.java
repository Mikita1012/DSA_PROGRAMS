import java.util.Scanner;

public class ArmstrongOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value you want to check is AMSTRONG. ");
        int n = sc.nextInt();
        if (checkArmstrong(n))
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");

    }

    static boolean checkArmstrong(int n) {
        int temp, digits=0, last=0, sum=0;
//        assigning n into a temp variable
        temp = n; //153

//        loop execute until the condition becomes false
        while (temp > 0) {
            temp = temp/10; //153/10 = 15/10 = 1 1/10 = 00
            digits++; //1 2 3
        }
        temp = n;  //153
        while (temp > 0) {
//            determines the last dogit from the number
            last = temp % 10; //3 5
//            calculates the power of a number up to digit times and add the resultant to the sum variable
            sum += (Math.pow(last, digits)); //9 125
            temp = temp / 10; //15 1
        }

//        compares the sum with n
        if (n == sum) {
            return true;
        } else {
            return false;
        }
    }


}
