import java.util.Scanner;

/**
 * Created by vb on 19.3.2016 г..
 */
public class ConvertFromDecimalSystemToBase7 {
    public static void main(String[] args) {
        System.out.print("Enter decimal system number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.printf("%s",Integer.toString(number,7));
    }
}
