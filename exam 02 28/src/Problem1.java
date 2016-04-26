import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by vb on 22.4.2016 г..
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] resourceField = console.nextLine().split(" ");

        int paths = console.nextInt();
        int maxCollect = 0;
        for (int i = 0; i < paths; i++) {
            ArrayList<Integer>colectedIndex=new ArrayList<>();
            int collected = 0;
            int start = console.nextInt();
            int step = console.nextInt();
            while (true) {
                String[] res = resourceField[start % resourceField.length].split("_");
               if (colectedIndex.contains(start % resourceField.length)){
                   if (collected > maxCollect) {
                       maxCollect = collected;
                   }
                   break;
               }else if (res[0].equals("stone")|| res[0].equals("gold")|| res[0].equals("food")  || res[0].equals("wood")){

                   if(res.length==1){
                       collected+=1;
                   }else {
                       collected += Integer.parseInt(res[1]);
                   }
                    colectedIndex.add(start % resourceField.length);
                }
                start += step;
            }


        }
        System.out.print(maxCollect);
    }}


