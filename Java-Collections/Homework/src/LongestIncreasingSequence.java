import java.util.*;

/**
 * Created by vb on 28.3.2016 г..
 */
public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter integers separated bu space:");
        String[] input = console.nextLine().split(" ");
        int[] inputNumbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
      ArrayList<ArrayList<Integer>> allSequences =new ArrayList<>();
        ArrayList<Integer> seq = new ArrayList<>();
        seq.add(inputNumbers[0]);
        for (int i = 0; i < inputNumbers.length - 1; i++) {
            if (inputNumbers[i]<inputNumbers[i + 1]) {
                seq.add(inputNumbers[i + 1]);
            } else {
                allSequences.add(new ArrayList<Integer>(seq));

                seq.clear();
                seq.add(inputNumbers[i + 1]);
            }
        }
        allSequences.add(new ArrayList<Integer>(seq));
        for (ArrayList en : allSequences) {
            for (Integer integer :(ArrayList<Integer>)en) {
                System.out.print(integer+" ");
            }
       System.out.println();
        }
        int max = 0;
        for (int i = 1; i < allSequences.size(); i++) {
            if (allSequences.get(i).size()>allSequences.get(max).size()){
                max=i;
            }
        }
        System.out.print("Longest : ");
        for (Integer integer : allSequences.get(max)) {
            System.out.print(integer+" ");

        }
    }
}
