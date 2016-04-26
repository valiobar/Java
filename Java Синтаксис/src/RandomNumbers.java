import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by vb on 19.3.2016 г..
 */
public class RandomNumbers {
    public static ArrayList<Integer> randInt(int n, int m) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Random rand = new Random();

        while (result.size() < Math.abs(m - n) + 1) {
            int randomNum = rand.nextInt(Math.abs(n - m) + 1) + Math.min(n, m);
            if (!result.contains(randomNum)) {
                result.add(randomNum);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number :");
        int n = scanner.nextInt();
        System.out.print("Enter Second number :");
        int m = scanner.nextInt();
       ArrayList<Integer> randomNumber=randInt(n,m);
        for (int r :randomNumber
             ) {
           System.out.print(r+" ");
        }


    }
}
