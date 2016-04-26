import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by vb on 6.4.2016 г..
 */
public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = console.nextLine().toLowerCase();
        System.out.print("Enter search string: ");
        console=new Scanner(System.in);
        String searchString = console.nextLine().toLowerCase();
        Pattern pattern = Pattern.compile("\\W?"+searchString+"\\W");
        Matcher match = pattern.matcher(text);
        int count =0;
        while (match.find()){
            count++;
        }
        System.out.println(count);
    }
}
