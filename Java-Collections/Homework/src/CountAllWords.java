import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by vb on 28.3.2016 г..
 */
public class CountAllWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter string:");
        String[] input = console.nextLine().split("\\W+");
        System.out.print(input.length);

        }
    }

