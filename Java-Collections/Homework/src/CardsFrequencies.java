import java.util.*;

/**
 * Created by vb on 29.3.2016 г..
 */
public class CardsFrequencies {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter card: ");
        String[] cards = console.nextLine().split("\\W+");
        double cardCount = cards.length;
        LinkedHashMap<String, Double> wordCount = new LinkedHashMap<>();
        for (String card : cards) {
            int count = 0;
            for (String allCard : cards) {
                if (card.equals(allCard)) {
                    count++;
                }
            }
            if (!wordCount.containsKey(card)) {
                wordCount.put(card, (count / cardCount) * 100);
            }

        }
        for (String cardFace : wordCount.keySet()) {
            System.out.printf("%s -> %.2f%s %n", cardFace, wordCount.get(cardFace), "%");
        }
    }

}
