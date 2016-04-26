import io.netty.util.internal.StringUtil;

import java.util.Scanner;

/**
 * Created by vb on 19.3.2016 г..
 */
public class FormattingNumbers {
    public static void main(String[] args) {
        System.out.print("Enter numbers in format(a,b,c):");
        Scanner scnner = new Scanner(System.in);
        String[] input = scnner.nextLine().split(",");
        int a = Integer.parseInt(input[0]);
        float b = Float.parseFloat(input[1]);
        float c = Float.parseFloat(input[2]);
        System.out.printf("|%-10X|%010d|%10.2f|%-10.3f|", a,
                Integer.parseInt(Integer.toBinaryString(a)), b, c);
    }
}
