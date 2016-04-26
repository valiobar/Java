import java.util.Scanner;

/**
 * Created by vb on 21.3.2016 г..
 */
public class HitTheTarget {
    private static void findPairs(int desireSum) {
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == desireSum) {
                    System.out.printf("%d+%d=%d\n\r", i, j, desireSum);
                }
                if (i - j == desireSum) {
                    System.out.printf("%d-%d=%d\n\r", i, j, desireSum);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter desired sum :");
        Scanner console = new Scanner(System.in);
        int desireSum=console.nextInt();
        findPairs(desireSum);
    }
}
