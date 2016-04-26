import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by vb on 28.3.2016 г..
 */
public class SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = console.nextInt();
    int[] numbers= new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i]=console.nextInt();
        }
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.print(number+" ");
        }
    }
}
