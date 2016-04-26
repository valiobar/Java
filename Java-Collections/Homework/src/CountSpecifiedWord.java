import java.util.Scanner;

/**
 * Created by vb on 28.3.2016 г..
 */
public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter string:");
        String[] input = console.nextLine().toLowerCase().split("\\W+");
        System.out.print("Enter word:");
        String word =console.next().toLowerCase();
       int count=0;
        for (String s : input) {
            if (s.equals(word)){
                count++;
            }
        }
  System.out.print(count);
    }
}
