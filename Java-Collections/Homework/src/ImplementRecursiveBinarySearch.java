import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by vb on 29.3.2016 г..
 */
public class ImplementRecursiveBinarySearch {
    public static void main(String[] args) {

        System.out.print("Enter target number : ");
        Scanner console = new Scanner(System.in);
        int targetNumber = console.nextInt();
        System.out.print("Enter number separated by space: ");
        console = new Scanner(System.in);
        String[] input = console.nextLine().split(" ");
        int[] numbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        int result = binarySearch(numbers, 0, numbers.length - 1, targetNumber);
        System.out.print(result);
    }

    public static int binarySearch(int[] array, int start, int end, int targetNumber) {
        int middle = (start + end) / 2;
        if (end < start) {
            return -1;
        }

        if (targetNumber == array[middle]) {
            return middle;
        } else if (targetNumber < array[middle]) {
            return binarySearch(array, start, middle - 1, targetNumber);
        } else {
            return binarySearch(array, middle + 1, end, targetNumber);
        }
    }


}
