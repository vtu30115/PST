import java.util.*;
public class TaskA
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for(int i =0;i<10;i++){
            a[i] = sc.nextInt();
        }
        int h=0,b=0,l=0;
        int tm=0;
        int max = a[0];
        int min=a[0];
        
        for(int i =0;i<10;i++){
            if (max<a[i]){
                max = a[i];
            }
            if (min > a[i]){
                min = a[i];
            }
            tm += a[i];
            if (a[i]>75){
                h+=1;
            }
            else if (75 > a[i] && a[i] >= 50){
                b+=1;
            }
            else{
                l+=1;
            }
        }
        int avg = tm/10;
        
        System.out.println("Highest Value : " + max);
        System.out.println("Lowest Value : " + min);
        System.out.println("Average : " + avg);
        System.out.println("Students above 75 : " + h);
        System.out.println("Students between  75 and 50 : " + b);
        System.out.println("Students below 50 : " + l);
        
    }
}