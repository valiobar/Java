import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by vb on 27.3.2016 г..
 */
public class CopyJpg {
    public static void main(String[] args)
    {
        FileInputStream instream = null;
        FileOutputStream outstream = null;

        try{

            File outfile =new File("my-copied-picture.jpg");

            instream = new FileInputStream("picture.jpg");
            outstream = new FileOutputStream(outfile);

            byte[] buffer = new byte[1024];

            int length;
            while ((length = instream.read(buffer)) > 0){
                outstream.write(buffer, 0, length);
            }
            instream.close();
            outstream.close();

            System.out.println("File copied successfully!!");

        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
