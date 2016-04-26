
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by vb on 21.3.2016 г..
 */
public class CharacterMultiplier {
    private static int multiplyCharacter(String[] input) {
      int sum=0;
        String longer;
        String shorter ;
        int diff= input[0].length()-input[1].length();
        if (diff>0) {
        longer = input[0];
            shorter =input[1];
        }
        else{
            longer=input[1];
            shorter=input[0];
        }
        for (int i = 0; i <shorter.length() ; i++) {
            sum+=shorter.charAt(i)*longer.charAt(i);
        }
if (diff!=0){
    for (int i =longer.length()-Math.abs(diff); i <longer.length() ; i++) {
        sum += longer.charAt(i);
    }
}
  return sum;
   }

    public static void main(String[] args) {
        System.out.print("Enter two strings:");
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split(" ");
        int result = multiplyCharacter(input);
        System.out.println(result);
    }
}
