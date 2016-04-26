import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by vb on 27.3.2016 г..
 */
public class SumLines {
    public static void main(String[] args) {

      try (BufferedReader reader = new BufferedReader(new FileReader("lines.txt"))){
          String line;
          while ((line=reader.readLine())!= null){
              int sum =0;
              for (char s : line.toCharArray()) {
                  sum+=s;
              }
         System.out.println(sum);
          }
      }
  catch (IOException ioex){
      System.out.print(ioex);
  }

    }

}
