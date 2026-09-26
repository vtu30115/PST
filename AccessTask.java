import java.util.Scanner;
import java.util.stream.IntStream;

public class AccessTask {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter the index: ");
        int index = sc.nextInt();

        IntStream.range(0, arr.length)
                 .filter(i -> i == index)
                 .map(i -> arr[i])
                 .findFirst()
                 .ifPresentOrElse(
                     value -> System.out.println("Element at index " + index + " is: " + value),
                     () -> System.out.println("Invalid Index!")
                 );

        sc.close();
    }
}