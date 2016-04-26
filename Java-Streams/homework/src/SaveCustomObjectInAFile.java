import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by vb on 27.3.2016 г..
 */
public class SaveCustomObjectInAFile {
    public static void main(String[] args) {
        CustomObject javaBasic = new CustomObject("JavaBasic", 300);
        CustomObject cSharpBasic = new CustomObject("CSharpBasic", 1800);
        CustomObject hcq = new CustomObject("HQC", 300);
        CustomObject cSharpAdvance = new CustomObject("cSharpAdvance", 1800);
        ArrayList<CustomObject> allCurses = new ArrayList<>();
        try (ObjectOutputStream fos = new ObjectOutputStream(new FileOutputStream("course.save"))) {
            fos.writeObject(javaBasic);
            fos.writeObject(cSharpBasic);
            fos.writeObject(hcq);
            fos.writeObject(cSharpAdvance);
        } catch (IOException ex) {
            System.out.print(ex);
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("course.save"))) {
            while (true) {
                allCurses.add((CustomObject) ois.readObject());

            }
        } catch (EOFException eofx) {
            for (CustomObject curse : allCurses) {
                System.out.println(String.format("Name : %s\n\rStudents: %d", curse.Name, curse.NumberStudents));
            }
        } catch (IOException ex) {
            System.out.print(ex);
        } catch (ClassNotFoundException cnfex) {
            System.out.print("cnfex");
        }

    }
}

