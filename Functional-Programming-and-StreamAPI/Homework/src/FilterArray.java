import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;
import java.util.stream.Collectors;


/**
 * Created by vb on 4.4.2016 г..
 */
public class FilterArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter number(Desired min Lenght):");
       int  desireMinLenght= console.nextInt();
        System.out.print("Enter text:");
      console=new Scanner(System.in);
       String[] input = console.nextLine().split(" ");

       Arrays.stream(input)
                .filter(s->s.length()>=desireMinLenght).map(s->s+=" ").forEach(System.out::print);




    }

}
