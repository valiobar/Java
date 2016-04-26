import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by vb on 21.3.2016 г..
 */
public class GetFirstOddOrEvenElements {
    private static void getFirstOddOrEvenElements(){
        Scanner console=new Scanner(System.in);
        System.out.print("Enter numbers separated by space:");
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
       String[] input =console.nextLine().split(" ");
        for (String number:input) {
           int numberToAdd=Integer.parseInt(number);
            if (numberToAdd%2==0){
                evenNumbers.add(numberToAdd);
            }
            else {
                oddNumbers.add(numberToAdd);
            }
        }
    System.out.print("Enter command:");
     String[] command=console.nextLine().split(" ");
if (command[2].equals("even")){
    getFirstNNumbers(evenNumbers,Integer.parseInt(command[1]) );
}
  else{
    getFirstNNumbers(oddNumbers,Integer.parseInt(command[1]));
  }
    }
private static void getFirstNNumbers(ArrayList<Integer> sortedNumbers, int n){
    for (int i = 0; i <Math.min(sortedNumbers.size(),n) ; i++) {
        System.out.print(sortedNumbers.get(i)+" ");
    }
}

    public static void main(String[] args) {
        getFirstOddOrEvenElements();
    }
}
