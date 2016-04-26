import java.util.Scanner;

/**
 * Created by vb on 19.3.2016 г..
 */
public class RectangleArea {
    public static void main(String[] args) {
        System.out.print("Enter rectangle sides separated by space :");
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int width =Integer.parseInt( input[0]);
        int height = Integer.parseInt(input[1]);
        System.out.printf("Rectangle area:%s",width*height);

    }
}
