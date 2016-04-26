import java.util.*;

/**
 * Created by vb on 29.3.2016 г..
 */
public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter text: ");
        String[] allWords = console.nextLine().toLowerCase().split("\\W+");
        TreeMap<Integer,TreeSet<String>> wordCount = new  TreeMap<>(Collections.reverseOrder());
        for (String word : allWords) {
            int count=0;
            for (String allWord : allWords) {
                if (word.equals(allWord)){
                    count++;
                }
            }
       if (!wordCount.containsKey(count)){
           wordCount.put(count,new TreeSet<>());
       }
          wordCount.get(count).add(word);
        }
        for (String s : wordCount.firstEntry().getValue()) {
            System.out.printf("%s -> %d times%n",s,wordCount.firstEntry().getKey());
        }
    }
}
