import java.util.Scanner;

/**
 * Created by vb on 19.3.2016 г..
 */
public class CalculateExpression {
    private static float[] CalculateExpresions(float a ,float b, float c){
        float[] results=new float[2];
        float f1=(float) Math.pow(((a*a+b*b)/(a*a-b*b)),(a+b+c)/Math.pow(c,0.5));
        float f2=(float) Math.pow((a*a+b*b-c*c*c),(a-b));
        results[0]=f1;
        results[1]=f2;
        return results;
    }
private static float CalculateDifference(float[] numbers,float[] results){
    float sum =0;
    for (float n:numbers) {
        sum+=n;
    }
float numbersAverage=sum/numbers.length;
    sum=0;
    for (float n:results) {
        sum+=n;
    }
    float resultsAverage=sum/results.length;
    return numbersAverage-resultsAverage;
}

    public static void main(String[] args) {
        System.out.print("Enter float numbers separated by ,:");
        Scanner scanner =new Scanner(System.in);
        String[] input = scanner.nextLine().split(",");
        float a =Float.parseFloat(input[0]);
        float b =Float.parseFloat(input[1]);
        float c =Float.parseFloat(input[2]);
        float[] numbers=new float[]{a,b,c};
       float[] results= CalculateExpresions(a,b,c);
        System.out.printf("%.2f",Math.abs(CalculateDifference(numbers,results)));
    }
}
