import java.util.Scanner;

/**
 * Created by vb on 30.3.2016 г..
 */
public class StuckNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        String[] numbers = new String[n];
        for (int i = 0; i <n ; i++) {
            numbers[i]=console.next();
        }
    String[] combination = new String[4];
        generateCombinations(numbers,0,0,combination);
    }
private static void generateCombinations(String[] numbers,int index,int startindex,String[] combination){
    if (index >= combination.length) {
        checkCombination(combination);

    }
    else
    {
        for (int i = startindex; i <numbers.length; i++)
        {
            combination[index] = numbers[i];
            generateCombinations(numbers, index + 1,startindex+1, combination);
        }
    }
}
    private static void checkCombination(String[] combination){

    String firstPair = combination[0]+combination[1];
    String secondPair=  combination[2]+combination[3];
    if (firstPair.equals(secondPair)){
        System.out.printf("%s|%s==%s|%s%n",combination[0],combination[1],combination[2],combination[3]);
    }
}
}
