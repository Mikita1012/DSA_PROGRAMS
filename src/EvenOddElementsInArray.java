import java.util.Scanner;

public class EvenOddElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in an array -");
        int n = sc.nextInt();


        int[] arr = new int[n];
        System.out.println("Enter"+n+"numbers which you want in array");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        countEvenOdd(arr);
    }

    static void countEvenOdd(int[] arr) {
        int even=0;
        int odd=0;
        for(int i=0; i< arr.length; i++) {
            if(arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even elements in array: "+even);
        System.out.println("Odd elements in array: "+odd);
    }


}
