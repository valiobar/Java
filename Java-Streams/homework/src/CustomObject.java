import java.io.Serializable;

/**
 * Created by vb on 28.3.2016 г..
 */
public class CustomObject implements Serializable{
    public String Name;
    public int NumberStudents;

    public CustomObject(String name,int numberStudents){
        this.Name=name;
        this.NumberStudents =numberStudents;
    }
}
