import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by vb on 21.3.2016 г..
 */
public class OddAndEvenPairs {
    private static void chaeckPairs(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i += 2) {
            if (numbers[i] % 2 == 0 && numbers[(i + 1)] % 2 == 0) {
                System.out.printf("%d,%d -> both are even", numbers[i], numbers[i + 1]);
                System.out.println();
            } else if (numbers[i] % 2 != 0 && numbers[(i + 1)] % 2 != 0) {
                System.out.printf("%d,%d -> both are odd", numbers[i], numbers[i + 1]);
                System.out.println();
            } else {
                System.out.printf("%d,%d -> different", numbers[i], numbers[i + 1]);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter numbers separated by space:");
        int[] numbers = new int[]{};
        String[] input = console.nextLine().split(" ");
        if (input.length % 2 != 0) {
            System.out.println("Invalid length");
        } else {
            numbers = Arrays.asList(input).stream().mapToInt(Integer::parseInt).toArray();
            chaeckPairs(numbers);
        }
    }
}
