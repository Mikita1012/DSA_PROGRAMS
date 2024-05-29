public class CheckIfAnArrayIsSorted {
    static boolean arraySortedOrNot(int[] arr) {
        int left=0, n = arr.length, right = n - 1;
        while (left < right) {
            if(arr[left] > arr[right]) {
                return false;
            } else {
                if(left != 0 && right != n-1 && (arr[left] < arr[left-1] || arr[right] > arr[right+1])) {
                    return false;
                }
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 20, 23, 23, 45, 78, 88 };
        int nums[] = { 20, 20, 78, 98, 99, 97 };

        if (arraySortedOrNot(nums)) {
            System.out.print("Yes\n");
        } else {
            System.out.print("No\n");
        }

    }

}
