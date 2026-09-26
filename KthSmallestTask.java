import java.util.*;

public class KthSmallestTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Kth Value : ");
        int k = sc.nextInt();

        int kth = Arrays.stream(arr)
                        .sorted()
                        .skip(k - 1)
                        .findFirst()
                        .orElseThrow();

        System.out.println("Kth Smallest = " + kth);
    }
}