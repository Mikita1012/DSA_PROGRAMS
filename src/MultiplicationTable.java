import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want nultiplication table : ");
        int n = sc.nextInt();
        multiplication(n);
    }

    static void multiplication(int n) {
        for (int i=1; i<=10; i++) {
            System.out.println(n+" * "+i+" = "+i*n);
        }
    }
}
