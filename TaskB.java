import java.util.Scanner;

public class TaskB{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for (int i=0;i<10;i++){
            a[i] = sc.nextInt();
        }
        int sum=0,pro=1,larg=a[0],small=a[0];
        for (int i=0;i<10;i++){
            sum += a[i];
            pro *= a[i];
            if (larg < a[i]){
                larg = a[i];
            }
            if (small > a[i]){
                small = a[i];
            }
        }
        double avg = sum/10;

        System.out.println("Sum : "+ sum);
        System.out.println("Product : "+ pro);
        System.out.println("Average : "+ avg);
        System.out.println("Largest Number : "+ larg);
        System.out.println("Smallest Number : "+ small);


        System.out.println("\n\n----Even Numbers----");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("\n\n---Odd Numbers---");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}