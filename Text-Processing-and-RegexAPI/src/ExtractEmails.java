import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by vb on 6.4.2016 г..
 */
public class ExtractEmails {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = console.nextLine();
        Pattern pattern = Pattern.compile("[\\w\\.]+@[\\w]+[\\w\\.]+[\\w]+");
        Matcher match = pattern.matcher(text);
        while (match.find()){
            System.out.println(match.group());
        }
    }
}
