import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by vb on 6.4.2016 г..
 */
public class CountAllWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter text: ");
       String[] input = console.nextLine().split("\\W+");
        System.out.print(input.length);
    }
}
