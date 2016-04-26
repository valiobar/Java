import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by vb on 28.3.2016 г..
 */
public class ZipArchive {
    public static void main(String[] args) {

File zipped= new File("text-files.zip");
        File[] files = new File[]{new File("lines.txt") , new File("words.txt"),new File("picture.jpg")};
        for (File file : files) {

            String zipEntryName = file.getPath();

            ZipEntry zipEntry = new ZipEntry(zipEntryName);
            try (FileInputStream inputStream = new FileInputStream(file)) {
                try (ZipOutputStream zipStream = new ZipOutputStream(new FileOutputStream(zipped,true))) {


                    zipStream.putNextEntry(zipEntry);
                    byte[] buffer = new byte[1024];

                    int length;

                    while ((length = inputStream.read(buffer)) > 0){
                        zipStream.write(buffer, 0, length);}
                    zipStream.closeEntry();

                }
            } catch (IOException ioex) {
                System.out.print(ioex);
            }

        }



}
}
