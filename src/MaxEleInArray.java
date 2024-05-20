import java.util.Scanner;

public class MaxEleInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in array: ");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Max element in array : "+maxElement(arr));
    }

    static int maxElement(int[] arr) {
        int max = 0;
        for (int i=0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

}
