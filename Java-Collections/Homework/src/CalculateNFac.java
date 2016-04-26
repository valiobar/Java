import java.util.Scanner;

/**
 * Created by vb on 30.3.2016 г..
 */
public class CalculateNFac {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        int result = calculateFactorial(number);
        System.out.println(number + "!=" + result);
    }

    private static int calculateFactorial(int n) {
        int result;

        if (n == 1)
            return 1;

        result = calculateFactorial(n - 1) * n;
        return result;
    }
}
