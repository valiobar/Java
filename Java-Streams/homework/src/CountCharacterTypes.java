import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by vb on 27.3.2016 г..
 */
public class CountCharacterTypes {
    public static void main(String[] args) {
        Character[] punctuations = new Character[]{'!', ',', '.', '?' };
        Character[] vowels = new Character[]{'a', 'e', 'i', 'o', 'u' };
        int vowelsCount = 0;
        int punctuationCount = 0;
        int consonantsCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("words.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (Character ch : line.toLowerCase().toCharArray()) {
                    if (ch >= 97 && ch <= 122) {
                        boolean isVowel = false;
                        for (Character vowel : vowels) {

                            if (vowel.equals(ch)) {
                                isVowel = true;
                            }

                        }
                        if (isVowel) {
                            vowelsCount++;
                        } else {
                            consonantsCount++;
                        }
                    } else {
                        for (Character punc : punctuations) {
                            if (punc.equals(ch)) {
                                punctuationCount++;

                            }
                        }
                    }
                }
            }
        } catch (IOException ioex) {
            System.out.print(ioex);
        }
        System.out.println("Vowels:" + vowelsCount);
        System.out.println("Consonants:" + consonantsCount);
        System.out.println("Punctuation::" + punctuationCount);
    }
}
