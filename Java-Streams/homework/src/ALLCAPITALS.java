import java.io.*;

/**
 * Created by vb on 27.3.2016 г..
 */
public class ALLCAPITALS {
    public static void main(String[] args) {

       StringBuilder allCapitals=new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("lines.txt"))){
            String line;
            while ((line=reader.readLine())!= null){
                allCapitals.append(line.toUpperCase()+'\n');
            }
        }
        catch (IOException ioex){
            System.out.print(ioex);
        }
try (PrintWriter writer=new PrintWriter(new FileWriter("capitals.txt"))){
    writer.write(allCapitals.toString());
}
 catch (IOException ex){
     System.out.print(ex);
 }
    }
}
