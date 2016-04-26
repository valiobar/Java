import java.util.*;

/**
 * Created by vb on 28.3.2016 г..
 */
public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter strings separated bu space:");
        String[] input = console.nextLine().split(" ");

        ArrayList<String> seq= new ArrayList<>();
       seq.add(input[0]);
        for (int i = 0; i <input.length-1 ; i++) {
           if (input[i].equals(input[i+1])){
               seq.add(input[i+1]);
           }else {
               for (String s : seq) {
                   System.out.print(s+" ");}
               System.out.println();
               seq.clear();
               seq.add(input[i+1]);
           }

        }
        for (String s : seq) {
            System.out.print(s+" ");
        }
    }
}
