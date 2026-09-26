import java.util.*;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result[] = new int[n];
        for (int i = 0; i < n; i++) {
            int k = (int) (arr[i] *0.1) ;
            result[i] = k + arr[i];
        }
        for(int h : result){
            System.out.print(" "+h);
        }
    }
}
