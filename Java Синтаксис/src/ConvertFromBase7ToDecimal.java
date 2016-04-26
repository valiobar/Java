import java.util.Scanner;

/**
 * Created by vb on 21.3.2016 г..
 */
public class ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter base 7 number:");
        String[] input = console.nextLine().split("");
        int decimalNumber = 0;
        for (int i = input.length - 1, j = 0; i > -1; i--, j++) {
            decimalNumber += Integer.parseInt(input[i]) * Math.pow(7, j);
        }
        System.out.print(decimalNumber);
    }
}
