import java.util.Scanner;

public class Seggregate0_1_inArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Seggregate0_1_inArray seg = new Seggregate0_1_inArray();
        System.out.println("Please enter the number of elements you want in array: ");
        int n = scan.nextInt();
        System.out.println("Enter "+n+" elements consisting 0s and 1s");
        int[] array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Before segregation");
        for (int a: array) {
            System.out.print(a+" ");

        }
        seg.segregate(array, n);
        System.out.println("\n");
        System.out.println("Array after segregation");
        for (int a : array) {
            System.out.print(a + " ");
        }
    }

    void segregate(int[] array, int n) {
        int type0 = 0;
        int type1 = n - 1;

        while (type0 < type1) {
            if (array[type0] == 1) {
                if (array[type1] != 1) {
                    array[type1] = array[type1] + array[type0]; // = 0+1
                    array[type0] = array[type1] - array[type0]; // =1-1
                    array[type1] = array[type1] - array[type0]; // =1-0
                }
                type1--;
            } else {
                type0++;
            }
        }
    }
}