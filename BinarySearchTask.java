import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();

        int result = Arrays.binarySearch(arr, key);

        if (result >= 0)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found");
    }
}