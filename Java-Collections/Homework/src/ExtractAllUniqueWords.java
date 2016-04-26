import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

/**
 * Created by vb on 29.3.2016 г..
 */
public class ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter text: ");
        String[] allWords = console.nextLine().toLowerCase().split("\\W+");

        TreeSet<String> uniqueWords = new TreeSet<>();

        for (String word : allWords) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }

            for (String uniqueWord : uniqueWords) {
                System.out.print(uniqueWord + " ");
            }
        }
    }
}