import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.*;

/**
 * Created by vb on 4.4.2016 г..
 */
public class SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Eneter integer array: " );
        Integer[] input =  Arrays.stream(console.nextLine().split(" ")).mapToInt(Integer::parseInt)
                .sorted()
                .boxed().toArray(Integer[]::new );

        System.out.print("Eneter sorting order : " );
        console = new Scanner(System.in);
        if (console.nextLine().equals("Ascending")){
            for (int i : input) {
                System.out.print(i+ " ");
            }
        }
            else{

            Collections.reverse(Arrays.asList(input));
            for (int i : input) {
                System.out.print(i+ " ");
            }
            }



    }

}
