import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by vb on 27.3.2016 г..
 */
public class SaveAnArrayListOfDoubles {
    public static void main(String[] args) {
        ArrayList<Double>doubles =new ArrayList<>();
        System.out.print("Enter doubles separated by space:");
        Scanner console = new Scanner(System.in);
        String[] line =console.nextLine().split(" ");
        for (String s : line) {
            doubles.add(Double.parseDouble(s));
        }

       try(ObjectOutputStream fos = new ObjectOutputStream(new FileOutputStream("doubles.list"))){
fos.writeObject(doubles);
       }
     catch (IOException ex){
    System.out.print(ex);
}
  try(ObjectInputStream ois =new ObjectInputStream(new FileInputStream("doubles.list"))){
      for (Double num : (ArrayList<Double>)ois.readObject()) {
          System.out.println(num);
      }
  }
   catch (IOException ex){
       System.out.print(ex);
   }
        catch (ClassNotFoundException cnfex){
            System.out.print(cnfex);
        }
    }
}
