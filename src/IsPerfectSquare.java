import java.util.Scanner;

public class IsPerfectSquare {
    static boolean checkIfSquare(int x) {
        if (x >= 0) {
            int sr = (int)Math.sqrt(x);
            return ((sr * sr) == x);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you want to check is PERFECT SQUARE ?");
        int n = scan.nextInt();

            if(checkIfSquare(n)) {
                System.out.println(n+" is a PERFECT SQAURE");
            } else {
                System.out.println("is NOT A PERFECT SQAURE");
            }

    }
}
