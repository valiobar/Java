import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by vb on 29.3.2016 г..
 */
public class CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter first character  sequence separated by space:");
        ArrayList<Character> firstList= new ArrayList<Character>();
        ArrayList<Character> buffer =new ArrayList<>();
        for (char c : console.nextLine().toCharArray()) {
            firstList.add(c);
        }
        System.out.print("Enter second character  sequence separated by space:");
        ArrayList<Character> secondList= new ArrayList<Character>();
        for (char c : console.nextLine().toCharArray()) {
            secondList.add(c);
        }
        for (Character character : secondList) {
            if (!firstList.contains(character)){
                buffer.add(character);
            }
        }
        firstList.addAll(buffer);
        for (Character character : firstList) {
            System.out.print(character+" ");
        }
    }
}
